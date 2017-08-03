package com.MobBlockMod.items;//Change this

import com.MobBlockMod.init.ModTabs;

import net.minecraft.item.Item;



public class EndermiteBits extends Item 
{
	private final String name = "endermiteBits";
	 
	public EndermiteBits() 
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
