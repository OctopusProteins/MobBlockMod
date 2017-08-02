  package com.MobBlockMod.Entity.MushroomMob;

import java.util.BitSet;

import com.MobBlockMod.MobBlockMod;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.world.biome.Biome;
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
		for (Object id : EntityList.getID()) {
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
	
	public static void registerEntity(boolean spawn) {
		createEntity(EntityMushroomMob.class, "Mushroom Mob", 0xAF0505, 0xFFE6B2);
		if (spawn) {
			EntityRegistry.addSpawn(EntityMushroomMob.class, 50, 1, 25, EnumCreatureType.AMBIENT, Biomes.FOREST, Biomes.BIRCH_FOREST, Biomes.BIRCH_FOREST_HILLS, Biomes.COLD_TAIGA, Biomes.COLD_TAIGA_HILLS, Biomes.EXTREME_HILLS, Biomes.EXTREME_HILLS_EDGE, Biomes.EXTREME_HILLS_WITH_TREES, Biomes.FOREST_HILLS, Biomes.JUNGLE, Biomes.JUNGLE_EDGE, Biomes.JUNGLE_HILLS, Biomes.ROOFED_FOREST, Biomes.SAVANNA, Biomes.SAVANNA_PLATEAU, Biomes.TAIGA_HILLS, Biomes.TAIGA);
	        EntityRegistry.addSpawn(EntityMushroomMob.class, 50, 50, 100, EnumCreatureType.AMBIENT, Biomes.MUSHROOM_ISLAND, Biomes.MUSHROOM_ISLAND_SHORE, Biome.REGISTRY.getObjectById(140));
		}
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor){
		int randomId = findGlobalUniqueEntityId();
		EntityRegistry.registerModEntity(null, entityClass, entityName, randomId, MobBlockMod.instance, 64, 1, true, solidColor, spotColor);
		
	}

}
