package com.MobBlockMod;

import com.MobBlockMod.Entity.MushroomMob.EntityMushroom;
import com.MobBlockMod.Entity.MushroomMob.EntityMushroomMob;
import com.MobBlockMod.render.BlockRender;
import com.MobBlockMod.tree.WorldGenDwarfTree;
import com.MobBlockMod.tree.WorldGenPillarDwarfTree;
import com.MobBlockMod.world.MBMWorldGen;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = MobBlockMod.MODID, version = MobBlockMod.VERSION)

public class MobBlockMod {
	// List Items and Blocks Here!

	public static final String MODID = "MobBlockMod";
	public static final String VERSION = "2.6.6";

	// The instance of your mod that Forge uses.
	@Instance(MODID)
	public static MobBlockMod instance;

	// Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide = "com.MobBlockMod.client.ClientProxy", serverSide = "com.MobBlockMod.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler // used in 1.6.2
	public void preInit(FMLPreInitializationEvent event) {

		Registry.initItems();
		Registry.initBlocks();
		Registry.registerSounds();
		EntityMushroom.registerEntity(true);
		Registry.registerSeeds();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {

		Registry.registerRecipes();
		if (event.getSide() == Side.CLIENT) Registry.renderItems();
		BlockRender.registerBlockRender();

	}

	@EventHandler // used in 1.6.2
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderers();
		// OreGeneration
		GameRegistry.registerWorldGenerator(new MBMWorldGen(), 0);
		GameRegistry.registerWorldGenerator(new WorldGenDwarfTree(), 0);
		GameRegistry.registerWorldGenerator(new WorldGenPillarDwarfTree(), 0);
	}

	@EventHandler // used in 1.6.2
	// @PostInit // used in 1.5.2
	public void postInit(FMLPostInitializationEvent event) {

	}
}
