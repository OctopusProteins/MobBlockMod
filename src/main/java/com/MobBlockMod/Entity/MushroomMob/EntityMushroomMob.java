package com.MobBlockMod.Entity.MushroomMob;


import java.util.UUID;

import com.MobBlockMod.init.ModItems;
import com.MobBlockMod.init.ModSounds;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIFollowOwner;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIOwnerHurtByTarget;
import net.minecraft.entity.ai.EntityAIOwnerHurtTarget;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityMushroomMob extends EntityTameable{

	public EntityMushroomMob(World par1World) {
		super(par1World);
		this.setSize(0.5F, 0.45F);
		this.setTamed(false);
	}
	
	public boolean isAIEnabled(){
		return true;
	}
	
	protected void initEntityAI() {
		this.tasks.addTask(0, new EntityAILeapAtTarget(this, 0.5F));
        this.tasks.addTask(1, new EntityAIAttackMelee(this, 0.6D, true)); 
        this.tasks.addTask(2, new EntityAIFollowOwner(this, 1.0D, 10.0F, 2.0F));
		this.tasks.addTask(3, new EntityAIWander(this, 0.3D));
		this.tasks.addTask(4, new EntityAISwimming(this));
		this.tasks.addTask(5, new EntityAIPanic(this, 0.4D));
		this.tasks.addTask(6, new EntityAITempt(this, 0.4D, Items.MUSHROOM_STEW, false));
		this.tasks.addTask(7, new EntityAIMate(this, 0.5D));
		this.tasks.addTask(8, new EntityAIFollowParent(this, 0.75F));
		this.tasks.addTask(9, new EntityAIWatchClosest(this, EntityPlayer.class, 4.0F));
		
		
	    this.targetTasks.addTask(0, new EntityAIHurtByTarget(this, true, new Class[0]));
	    this.targetTasks.addTask(1, new EntityAIOwnerHurtByTarget(this));
	    this.targetTasks.addTask(2, new EntityAIOwnerHurtTarget(this));
	    
	    ((PathNavigateGround)this.getNavigator()).setCanSwim(true);
		((PathNavigateGround)this.getNavigator()).setEnterDoors(true);
	}
	
	@Override
	protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5D);

        if (this.isTamed())
        {
            this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(25.0D);
        }
        else
        {
            this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(8.5D);
        }
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);  
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(32.0D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(0.5);
    }
	@Override
	 public boolean attackEntityAsMob(Entity entityIn)
	    {
	        boolean flag = entityIn.attackEntityFrom(DamageSource.causeMobDamage(this), (float) this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getBaseValue());

	        if (flag)
	        {
	            this.applyEnchantments(this, entityIn);
	        }

	        return flag;
	    }
	public boolean shouldAttackEntity(EntityLivingBase p_142018_1_, EntityLivingBase p_142018_2_)
    {
        if (!(p_142018_1_ instanceof EntityGhast))
        {
            if (p_142018_1_ instanceof EntityMushroomMob)
            {
                EntityMushroomMob entitywolf = (EntityMushroomMob)p_142018_1_;

                if (entitywolf.isTamed() && entitywolf.getOwner() == p_142018_2_)
                {
                    return false;
                }
            }

            return p_142018_1_ instanceof EntityPlayer && p_142018_2_ instanceof EntityPlayer && !((EntityPlayer)p_142018_2_).canAttackPlayer((EntityPlayer)p_142018_1_) ? false : !(p_142018_1_ instanceof EntityHorse) || !((EntityHorse)p_142018_1_).isTame();
        }
        else
        {
            return false;
        }
    }
	
	
	protected void dropFewItems(boolean p_70628_1_, int p_70628_2_)
    {
        if (rand.nextInt(2) == 1) {
        	this.dropItem(ModItems.mushroomCap, 1);
        }
        
        if(rand.nextInt(3) == 1){
        	this.dropItem(ModItems.mushroomStem, 1);
        }
    }

	protected SoundEvent getAmbientSound() {
		return ModSounds.mushroomLive;
	}
	protected SoundEvent getHurtSound() {
		return ModSounds.mushroomHurt;
	}
	protected SoundEvent getDeathSound() {
		return ModSounds.mushroomDie;
	}

	
	public void setTamed(boolean p_70903_1_) {
        super.setTamed(p_70903_1_);
    }
	
	
	public boolean processInteract(EntityPlayer p_70085_1_, EnumHand p_184645_2_) {
		
		ItemStack itemstack = p_70085_1_.getHeldItem(p_184645_2_);
        
        if (itemstack != null && itemstack.getItem() == ModItems.mushroomCompound && this.isTamed() == true) {
        	this.heal(10.0F);
        }

        if (itemstack != null && itemstack.getItem() == ModItems.mushroomCompound && this.isTamed() == false) {
            if (!p_70085_1_.capabilities.isCreativeMode) itemstack.shrink(1);
            if (itemstack.getCount() <= 0) p_70085_1_.inventory.setInventorySlotContents(p_70085_1_.inventory.currentItem, (ItemStack)null);
            if (!this.world.isRemote) {
                if (this.rand.nextInt(3) == 0) {
                    this.setTamed(true);
                    this.setOwnerId(p_70085_1_.getUniqueID());
                    this.playTameEffect(true);
                    this.world.setEntityState(this, (byte)7);
                }else{
                    this.playTameEffect(false);
                    this.world.setEntityState(this, (byte)6);
                }
            }

            return true;
        }

        return super.processInteract(p_70085_1_, p_184645_2_);
    }
	
	public boolean isBreedingItem(ItemStack p_70877_1_) {
		 ItemStack breed  = new ItemStack(ModItems.mushroomCompound);
		 if (p_70877_1_ != breed) return true;
		 return false;
	}
	
	@Override
	public EntityMushroomMob createChild(EntityAgeable p_90011_1_) {
		EntityMushroomMob entity = new EntityMushroomMob(this.world);
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

