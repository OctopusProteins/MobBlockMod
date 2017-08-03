package com.MobBlockMod.init;

import com.MobBlockMod.tree.WorldGenDwarfTree;
import com.MobBlockMod.tree.WorldGenPillarDwarfTree;
import com.MobBlockMod.world.MBMWorldGen;

import net.minecraftforge.fml.common.registry.GameRegistry;


public class ModWorldGen {
	public static void registerWorldGen() {
		GameRegistry.registerWorldGenerator(new MBMWorldGen(), 0);
		GameRegistry.registerWorldGenerator(new WorldGenDwarfTree(), 0);
		GameRegistry.registerWorldGenerator(new WorldGenPillarDwarfTree(), 0);
	}
}
