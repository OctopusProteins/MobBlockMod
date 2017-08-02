package com.MobBlockMod.items;//Change this

import com.MobBlockMod.Registry;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;



public class ElderGuardianBits extends Item 
{
	private final String name = "elderguardianBits";
	 
	public ElderGuardianBits() 
	{
		//for 1.11 update
		// 
		setCreativeTab(Registry.mobBlockModTab);
	    setUnlocalizedName(name);
	    
	}
	        
	public String getName()
	{
		return name;
	}
	      
}
