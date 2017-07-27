package com.MobBlockMod;

import java.util.ArrayList;
import java.util.Arrays;

import com.MobBlockMod.Entity.MushroomMob.EntityMushroomG;
import com.MobBlockMod.Tree.WorldGenDwarfTree;
import com.MobBlockMod.Tree.WorldGenTallDwarfTree;
import com.MobBlockMod.worldGenOre.WorldGenOre;

import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManager;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler; // used in 1.6.2
//import cpw.mods.fml.common.Mod.PreInit;    // used in 1.5.2
//import cpw.mods.fml.common.Mod.Init;       // used in 1.5.2
//import cpw.mods.fml.common.Mod.PostInit;   // used in 1.5.2
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
//Import MyCode to Boiler Plate

@Mod(modid = YourModsName.MODID, version = YourModsName.VERSION)

public class YourModsName {
//List Items and Blocks Here!
    public static final String MODID = "MobBlockMod";
    public static final String VERSION = "2.5.3";

        // The instance of your mod that Forge uses.
        @Instance(MODID)
        public static YourModsName instance;
        
        // Says where the client and server 'proxy' code is loaded.
        @SidedProxy(clientSide="com.MobBlockMod.client.ClientProxy", serverSide="com.MobBlockMod.CommonProxy")
        public static CommonProxy proxy;
        
        @EventHandler // used in 1.6.2
        public void preInit(FMLPreInitializationEvent event) {
                // Stub Method
       
        //#MyCode Block Properties
        MyCode.MyItems();    
        MyCode.MyBlocks();
     
        
        }
        
        @EventHandler // used in 1.6.2
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();
                
                //#MyCode Recipes
                MyCode.MyRecipes();
                //OreGeneration
                GameRegistry.registerWorldGenerator(new WorldGenOre(),1);
                GameRegistry.registerWorldGenerator(new WorldGenDwarfTree(), 1);
                GameRegistry.registerWorldGenerator(new WorldGenTallDwarfTree(), 1);
                
                //entities
                EntityMushroomG.mainRegistry();
              
        }
        
        
        @EventHandler // used in 1.6.2
        //@PostInit   // used in 1.5.2
        public void postInit(FMLPostInitializationEvent event) {
        }
        
        
       
        
        
}