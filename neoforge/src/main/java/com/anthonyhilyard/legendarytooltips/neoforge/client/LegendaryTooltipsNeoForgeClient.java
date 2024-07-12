package com.anthonyhilyard.legendarytooltips.neoforge.client;

import com.anthonyhilyard.legendarytooltips.client.LegendaryTooltipsClient;

import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

public class LegendaryTooltipsNeoForgeClient
{
	@SubscribeEvent(priority = EventPriority.HIGH)
	public static void onClientSetup(FMLClientSetupEvent event)
	{
		LegendaryTooltipsClient.init();
	}
}
