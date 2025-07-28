package com.phoen1x.data;

import com.phoen1x.CrateDelightPort;
import com.phoen1x.registry.BlockRegistry;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Block;
import net.minecraft.client.data.*;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        generateCrate(blockStateModelGenerator, BlockRegistry.CARROT_CRATE, "carrot_crate");
        generateCrate(blockStateModelGenerator, BlockRegistry.POTATO_CRATE, "potato_crate");
        generateCrate(blockStateModelGenerator, BlockRegistry.BEETROOT_CRATE, "beetroot_crate");
        generateCrate(blockStateModelGenerator, BlockRegistry.APPLE_CRATE, "apple_crate");
        generateCrate(blockStateModelGenerator, BlockRegistry.DIAMOND_APPLE_CRATE, "diamond_apple_crate");
        generateCrate(blockStateModelGenerator, BlockRegistry.BERRY_CRATE, "berry_crate");
        generateCrate(blockStateModelGenerator, BlockRegistry.BLUEBERRY_CRATE, "blueberry_crate");
        generateCrate(blockStateModelGenerator, BlockRegistry.BLACK_BERRY_CRATE, "black_berry_crate");
        generateCrate(blockStateModelGenerator, BlockRegistry.GREEN_BERRY_CRATE, "green_berry_crate");
        generateCrate(blockStateModelGenerator, BlockRegistry.ORANGE_BERRY_CRATE, "orange_berry_crate");
        generateCrate(blockStateModelGenerator, BlockRegistry.YELLOW_BERRY_CRATE, "yellow_berry_crate");
        generateCrate(blockStateModelGenerator, BlockRegistry.PURPLE_BERRY_CRATE, "purple_berry_crate");
        generateCrate(blockStateModelGenerator, BlockRegistry.GLOWBERRY_CRATE, "glowberry_crate");
        generateCrate(blockStateModelGenerator, BlockRegistry.EGG_CRATE, "egg_crate");
        generateCrate(blockStateModelGenerator, BlockRegistry.DUCK_EGG_CRATE, "duck_egg_crate");
        generateCrate(blockStateModelGenerator, BlockRegistry.PEANUT_CRATE, "peanut_crate");
        generateCrate(blockStateModelGenerator, BlockRegistry.KIWI_EGG_CRATE, "kiwi_egg_crate");
        generateCrate(blockStateModelGenerator, BlockRegistry.KIWIFRUIT_CRATE, "kiwifruit_crate");
        generateCrate(blockStateModelGenerator, BlockRegistry.SALMON_CRATE, "salmon_crate");
        generateCrate(blockStateModelGenerator, BlockRegistry.COD_CRATE, "cod_crate");
        generateCrate(blockStateModelGenerator, BlockRegistry.CATFISH_CRATE, "catfish_crate");
        generateCrate(blockStateModelGenerator, BlockRegistry.BASS_CRATE, "bass_crate");
        generateCrate(blockStateModelGenerator, BlockRegistry.END_FISH_CRATE, "end_fish_crate");
        generateCrate(blockStateModelGenerator, BlockRegistry.RED_MUSHROOM_CRATE, "red_mushroom_crate");
        generateCrate(blockStateModelGenerator, BlockRegistry.BROWN_MUSHROOM_CRATE, "brown_mushroom_crate");
        generateCrate(blockStateModelGenerator, BlockRegistry.GOLDEN_CARROT_CRATE, "golden_carrot_crate");
        generateCrate(blockStateModelGenerator, BlockRegistry.GOLDEN_APPLE_CRATE, "golden_apple_crate");
        generateCrate(blockStateModelGenerator, BlockRegistry.COCOABEANS_BAG, "cocoabeans_bag");
        generateCrate(blockStateModelGenerator, BlockRegistry.SUGAR_BAG, "sugar_bag");
        generateCrate(blockStateModelGenerator, BlockRegistry.GUNPOWDER_BAG, "gunpowder_bag");
        generateCrate(blockStateModelGenerator, BlockRegistry.COOKIE_BAG, "cookie_bag");
        generateCrate(blockStateModelGenerator, BlockRegistry.SALT_BAG, "salt_bag");
        generateCrate(blockStateModelGenerator, BlockRegistry.GROUND_CINNAMON_BAG, "ground_cinnamon_bag");
        generateCrate(blockStateModelGenerator, BlockRegistry.WHEAT_FLOUR_BAG, "wheat_flour_bag");
        generateCrate(blockStateModelGenerator, BlockRegistry.POWDERED_OBSIDIAN_BAG, "powdered_obsidian_bag");
        generateCrate(blockStateModelGenerator, BlockRegistry.CINDER_FLOUR_BAG, "cinder_flour_bag");
        generateCrate(blockStateModelGenerator, BlockRegistry.ENDER_DUST_BAG, "ender_dust_bag");
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }

    public void generateCrate(BlockStateModelGenerator generator, Block generatedBlock, String path){
        generator.registerCubeWithCustomTextures(
                generatedBlock,
                generatedBlock,
                (block, otherTextureSource) -> new TextureMap()
                        .put(TextureKey.DOWN, Identifier.of(CrateDelightPort.MOD_ID, "block/crate_bottom"))
                        .put(TextureKey.UP, Identifier.of(CrateDelightPort.MOD_ID, "block/" + path + "_top"))
                        .put(TextureKey.SIDE, Identifier.of(CrateDelightPort.MOD_ID, "block/" + path + "_side"))
                        .put(TextureKey.PARTICLE, Identifier.of(CrateDelightPort.MOD_ID, "block/" + path + "_side"))
        );
    }
}