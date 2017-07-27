package com.MobBlockMod.MyItems;//Change this

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

import java.util.List;

import com.MobBlockMod.YourModsName;



public class BushMush extends Item 
	{
	        public BushMush() 
	        {
	              super();
	              this.setHasSubtypes(true);
	      		  this.setCreativeTab(CreativeTabs.tabMaterials);
	        }
	        
	        
	      
	        //Load Icons and Textures Properly
	    	@SideOnly(Side.CLIENT)
	    	private IIcon[] icons;
	        @SideOnly(Side.CLIENT) 
	        public void registerIcons(IIconRegister par1IconRegister)
	        {
	            this.itemIcon = par1IconRegister.registerIcon(YourModsName.MODID + ":" + "bushmush");
	        }
	      }
