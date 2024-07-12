package com.anthonyhilyard.legendarytooltips.fabric.mixin;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Optional;

import mezz.jei.fabric.platform.RenderHelper;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.anthonyhilyard.legendarytooltips.LegendaryTooltips;

import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.inventory.tooltip.TooltipComponent;
import net.minecraft.world.item.ItemStack;

@Mixin(RenderHelper.class)
public class JustEnoughItemsRenderHelperMixin
{
	@Inject(method = "renderTooltip", at = @At(value = "HEAD"), require = 0)
	private void setHoverStack(Screen screen,
		GuiGraphics guiGraphics,
		List<Component> textComponents,
		Optional<TooltipComponent> tooltipComponent,
		int x,
		int y,
		Font font,
		ItemStack itemStack, CallbackInfo info)
	{
		try
		{
			Field tooltipStackField = GuiGraphics.class.getDeclaredField("icebergTooltipStack");
			tooltipStackField.setAccessible(true);

			tooltipStackField.set(guiGraphics, itemStack);
		}
		catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e)
		{
			LegendaryTooltips.LOGGER.error(ExceptionUtils.getStackTrace(e));
		}
	}
}
