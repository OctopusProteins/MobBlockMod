package com.MobBlockMod.items;//Change this

import com.MobBlockMod.init.ModTabs;

import net.minecraft.item.Item;



public class SkeletonHorseBits extends Item 
{
	private final String name = "skeletonhorseBits";
	 
	public SkeletonHorseBits() 
	{
		// 
		setCreativeTab(ModTabs.mobBlockModTab);
	    setUnlocalizedName(name);
	    setRegistryName(name);
	}
	        
	public String getName()
	{
		return name;
	}
	      
}

