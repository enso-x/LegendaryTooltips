package com.anthonyhilyard.legendarytooltips.fabric.mixin;

import java.util.List;
import java.util.Set;

import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import com.anthonyhilyard.iceberg.services.Services;

public class MixinConfig implements IMixinConfigPlugin
{
	@Override
	public void onLoad(String mixinPackage) { }

	@Override
	public String getRefMapperConfig() { return null; }

	@Override
	public boolean shouldApplyMixin(String targetClassName, String mixinClassName)
	{
		// Only apply mixins with "roughlyenoughitems" in the name if the modid "roughlyenoughitems" is present.
		if (mixinClassName.toLowerCase().contains("roughlyenoughitems"))
		{
			return Services.PLATFORM.isModLoaded("roughlyenoughitems");
		}

		// Only apply mixins with "justenoughitems" in the name if the modid "jei" is present.
		if (mixinClassName.toLowerCase().contains("justenoughitems"))
		{
			return Services.PLATFORM.isModLoaded("jei");
		}
		return true;
	}

	@Override
	public void acceptTargets(Set<String> myTargets, Set<String> otherTargets) { }

	@Override
	public List<String> getMixins() { return null; }

	@Override
	public void preApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) { }

	@Override
	public void postApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) { }
}