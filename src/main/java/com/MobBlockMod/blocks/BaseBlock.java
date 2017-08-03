package com.MobBlockMod.blocks;

import com.MobBlockMod.init.ModTabs;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BaseBlock extends Block 
{
	private final String name = "baseBlock";
	
	        public BaseBlock() 
	        {
	                super(Material.GROUND);
	                setRegistryName(name);
	                setUnlocalizedName(name);
	                setCreativeTab(ModTabs.mobBlockModTab);
	                setHardness(1.8F);
	                setHarvestLevel("pickaxe", 0);
	                this.setSoundType(SoundType.STONE);
	        }
	        public String getName()
	        {
	        	return name;
	        }

}