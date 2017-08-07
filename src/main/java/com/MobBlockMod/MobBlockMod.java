package com.MobBlockMod;

import com.MobBlockMod.Entity.MushroomMob.EntityMushroom;
import com.MobBlockMod.init.ModRecipes;
import com.MobBlockMod.init.ModSeeds;
import com.MobBlockMod.init.ModWorldGen;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MobBlockMod.MODID, version = MobBlockMod.VERSION)

public class MobBlockMod {
	// List Items and Blocks Here!

	public static final String MODID = "mobblockmod";
	public static final String VERSION = "2.7.6";

	// The instance of your mod that Forge uses.
	@Instance(MODID)
	public static MobBlockMod instance;

	// Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide = "com.MobBlockMod.client.ClientProxy", serverSide = "com.MobBlockMod.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler // used in 1.6.2
	public void preInit(FMLPreInitializationEvent event) {
		EntityMushroom.registerEntity(true);
		ModSeeds.registerSeeds();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		ModRecipes.registerRecipes();
	}

	@EventHandler // used in 1.6.2
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderers();
		// OreGeneration
		ModWorldGen.registerWorldGen();
	}

	@EventHandler // used in 1.6.2
	// @PostInit // used in 1.5.2
	public void postInit(FMLPostInitializationEvent event) {

	}
}
