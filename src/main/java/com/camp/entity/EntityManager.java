package com.camp.entity;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityManager {

	public static void mainRegistry() {
		registerEntity();
		spawnEntity();

	}

	public static void registerEntity() {
		createEntity(CustomEntityPassive.class, "CustomEntityPassive", 0x00FFFF, 0xFF00FF);
		createEntity(AdamMob.class, "AdamMob", 0x00FFF0, 0xFF0000);
		createEntity(MPEMob.class, "MPEMob", 0x00F000, 0xFFF00F);
		createEntity(LilithMob.class, "LilithMob", 0xFFF5EE, 0xFFFFFF);


	}

	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor) {
		int entityId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, entityId);
		EntityList.entityEggs.put(Integer.valueOf(entityId), new EntityList.EntityEggInfo(entityId, solidColor, spotColor));
	}
	public static void addSpawn(Class entityClass, int probability, int min, int max, EnumCreatureType type) {
	    for (int i = 0; i < BiomeGenBase.getBiomeGenArray().length; i++) {
	        if (BiomeGenBase.getBiomeGenArray()[i] != null) {
	            EntityRegistry.addSpawn(entityClass, probability, min, max, type, BiomeGenBase.getBiomeGenArray()[i]); } }
	    }
	    public static void spawnEntity() {
	        addSpawn(AdamMob.class, 10, 1, 5, EnumCreatureType.monster);
	        addSpawn(LilithMob.class, 10, 1, 5, EnumCreatureType.monster);
	        addSpawn(MPEMob.class, 500, 1, 5, EnumCreatureType.monster);
	        addSpawn(LilithMob.class, 10, 1, 5, EnumCreatureType.monster);
	    }
 
}


