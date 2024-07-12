package com.anthonyhilyard.legendarytooltips.fabric.client;

import com.anthonyhilyard.legendarytooltips.client.LegendaryTooltipsClient;

import net.fabricmc.api.ClientModInitializer;

public final class LegendaryTooltipsFabricClient implements ClientModInitializer
{
	@Override
	public void onInitializeClient()
	{
		LegendaryTooltipsClient.init();
	}
}
