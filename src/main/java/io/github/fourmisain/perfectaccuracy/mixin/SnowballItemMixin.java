package io.github.fourmisain.perfectaccuracy.mixin;

import net.minecraft.item.SnowballItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(SnowballItem.class)
public abstract class SnowballItemMixin {
	@ModifyConstant(method = "use",
		constant = @Constant(floatValue = 1.0F, ordinal = 0))
	public float modifyDivergence(float divergence) {
		return 0F;
	}
}
