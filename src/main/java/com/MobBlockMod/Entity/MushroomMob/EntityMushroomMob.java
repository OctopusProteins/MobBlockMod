package com.MobBlockMod.Entity.MushroomMob;


import java.util.UUID;

import com.MobBlockMod.Registry;
import com.google.common.base.Predicate;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIFollowOwner;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIOwnerHurtByTarget;
import net.minecraft.entity.ai.EntityAIOwnerHurtTarget;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITargetNonTamed;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityMushroomMob extends EntityTameable{

	public EntityMushroomMob(World par1World) {
		super(par1World);
		
		this.setSize(0.5F, 0.45F);
		
		this.tasks.addTask(0, new EntityAIWander(this, 0.3D));
		this.tasks.addTask(1, new EntityAIPanic(this, 0.4D));
		this.tasks.addTask(2, new EntityAITempt(this, 0.4D, Items.mushroom_stew, false));
		this.tasks.addTask(3, new EntityAIFollowOwner(this, 1.0D, 10.0F, 2.0F));
		this.tasks.addTask(4, new EntityAIMate(this, 0.5D));
		this.tasks.addTask(5, new EntityAISwimming(this));
		this.tasks.addTask(6, new EntityAIFollowParent(this, 0.75F));
		this.tasks.addTask(7, new EntityAILeapAtTarget(this, 5.0F));
        this.tasks.addTask(8, new EntityAIAttackMelee(this, 1.0D, true)); 
		this.tasks.addTask(9, new EntityAIWatchClosest(this, EntityPlayer.class, 4.0F));
		
		this.targetTasks.addTask(1, new EntityAIOwnerHurtByTarget(this));
	    this.targetTasks.addTask(2, new EntityAIOwnerHurtTarget(this));
	    this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, true, new Class[0]));
		
		this.setTamed(false);
		
		((PathNavigateGround)this.getNavigator()).setCanSwim(true);
		((PathNavigateGround)this.getNavigator()).setEnterDoors(true);
	}
	
	public boolean isAIEnabled(){
		return true;
	}
	
	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		
		//this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(5.0D);
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(128.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(8.5D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(1.0D);
		
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

	protected SoundEvent getAmbientSound() {
		return Registry.mushroomLive;
	}
	protected SoundEvent getHurtSound() {
		return Registry.mushroomHurt;
	}
	protected SoundEvent getDeathSound() {
		return Registry.mushroomDie;
	}

	
	public void setTamed(boolean p_70903_1_) {
        super.setTamed(p_70903_1_);

        if (p_70903_1_) this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(40.0D);
        else this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(8.5D);
    }
	
	
	public boolean processInteract(EntityPlayer p_70085_1_, EnumHand p_184645_2_, ItemStack stack) {
		
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
                    this.setHealth(50.0F);
                    this.setOwnerId(p_70085_1_.getUniqueID());
                    this.playTameEffect(true);
                    this.worldObj.setEntityState(this, (byte)7);
                }else{
                    this.playTameEffect(false);
                    this.worldObj.setEntityState(this, (byte)6);
                }
            }

            return true;
        }

        return super.processInteract(p_70085_1_, p_184645_2_, stack);
    }
	
	public boolean isBreedingItem(ItemStack p_70877_1_) {
		 ItemStack breed  = new ItemStack(Registry.mushroomCompound);
		 if (p_70877_1_ != breed) return true;
		 return false;
	}
	
	@Override
	public EntityMushroomMob createChild(EntityAgeable p_90011_1_) {
		EntityMushroomMob entity = new EntityMushroomMob(this.worldObj);
        UUID uuid = this.getOwnerId();

        if (uuid != null)
        {
            entity.setOwnerId(uuid);
            entity.setTamed(true);
        }

        return entity;
	}
	
	 public boolean canMateWith(EntityAnimal otherAnimal)
	    {
	        if (otherAnimal == this)
	        {
	            return false;
	        }
	        else if (!this.isTamed())
	        {
	            return false;
	        }
	        else if (!(otherAnimal instanceof EntityMushroomMob))
	        {
	            return false;
	        }
	        else
	        {
	            EntityMushroomMob entitywolf = (EntityMushroomMob)otherAnimal;
	            return !entitywolf.isTamed() ? false : (entitywolf.isSitting() ? false : this.isInLove() && entitywolf.isInLove());
	        }
	    }
}

