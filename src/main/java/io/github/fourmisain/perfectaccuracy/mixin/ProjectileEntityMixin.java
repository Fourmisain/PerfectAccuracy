package io.github.fourmisain.perfectaccuracy.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ProjectileEntity.class)
public abstract class ProjectileEntityMixin {
	@Shadow @Nullable
	private Entity owner;

	@ModifyVariable(method = "setVelocity(DDDFF)V", at = @At("HEAD"), ordinal = 1, argsOnly = true)
	public float removeDivergenceForPlayers(float divergence) {
		if (owner instanceof PlayerEntity) return 0;
		return divergence;
	}
}
