package io.github.fourmisain.perfectaccuracy.mixin;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(Projectile.class)
public abstract class ProjectileEntityMixin {
	@Shadow @Nullable
	public abstract Entity getOwner();

	@ModifyVariable(method = "shoot(DDDFF)V", at = @At("HEAD"), ordinal = 1, argsOnly = true)
	public float removeDivergenceForPlayers(float divergence) {
		if (getOwner() instanceof Player) return 0;
		return divergence;
	}
}
