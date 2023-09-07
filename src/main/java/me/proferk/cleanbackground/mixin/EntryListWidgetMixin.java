package me.proferk.cleanbackground.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.widget.EntryListWidget;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntryListWidget.class)
public class EntryListWidgetMixin {
    @Inject(method = "<init>", at = @At("TAIL"))
    private void EntryListWidget(MinecraftClient client, int width, int height, int top, int bottom, int itemHeight, CallbackInfo ci) {
        ((EntryListWidget<?>) (Object) this).setRenderBackground(false);
        ((EntryListWidget<?>) (Object) this).setRenderHorizontalShadows(false);
    }
}