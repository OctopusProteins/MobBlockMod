package com.MobBlockMod.client;

import com.MobBlockMod.CommonProxy;
import com.MobBlockMod.Entity.MushroomMob.EntityMushroomMobG;
import com.MobBlockMod.Entity.MushroomMob.MushroomG;
import com.MobBlockMod.Entity.MushroomMob.RenderMushroomMobG;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
        
        @Override
        public void registerRenderers() {
                RenderingRegistry.registerEntityRenderingHandler(EntityMushroomMobG.class, new RenderMushroomMobG(new MushroomG(), 0));
        }
        
}