package io.github.fourmisain.perfectaccuracy.mixin;

import net.minecraft.entity.projectile.FishingBobberEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(FishingBobberEntity.class)
public abstract class FishingBobberEntityMixin {
	@ModifyConstant(method = "<init>(Lnet/minecraft/entity/player/PlayerEntity;Lnet/minecraft/world/World;II)V",
		constant = @Constant(doubleValue = 0.0045D))
	public double modifyDivergence(double divergence) {
		return 0D;
	}
}
