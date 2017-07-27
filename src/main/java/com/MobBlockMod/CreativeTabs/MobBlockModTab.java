package com.MobBlockMod.CreativeTabs;

import com.MobBlockMod.MyCode;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MobBlockModTab extends CreativeTabs {

	public MobBlockModTab(int par1, String par2Str) {
		super(par1, par2Str);
		
	}
	
	@Override
	public Item getTabIconItem() 
	{
		return MyCode.chickenBits;
	}

}
