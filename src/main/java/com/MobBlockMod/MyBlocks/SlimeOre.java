package com.MobBlockMod.MyBlocks;

import com.MobBlockMod.Registry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SlimeOre extends Block 
{
	private final String name = "slimeOre";
	
	        public SlimeOre() 
	        {
	                super(Material.ground);
	                GameRegistry.registerBlock(this, name);
	                setUnlocalizedName(name);
	                setCreativeTab(Registry.mobBlockModTab);
	                setHardness(1.8F);
	      	        setStepSound(Block.soundTypeStone);
	        }
	        public String getName()
	        {
	        	return name;
	        }

}