package fourmisain.perfectaccuracy.mixin;

import net.minecraft.item.EnderPearlItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(EnderPearlItem.class)
public abstract class EnderPearlItemMixin {
	@ModifyConstant(method = "use",
		constant = @Constant(floatValue = 1.0F, ordinal = 0))
	public float modifyDivergence(float divergence) {
		return 0F;
	}
}
