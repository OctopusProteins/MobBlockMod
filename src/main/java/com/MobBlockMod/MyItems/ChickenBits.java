package com.MobBlockMod.MyItems;

import com.MobBlockMod.YourModsName;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class ChickenBits extends Item
{

	@SideOnly(Side.CLIENT)
	private IIcon[] icons;

	public ChickenBits()
	{
		this.setHasSubtypes(true);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}

	@SideOnly(Side.CLIENT)
	public void func_94581_a(IIconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(YourModsName.MODID + ":" + "chickenbit");
	}
}