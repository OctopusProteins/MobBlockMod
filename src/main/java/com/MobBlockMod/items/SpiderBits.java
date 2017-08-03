package com.MobBlockMod.items;//Change this

import com.MobBlockMod.init.ModTabs;

import net.minecraft.item.Item;



public class SpiderBits extends Item 
{
	private final String name = "spiderBits";
	 //
	public SpiderBits() 
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
