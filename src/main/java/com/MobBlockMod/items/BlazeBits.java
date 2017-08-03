package com.MobBlockMod.items;//Change this

import com.MobBlockMod.init.ModTabs;

import net.minecraft.item.Item;



public class BlazeBits extends Item 
{
	private final String name = "blazeBits";
	
	public BlazeBits() 
	{
		 
		setCreativeTab(ModTabs.mobBlockModTab);
	    setUnlocalizedName(name);
	    setRegistryName(name);
	}
	        
	public String getName()
	{
		return name;
	}
	      
}
