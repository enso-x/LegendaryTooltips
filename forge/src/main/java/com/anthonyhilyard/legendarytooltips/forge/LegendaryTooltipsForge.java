package com.anthonyhilyard.legendarytooltips.forge;

import com.anthonyhilyard.legendarytooltips.LegendaryTooltips;

import net.minecraftforge.fml.IExtensionPoint;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;

@Mod(LegendaryTooltips.MODID)
public final class LegendaryTooltipsForge
{
	public LegendaryTooltipsForge()
	{
		ModLoadingContext.get().registerExtensionPoint(IExtensionPoint.DisplayTest.class, () -> new IExtensionPoint.DisplayTest(() -> "ANY", (remote, isServer) -> true));
	}
}
