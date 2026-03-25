package io.github.fourmisain.perfectaccuracy.mixin;

import net.minecraft.world.entity.projectile.FishingHook;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(FishingHook.class)
public abstract class FishingBobberEntityMixin {
	// >= 1.19
	@ModifyConstant(method = "<init>(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/level/Level;II)V",
		constant = @Constant(doubleValue = 0.0103365), require = 0)
	public double modifyDeviation(double variance) {
		return 0;
	}

	// < 1.19
	@ModifyConstant(method = "<init>(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/level/Level;II)V",
			constant = @Constant(doubleValue = 0.0045), require = 0)
	public double modifyOldDeviation(double variance) {
		return 0;
	}
}
