package com.anthonyhilyard.legendarytooltips.neoforge;

import com.anthonyhilyard.legendarytooltips.LegendaryTooltips;
import com.anthonyhilyard.legendarytooltips.neoforge.client.LegendaryTooltipsNeoForgeClient;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.loading.FMLEnvironment;

@Mod(LegendaryTooltips.MODID)
public final class LegendaryTooltipsNeoForge
{
	public LegendaryTooltipsNeoForge(ModContainer container, IEventBus modBus)
	{
		// Run our common setup.
		LegendaryTooltips.init();

		if (FMLEnvironment.dist == Dist.CLIENT)
		{
			modBus.register(LegendaryTooltipsNeoForgeClient.class);
		}
	}
}

