package io.github.fourmisain.perfectaccuracy.mixin;

import net.minecraft.item.ThrowablePotionItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(ThrowablePotionItem.class)
public abstract class ThrowablePotionItemMixin {
	@ModifyConstant(method = "use",
		constant = @Constant(floatValue = 1.0F, ordinal = 0))
	public float modifyDivergence(float divergence) {
		return 0F;
	}
}
