package com.MobBlockMod.Entity.MushroomMob;

import com.MobBlockMod.MyCode;
import com.google.common.base.Strings;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderMushroomMobG extends RenderLiving{
	
	private static final ResourceLocation mobTextures = new ResourceLocation(MyCode.modid + ":textures/entity/mushroommob.png");

	public RenderMushroomMobG(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
	}
	
	protected ResourceLocation getEntityTexture(EntityMushroomMobG entity){
		return mobTextures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityMushroomMobG)entity);
	}
	

}
