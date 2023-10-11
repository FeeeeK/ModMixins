package me.axd1x8a.serverpatches.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

import at.petrak.hexcasting.interop.pehkui.OpSetScale;

@Mixin(OpSetScale.class)
public class OpSetScaleMixin {
	@ModifyConstant(method = "execute", constant = @Constant(doubleValue = 8.0), remap = false)
	public double overrideMaxSize(double original) {
		return 2.0;
	}
}
