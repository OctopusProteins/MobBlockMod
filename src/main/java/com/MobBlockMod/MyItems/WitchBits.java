package com.MobBlockMod.MyItems;//Change this

import com.MobBlockMod.Registry;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;



public class WitchBits extends Item 
{
	private final String name = "witchBits";
	 //
	public WitchBits() 
	{
		GameRegistry.registerItem(this, name);
		setCreativeTab(Registry.mobBlockModTab);
	    setUnlocalizedName(name);
	    
	}
	        
	public String getName()
	{
		return name;
	}
	      
}
