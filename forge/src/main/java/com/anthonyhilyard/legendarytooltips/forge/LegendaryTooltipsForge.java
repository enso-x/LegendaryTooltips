package com.anthonyhilyard.legendarytooltips.forge;

import com.anthonyhilyard.legendarytooltips.LegendaryTooltips;
import com.anthonyhilyard.legendarytooltips.forge.client.LegendaryTooltipsForgeClient;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.IExtensionPoint;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLEnvironment;

@Mod(LegendaryTooltips.MODID)
public final class LegendaryTooltipsForge
{
	public LegendaryTooltipsForge()
	{
		// Run our common setup.
		LegendaryTooltips.init();

		if (FMLEnvironment.dist == Dist.CLIENT)
		{
			MinecraftForge.EVENT_BUS.register(LegendaryTooltipsForgeClient.class);
		}

		ModLoadingContext.get().registerExtensionPoint(IExtensionPoint.DisplayTest.class, () -> new IExtensionPoint.DisplayTest(() -> "ANY", (remote, isServer) -> true));
	}
}
