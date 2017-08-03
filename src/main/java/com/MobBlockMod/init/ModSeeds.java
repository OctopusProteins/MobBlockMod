package com.MobBlockMod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

public class ModSeeds {
	public static void registerSeeds() {
		MinecraftForge.addGrassSeed(new ItemStack(ModItems.grassShreds), 7);
		MinecraftForge.addGrassSeed(new ItemStack(ModItems.mushyPulp), 6);
	}
}
