package com.MobBlockMod.items;//Change this

import com.MobBlockMod.init.ModTabs;

import net.minecraft.item.Item;



public class HorseBits extends Item 
{
	private final String name = "horseBits";
	 //
	public HorseBits() 
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
