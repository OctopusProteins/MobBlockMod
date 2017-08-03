package com.MobBlockMod.tree;

import com.MobBlockMod.init.ModTabs;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;

public class DwarfLog extends Block 
{
	private final String name = "dwarfLog";
	
	        public DwarfLog() 
	        {
	                super(Material.WOOD);
	                setRegistryName(name);
	                setUnlocalizedName(name);
	                setCreativeTab(ModTabs.mobBlockModTab);
	                setHardness(2.5F);
	                this.setSoundType(SoundType.WOOD);
	                Blocks.FIRE.setFireInfo(this, 8, 30);
	        }
	        public String getName()
	        {
	        	return name;
	        }

}
