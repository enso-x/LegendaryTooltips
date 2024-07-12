package com.anthonyhilyard.legendarytooltips.fabric;

import com.anthonyhilyard.legendarytooltips.LegendaryTooltips;

import net.fabricmc.api.ModInitializer;

public final class LegendaryTooltipsFabric implements ModInitializer
{
	@Override
	public void onInitialize()
	{
		// Run our common setup.
		LegendaryTooltips.init();
	}
}
