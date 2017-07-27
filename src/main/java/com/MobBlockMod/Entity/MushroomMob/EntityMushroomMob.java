package com.MobBlockMod.Entity.MushroomMob;


import com.MobBlockMod.Registry;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIFollowOwner;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.world.World;

public class EntityMushroomMob extends EntityTameable{

	public EntityMushroomMob(World par1World) {
		super(par1World);
		this.setSize(0.5F, 0.45F);
		this.tasks.addTask(0, new EntityAIWander(this, 0.3D));
		this.tasks.addTask(1, new EntityAIPanic(this, 0.4D));
		this.tasks.addTask(2, new EntityAITempt(this, 0.4D, Items.mushroom_stew, false));
		this.tasks.addTask(3, new EntityAIFollowOwner(this, 1.0D, 10.0F, 2.0F));
		this.tasks.addTask(4, new EntityAIMate(this, 1.15D));
		this.tasks.addTask(5, new EntityAISwimming(this));
		this.tasks.addTask(6, new EntityAIFollowParent(this, 0.75F));
		this.tasks.addTask(7, new EntityAILeapAtTarget(this, 5.0F));
        this.tasks.addTask(8, new EntityAIAttackOnCollide(this, 1.0D, true));
		this.tasks.addTask(9, new EntityAIWatchClosest(this, EntityPlayer.class, 4.0F));
		
		
		this.setTamed(false);
		
		((PathNavigateGround)this.getNavigator()).func_179690_a(true);
	}
	
	public boolean isAIEnabled(){
		return true;
	}
	
	public void applyEntityAttributes(){
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(8.5F);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(1.0D);
	}
	
	protected void dropFewItems(boolean p_70628_1_, int p_70628_2_)
    {
        if (rand.nextInt(2) == 1) {
        	this.dropItem(Registry.mushroomCap, 1);
        }
        
        if(rand.nextInt(3) == 1){
        	this.dropItem(Registry.mushroomStem, 1);
        }
    }

	
	public void setTamed(boolean p_70903_1_)
    {
        super.setTamed(p_70903_1_);

        if (p_70903_1_)
        {
            this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(100.0D);
        }
        else
        {
            this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(8.5D);
        }
    }
	
	
	public boolean interact(EntityPlayer p_70085_1_)
    {
        ItemStack itemstack = p_70085_1_.inventory.getCurrentItem();
        
        if (itemstack != null && itemstack.getItem() == Registry.mushroomCompound && this.isTamed() == true) {
        	this.heal(15.0F);
        }

        if (itemstack != null && itemstack.getItem() == Registry.mushroomCompound && this.isTamed() == false) {
            if (!p_70085_1_.capabilities.isCreativeMode) --itemstack.stackSize;
            if (itemstack.stackSize <= 0) p_70085_1_.inventory.setInventorySlotContents(p_70085_1_.inventory.currentItem, (ItemStack)null);
            if (!this.worldObj.isRemote) {
                if (this.rand.nextInt(3) == 0) {
                    this.setTamed(true);
                    this.setHealth(100.0F);
                    this.setOwnerId(p_70085_1_.getUniqueID().toString());
                    this.playTameEffect(true);
                    this.worldObj.setEntityState(this, (byte)7);
                }else{
                    this.playTameEffect(false);
                    this.worldObj.setEntityState(this, (byte)6);
                }
            }

            return true;
        }

        return super.interact(p_70085_1_);
    }
	
	public boolean isBreedingItem(ItemStack p_70877_1_) {
		 ItemStack breed  = new ItemStack(Items.mushroom_stew);
		 if (p_70877_1_ != breed) return true;
		 return false;
	    }
	
	 

	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		return new EntityMushroomMob(this.worldObj);
	}
	
	

}
