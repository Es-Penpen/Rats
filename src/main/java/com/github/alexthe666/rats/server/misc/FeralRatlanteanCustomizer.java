package com.github.alexthe666.rats.server.misc;

import com.github.alexthe666.rats.server.entity.monster.FeralRatlantean;
import net.minecraft.network.syncher.EntityDataAccessor;

public class FeralRatlanteanCustomizer {

	public int getColorVariant(FeralRatlantean feralRatlantean, EntityDataAccessor<Integer> colorVar) {
		return feralRatlantean.getEntityData().get(colorVar);
	}

	public void setColorVariant(FeralRatlantean feralRatlantean, EntityDataAccessor<Integer> colorVar, int color) {
		feralRatlantean.getEntityData().set(colorVar, color);
	}

	public void setToga(FeralRatlantean feralRatlantean, EntityDataAccessor<Boolean> toga, boolean plague) {
		feralRatlantean.getEntityData().set(toga, plague);
	}

	public boolean hasToga(FeralRatlantean feralRatlantean, EntityDataAccessor<Boolean> toga) {
		return feralRatlantean.getEntityData().get(toga);
	}
}
