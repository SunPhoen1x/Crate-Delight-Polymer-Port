package com.phoen1x.data;

import com.phoen1x.registry.BlockRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(BlockRegistry.CARROT_CRATE);
        addDrop(BlockRegistry.POTATO_CRATE);
        addDrop(BlockRegistry.BEETROOT_CRATE);
        addDrop(BlockRegistry.APPLE_CRATE);
        addDrop(BlockRegistry.DIAMOND_APPLE_CRATE);
        addDrop(BlockRegistry.BERRY_CRATE);
        addDrop(BlockRegistry.BLUEBERRY_CRATE);
        addDrop(BlockRegistry.BLACK_BERRY_CRATE);
        addDrop(BlockRegistry.GREEN_BERRY_CRATE);
        addDrop(BlockRegistry.ORANGE_BERRY_CRATE);
        addDrop(BlockRegistry.YELLOW_BERRY_CRATE);
        addDrop(BlockRegistry.PURPLE_BERRY_CRATE);
        addDrop(BlockRegistry.GLOWBERRY_CRATE);
        addDrop(BlockRegistry.EGG_CRATE);
        addDrop(BlockRegistry.DUCK_EGG_CRATE);
        addDrop(BlockRegistry.PEANUT_CRATE);
        addDrop(BlockRegistry.KIWI_EGG_CRATE);
        addDrop(BlockRegistry.KIWIFRUIT_CRATE);
        addDrop(BlockRegistry.SALMON_CRATE);
        addDrop(BlockRegistry.COD_CRATE);
        addDrop(BlockRegistry.CATFISH_CRATE);
        addDrop(BlockRegistry.BASS_CRATE);
        addDrop(BlockRegistry.END_FISH_CRATE);
        addDrop(BlockRegistry.RED_MUSHROOM_CRATE);
        addDrop(BlockRegistry.BROWN_MUSHROOM_CRATE);
        addDrop(BlockRegistry.GOLDEN_CARROT_CRATE);
        addDrop(BlockRegistry.GOLDEN_APPLE_CRATE);
        addDrop(BlockRegistry.COCOABEANS_BAG);
        addDrop(BlockRegistry.SUGAR_BAG);
        addDrop(BlockRegistry.GUNPOWDER_BAG);
        addDrop(BlockRegistry.COOKIE_BAG);
        addDrop(BlockRegistry.SALT_BAG);
        addDrop(BlockRegistry.GROUND_CINNAMON_BAG);
        addDrop(BlockRegistry.WHEAT_FLOUR_BAG);
        addDrop(BlockRegistry.POWDERED_OBSIDIAN_BAG);
        addDrop(BlockRegistry.CINDER_FLOUR_BAG);
        addDrop(BlockRegistry.ENDER_DUST_BAG);
    }
}