package com.MobBlockMod;

import com.MobBlockMod.Entity.MushroomMob.EntityMushroom;
import com.MobBlockMod.Entity.MushroomMob.EntityMushroomMob;
import com.MobBlockMod.Tree.WorldGenDwarfTree;
import com.MobBlockMod.Tree.WorldGenPillarDwarfTree;
import com.MobBlockMod.render.BlockRender;
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
//List Items and Blocks Here!
	
    public static final String MODID = "MobBlockMod";
    public static final String VERSION = "2.6.1";
    
        // The instance of your mod that Forge uses.
    @Instance(MODID)
    public static MobBlockMod instance;
        
    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide="com.MobBlockMod.client.ClientProxy", serverSide="com.MobBlockMod.CommonProxy")
    public static CommonProxy proxy;
        
    @EventHandler  //used in 1.6.2
    public void preInit(FMLPreInitializationEvent event) {
        
        Registry.MyItems();    
        Registry.MyBlocks();
        Registry.registerSounds();
        EntityMushroom.registerEntity();
        EntityRegistry.addSpawn(EntityMushroomMob.class, 50, 1, 25, EnumCreatureType.AMBIENT, Biomes.FOREST, Biomes.BIRCH_FOREST, Biomes.BIRCH_FOREST_HILLS, Biomes.COLD_TAIGA, Biomes.COLD_TAIGA_HILLS, Biomes.EXTREME_HILLS, Biomes.EXTREME_HILLS_EDGE, Biomes.EXTREME_HILLS_WITH_TREES, Biomes.FOREST_HILLS, Biomes.JUNGLE, Biomes.JUNGLE_EDGE, Biomes.JUNGLE_HILLS, Biomes.ROOFED_FOREST, Biomes.SAVANNA, Biomes.SAVANNA_PLATEAU, Biomes.TAIGA_HILLS, Biomes.TAIGA);
        EntityRegistry.addSpawn(EntityMushroomMob.class, 50, 50, 100, EnumCreatureType.AMBIENT, Biomes.MUSHROOM_ISLAND, Biomes.MUSHROOM_ISLAND_SHORE, Biome.REGISTRY.getObjectById(140));
    }
        
    @EventHandler
    public void init(FMLInitializationEvent event) {
        GameRegistry.registerWorldGenerator(new WorldGenDwarfTree(), 0);
        GameRegistry.registerWorldGenerator(new WorldGenPillarDwarfTree(), 0);
        	
        Registry.MyRecipes();
        if(event.getSide() == Side.CLIENT) Registry.renderItems();
        BlockRender.registerBlockRender();
        
    }
        
    @EventHandler // used in 1.6.2
    public void load(FMLInitializationEvent event) {
        proxy.registerRenderers();
        //OreGeneration
        GameRegistry.registerWorldGenerator(new MBMWorldGen(), 0);
              
   }
        
        
   @EventHandler // used in 1.6.2
   //@PostInit   // used in 1.5.2
   public void postInit(FMLPostInitializationEvent event) {
	   
   }
}
