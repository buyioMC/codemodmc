//if you want to use mixin,add " "AbstractFurnaceBlockEntityMixin" " to codemod.mixins.json

//package io.github.buyiomc.mixin;
//
//import io.github.buyiomc.item.ModItems;
//import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
//import net.minecraft.item.Item;
//import org.jetbrains.annotations.Nullable;
//import org.spongepowered.asm.mixin.Mixin;
//import org.spongepowered.asm.mixin.Shadow;
//import org.spongepowered.asm.mixin.injection.At;
//import org.spongepowered.asm.mixin.injection.Inject;
//import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
//import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
//
//import java.util.Map;
//
//
//@Mixin(AbstractFurnaceBlockEntity.class)
//public abstract class AbstractFurnaceBlockEntityMixin {
//    @Shadow private static volatile @Nullable Map<Item, Integer> fuelTimes;
//
//    @Inject(method = "createFuelTimeMap", at = @At("TAIL"))
//    private static void addFuelTimeMap(CallbackInfoReturnable<Map<Item, Integer>> cir) {
//        fuelTimes.put(ModItems.NULL_POINTER_EXCEPTION, 1600);
//    }
//}