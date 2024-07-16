package com.github.alexthe666.rats.server.inventory;

import net.minecraft.world.entity.EquipmentSlot;

public class RatEquipmentSlotConfig {
	EquipmentSlot[] equipmentConfig;

	public RatEquipmentSlotConfig(){
		equipmentConfig = new EquipmentSlot[]{
			EquipmentSlot.MAINHAND,
			EquipmentSlot.HEAD,
			EquipmentSlot.OFFHAND,
			EquipmentSlot.CHEST,
			EquipmentSlot.LEGS,
			EquipmentSlot.FEET
		};
	}

	public RatEquipmentSlotConfig(EquipmentSlot[] equipmentConfig){
		this.equipmentConfig = equipmentConfig;
	}

	// Returns index of the equipment slot in the configuration.
	// Return -1 if slot is not in configuration
	public int getIndexOfEquipmentSlot(EquipmentSlot equipSlot){
		for(int i = 0; i < equipmentConfig.length; i++){
			if(equipmentConfig[i].equals(equipSlot)){
				return i;
			}
		}
		return -1;
	}
}
