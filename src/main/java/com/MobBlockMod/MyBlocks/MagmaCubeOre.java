package com.MobBlockMod.MyBlocks;

import com.MobBlockMod.Registry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MagmaCubeOre extends Block 
{
	private final String name = "magmacubeOre";
	
	        public MagmaCubeOre() 
	        {
	                super(Material.ground);
	                GameRegistry.registerBlock(this, name);
	                setUnlocalizedName(name);
	                setCreativeTab(Registry.mobBlockModTab);
	                setHardness(1.8F);
	      	        setStepSound(stepSound.STONE);
	      	        setLightLevel(8 / 16f);
	        }
	        public String getName()
	        {
	        	return name;
	        }

}
