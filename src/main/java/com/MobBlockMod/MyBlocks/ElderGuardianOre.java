package com.MobBlockMod.MyBlocks;

import com.MobBlockMod.Registry;
import com.MobBlockMod.CreativeTabs.MobBlockModTab;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ElderGuardianOre extends Block 
{
	private final String name = "elderguardianOre";
	
	        public ElderGuardianOre() 
	        {
	                super(Material.GROUND);
	                //change this at 1.11 update
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
