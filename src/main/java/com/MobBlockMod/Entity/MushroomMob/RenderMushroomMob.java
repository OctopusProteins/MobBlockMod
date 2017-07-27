package com.MobBlockMod.Entity.MushroomMob;

import com.MobBlockMod.Registry;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderMushroomMob extends RenderLiving{
	
	private static final ResourceLocation mobTextures = new ResourceLocation(Registry.modid + ":textures/entity/mushroommob.png");

	public RenderMushroomMob(RenderManager p_i46128_1_, ModelBase p_i46128_2_, float p_i46128_3_) {
		super(p_i46128_1_, p_i46128_2_, p_i46128_3_);
	}
	
	protected ResourceLocation getEntityTexture(EntityMushroomMob entity){
		return mobTextures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityMushroomMob)entity);
	}
	

}
