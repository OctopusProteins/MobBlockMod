package com.MobBlockMod.items;//Change this

import com.MobBlockMod.init.ModTabs;

import net.minecraft.item.Item;



public class ElderGuardianBits extends Item 
{
	private final String name = "elderguardianBits";
	 
	public ElderGuardianBits() 
	{
		//for 1.11 update
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
