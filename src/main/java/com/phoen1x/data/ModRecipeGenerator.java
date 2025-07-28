package com.phoen1x.data;

import com.phoen1x.CrateDelightPort;
import com.phoen1x.registry.BlockRegistry;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

public class ModRecipeGenerator extends RecipeGenerator {
    private final RegistryEntryLookup<Item> itemLookup;

    protected ModRecipeGenerator(RegistryWrapper.WrapperLookup registries, RecipeExporter exporter) {
        super(registries, exporter);
        itemLookup = registries.getOrThrow(RegistryKeys.ITEM);
    }

    @Override
    public void generate() {
        compressBlockRecipe(BlockRegistry.CARROT_CRATE_ITEM, Items.CARROT, exporter);
        compressBlockRecipe(BlockRegistry.POTATO_CRATE_ITEM, Items.POTATO, exporter);
        compressBlockRecipe(BlockRegistry.BEETROOT_CRATE_ITEM, Items.BEETROOT, exporter);
        compressBlockRecipe(BlockRegistry.APPLE_CRATE_ITEM, Items.APPLE, exporter);
        compressBlockRecipe(BlockRegistry.BERRY_CRATE_ITEM, Items.SWEET_BERRIES, exporter);
        compressBlockRecipe(BlockRegistry.GLOWBERRY_CRATE_ITEM, Items.GLOW_BERRIES, exporter);
        compressBlockRecipe(BlockRegistry.EGG_CRATE_ITEM, Items.EGG, exporter);
        compressBlockRecipe(BlockRegistry.SALMON_CRATE_ITEM, Items.SALMON, exporter);
        compressBlockRecipe(BlockRegistry.COD_CRATE_ITEM, Items.COD, exporter);
        compressBlockRecipe(BlockRegistry.RED_MUSHROOM_CRATE_ITEM, Items.RED_MUSHROOM, exporter);
        compressBlockRecipe(BlockRegistry.BROWN_MUSHROOM_CRATE_ITEM, Items.BROWN_MUSHROOM, exporter);
        compressBlockRecipe(BlockRegistry.GOLDEN_CARROT_CRATE_ITEM, Items.GOLDEN_CARROT, exporter);
        compressBlockRecipe(BlockRegistry.GOLDEN_APPLE_CRATE_ITEM, Items.GOLDEN_APPLE, exporter);
        compressBlockRecipe(BlockRegistry.COCOABEANS_BAG_ITEM, Items.COCOA_BEANS, exporter);
        compressBlockRecipe(BlockRegistry.SUGAR_BAG_ITEM, Items.SUGAR, exporter);
        compressBlockRecipe(BlockRegistry.GUNPOWDER_BAG_ITEM, Items.GUNPOWDER, exporter);
        compressBlockRecipe(BlockRegistry.COOKIE_BAG_ITEM, Items.COOKIE, exporter);
        compressBlockRecipe(BlockRegistry.SALT_BAG_ITEM, Items.SUGAR, exporter);
        compressBlockRecipe(BlockRegistry.WHEAT_FLOUR_BAG_ITEM, Items.WHEAT, exporter);
        compressBlockRecipe(BlockRegistry.POWDERED_OBSIDIAN_BAG_ITEM, Items.OBSIDIAN, exporter);
        compressBlockRecipe(BlockRegistry.CINDER_FLOUR_BAG_ITEM, Items.NETHERRACK, exporter);
        compressBlockRecipe(BlockRegistry.ENDER_DUST_BAG_ITEM, Items.ENDER_PEARL, exporter);
    }

    private void compressBlockRecipe(Item blockItem, Item item, RecipeExporter exporter){
        createShaped(RecipeCategory.DECORATIONS, blockItem, 1)
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', item)
                .criterion(hasItem(item), conditionsFromItem(item))
                .offerTo(exporter);
        createShapeless(RecipeCategory.FOOD, item, 9)
                .input(blockItem, 1)
                .criterion(hasItem(blockItem), conditionsFromItem(blockItem))
                .offerTo(exporter, Identifier.of(CrateDelightPort.MOD_ID, getRecipeName(blockItem) + "_to_" + getRecipeName(item)).toString());
    }
}