package com.example.examplemod.mixin;

import com.example.examplemod.ExampleMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.main.GameConfig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class ExampleMixin {
    @Inject(method = "<init>", at = @At("TAIL"))
    public void init(GameConfig gameConfig, CallbackInfo ci) {
        ExampleMod.LOGGER.info("Hello from mixin!");
    }
}
