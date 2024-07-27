package com.anthonyhilyard.legendarytooltips.forge.client;

import com.anthonyhilyard.legendarytooltips.LegendaryTooltips;

import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = LegendaryTooltips.MODID, bus = Bus.MOD)
public class LegendaryTooltipsForgeClient
{
	@SubscribeEvent(priority = EventPriority.HIGH)
	public static void onClientSetup(FMLClientSetupEvent event)
	{
	}
}
