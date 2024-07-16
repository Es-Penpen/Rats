package com.github.alexthe666.rats.client.events;

import com.github.alexthe666.rats.registry.RatsCapabilityRegistry;
import com.github.alexthe666.rats.server.capability.SelectedRatCapability;
import com.github.alexthe666.rats.server.entity.rat.TamedRat;
import com.github.alexthe666.rats.server.items.RatStaffItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraftforge.common.util.LazyOptional;

import java.util.Objects;

public class RatOnStaffEvent {
	public static boolean isRatSelectedOnStaff(TamedRat rat) {
		if (Minecraft.getInstance().player != null) {
			LocalPlayer player = Minecraft.getInstance().player;
			if (player.getItemInHand(InteractionHand.MAIN_HAND).getItem() instanceof RatStaffItem || player.getItemInHand(InteractionHand.OFF_HAND).getItem() instanceof RatStaffItem) {
				LazyOptional<SelectedRatCapability> cap = player.getCapability(RatsCapabilityRegistry.SELECTED_RAT);
				return cap.resolve().isPresent() && Objects.equals(cap.resolve().get().getSelectedRat(), rat);
			}
		}
		return false;
	}
}
