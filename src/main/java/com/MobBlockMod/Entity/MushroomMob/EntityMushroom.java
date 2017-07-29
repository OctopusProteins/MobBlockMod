package com.MobBlockMod.Entity.MushroomMob;

import java.util.BitSet;

import com.MobBlockMod.MobBlockMod;

import net.minecraft.entity.EntityList;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityMushroom {
	
	private static final EntityMushroom INSTANCE = new EntityMushroom();
	private BitSet availableIndicies;
	
	public static EntityMushroom instance() {
		return INSTANCE;
		
	}
	
	private EntityMushroom() {
		availableIndicies = new BitSet();
		availableIndicies.set(1, 255);
		for (Object id : EntityList.idToClassMapping.keySet()) {
			availableIndicies.clear((Integer) id);
		}
	}
	
	public static int findGlobalUniqueEntityId() {
		int res = instance().availableIndicies.nextSetBit(0);
		if (res < 0) {
			throw new RuntimeException("No more EEID's left");
		}
		return res;
	}
	
	public static void registerEntity() {
		createEntity(EntityMushroomMob.class, "Mushroom Mob", 0xAF0505, 0xFFE6B2);
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor){
		int randomId = findGlobalUniqueEntityId();
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, MobBlockMod.instance, 64, 1, true, solidColor, spotColor);
		
	}

}
