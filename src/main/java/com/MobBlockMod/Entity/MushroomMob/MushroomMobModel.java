package com.MobBlockMod.Entity.MushroomMob;

import java.util.Random;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class MushroomMobModel extends ModelBase
{
	
	public Random rand;
	
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
	//private boolean isGiant;
  
  public MushroomMobModel()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Shape1 = new ModelRenderer(this, 0, 24);
      Shape1.addBox(0F, 0F, 0F, 4, 4, 4);
      Shape1.setRotationPoint(-2F, 20F, -2F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 0, 10);
      Shape2.addBox(0F, 0F, 0F, 6, 2, 6);
      Shape2.setRotationPoint(-3F, 19F, -3F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 0, 0);
      Shape3.addBox(0F, 0F, 0F, 2, 2, 2);
      Shape3.setRotationPoint(-1F, 17F, -1F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 0, 4);
      Shape4.addBox(0F, 0F, 0F, 4, 2, 4);
      Shape4.setRotationPoint(-2F, 18F, -2F);
      Shape4.setTextureSize(64, 32);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    if (this.isChild) {
    	float div = 2.0F;
    	GlStateManager.pushMatrix();
    	GlStateManager.scale(1.0F / div, 1.0F / div, 1.0F /div);
    	GlStateManager.translate(0.0F, 24.0F * f5, 0.0F);
    	
    	Shape1.render(f5);
        Shape2.render(f5);
        Shape3.render(f5);
        Shape4.render(f5);
        GlStateManager.popMatrix();
    }
    /*
    else if (this.isGiant()) {
    	GlStateManager.pushMatrix();
    	GlStateManager.scale(1.0F * 5.0F, 1.0F * 5.0F, 1.0F * 5.0F);
    	GlStateManager.translate(0.0F, 24.0F * f5, 0.0F);
    	
    	Shape1.render(f5);
    	Shape2.render(f5);
    	Shape3.render(f5);
    	Shape4.render(f5);
    	GlStateManager.popMatrix();
    }
    */
    else {
    	Shape1.render(f5);
    	Shape2.render(f5);
    	Shape3.render(f5);
    	Shape4.render(f5);
    }
 }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }
  /*
  public boolean isGiant() {
	  Random rand = new Random();
		if (rand.nextInt(21) < 5) return true;
		return false;
  }
  */
  
 }
