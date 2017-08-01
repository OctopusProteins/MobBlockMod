package com.MobBlockMod.blocks;

import com.MobBlockMod.Registry;
import com.MobBlockMod.tabs.MobBlockModTab;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SkeletonHorseOre extends Block 
{
	private final String name = "skeletonhorseOre";
	
	        public SkeletonHorseOre() 
	        {
	                super(Material.GROUND);
	                //GameRegistry.registerBlock(this, name);
	                setUnlocalizedName(name);
	                setCreativeTab(Registry.mobBlockModTab);
	                setHardness(1.8F);
	                setHarvestLevel("pickaxe", 0);
	                this.setSoundType(SoundType.STONE);
	        }
	        public String getName()
	        {
	        	return name;
	        }

}
