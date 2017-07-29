package com.MobBlockMod.MyBlocks;

import com.MobBlockMod.Registry;
import com.MobBlockMod.CreativeTabs.MobBlockModTab;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class GuardianOre extends Block 
{
	private final String name = "guardianOre";
	
	        public GuardianOre() 
	        {
	                super(Material.ground);
	                GameRegistry.registerBlock(this, name);
	                setUnlocalizedName(name);
	                setCreativeTab(Registry.mobBlockModTab);
	                setHardness(1.8F);
	      	        setStepSound(stepSound.STONE);
	        }
	        public String getName()
	        {
	        	return name;
	        }

}
