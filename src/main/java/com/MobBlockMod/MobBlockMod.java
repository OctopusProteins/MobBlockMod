package com.MobBlockMod;

import com.MobBlockMod.Entity.MushroomMob.EntityMushroom;
import com.MobBlockMod.Tree.WorldGenDwarfTree;
import com.MobBlockMod.Tree.WorldGenPillarDwarfTree;
import com.MobBlockMod.render.BlockRender;
import com.MobBlockMod.world.MBMWorldGen;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = MobBlockMod.MODID, version = MobBlockMod.VERSION)

public class MobBlockMod {
//List Items and Blocks Here!
	
    public static final String MODID = "MobBlockMod";
    public static final String VERSION = "2.5.10";
    
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
    }
        
    @EventHandler
    public void init(FMLInitializationEvent event) {
        GameRegistry.registerWorldGenerator(new WorldGenDwarfTree(), 0);
        GameRegistry.registerWorldGenerator(new WorldGenPillarDwarfTree(), 0);
        	
        Registry.MyRecipes();
        if(event.getSide() == Side.CLIENT) {
                Registry.renderItems();
        }
            
        BlockRender.registerBlockRender();
    }
        
    @EventHandler // used in 1.6.2
    public void load(FMLInitializationEvent event) {
        proxy.registerRenderers();
        //OreGeneration
        GameRegistry.registerWorldGenerator(new MBMWorldGen(), 0);
        
        EntityMushroom.mainRegistry();
              
   }
        
        
   @EventHandler // used in 1.6.2
   //@PostInit   // used in 1.5.2
   public void postInit(FMLPostInitializationEvent event) {
	   
   }
}
