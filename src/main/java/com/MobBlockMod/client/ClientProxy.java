package com.MobBlockMod.client;

import com.MobBlockMod.CommonProxy;
import com.MobBlockMod.Entity.MushroomMob.EntityMushroomMob;
import com.MobBlockMod.Entity.MushroomMob.MushroomMobModel;
import com.MobBlockMod.Entity.MushroomMob.RenderMushroomMob;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
        
        @Override
        public void registerRenderers() {
            RenderingRegistry.registerEntityRenderingHandler(EntityMushroomMob.class, new RenderMushroomMob(Minecraft.getMinecraft().getRenderManager(), new MushroomMobModel(), 0));
        }
        
}