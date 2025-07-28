package com.phoen1x.registry;

import com.phoen1x.CrateDelightPort;
import com.phoen1x.block.SimplePolyBlock;
import com.phoen1x.block.TexturedPolyBlockItem;
import eu.pb4.polymer.core.api.item.PolymerItemGroupUtils;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import java.util.function.Function;

public class BlockRegistry {

    public static final Block CARROT_CRATE = registerBlock("carrot_crate", settings -> new SimplePolyBlock(settings, "carrot_crate"), Block.Settings.copy(Blocks.OAK_PLANKS));
    public static final BlockItem CARROT_CRATE_ITEM = registerBlockItem("carrot_crate", settings -> new TexturedPolyBlockItem(CARROT_CRATE, settings), new Item.Settings());

    public static final Block POTATO_CRATE = registerBlock("potato_crate", settings -> new SimplePolyBlock(settings, "potato_crate"), Block.Settings.copy(Blocks.OAK_PLANKS));
    public static final BlockItem POTATO_CRATE_ITEM = registerBlockItem("potato_crate", settings -> new TexturedPolyBlockItem(POTATO_CRATE, settings), new Item.Settings());

    public static final Block BEETROOT_CRATE = registerBlock("beetroot_crate", settings -> new SimplePolyBlock(settings, "beetroot_crate"), Block.Settings.copy(Blocks.OAK_PLANKS));
    public static final BlockItem BEETROOT_CRATE_ITEM = registerBlockItem("beetroot_crate", settings -> new TexturedPolyBlockItem(BEETROOT_CRATE, settings), new Item.Settings());

    public static final Block APPLE_CRATE = registerBlock("apple_crate", settings -> new SimplePolyBlock(settings, "apple_crate"), Block.Settings.copy(Blocks.OAK_PLANKS));
    public static final BlockItem APPLE_CRATE_ITEM = registerBlockItem("apple_crate", settings -> new TexturedPolyBlockItem(APPLE_CRATE, settings), new Item.Settings());

    public static final Block DIAMOND_APPLE_CRATE = registerBlock("diamond_apple_crate", settings -> new SimplePolyBlock(settings, "diamond_apple_crate"), Block.Settings.copy(Blocks.OAK_PLANKS));
    public static final BlockItem DIAMOND_APPLE_CRATE_ITEM = registerBlockItem("diamond_apple_crate", settings -> new TexturedPolyBlockItem(DIAMOND_APPLE_CRATE, settings), new Item.Settings());

    public static final Block BERRY_CRATE = registerBlock("berry_crate", settings -> new SimplePolyBlock(settings, "berry_crate"), Block.Settings.copy(Blocks.OAK_PLANKS));
    public static final BlockItem BERRY_CRATE_ITEM = registerBlockItem("berry_crate", settings -> new TexturedPolyBlockItem(BERRY_CRATE, settings), new Item.Settings());

    public static final Block BLUEBERRY_CRATE = registerBlock("blueberry_crate", settings -> new SimplePolyBlock(settings, "blueberry_crate"), Block.Settings.copy(Blocks.OAK_PLANKS));
    public static final BlockItem BLUEBERRY_CRATE_ITEM = registerBlockItem("blueberry_crate", settings -> new TexturedPolyBlockItem(BLUEBERRY_CRATE, settings), new Item.Settings());

    public static final Block BLACK_BERRY_CRATE = registerBlock("black_berry_crate", settings -> new SimplePolyBlock(settings, "black_berry_crate"), Block.Settings.copy(Blocks.OAK_PLANKS));
    public static final BlockItem BLACK_BERRY_CRATE_ITEM = registerBlockItem("black_berry_crate", settings -> new TexturedPolyBlockItem(BLACK_BERRY_CRATE, settings), new Item.Settings());

    public static final Block GREEN_BERRY_CRATE = registerBlock("green_berry_crate", settings -> new SimplePolyBlock(settings, "green_berry_crate"), Block.Settings.copy(Blocks.OAK_PLANKS));
    public static final BlockItem GREEN_BERRY_CRATE_ITEM = registerBlockItem("green_berry_crate", settings -> new TexturedPolyBlockItem(GREEN_BERRY_CRATE, settings), new Item.Settings());

    public static final Block ORANGE_BERRY_CRATE = registerBlock("orange_berry_crate", settings -> new SimplePolyBlock(settings, "orange_berry_crate"), Block.Settings.copy(Blocks.OAK_PLANKS));
    public static final BlockItem ORANGE_BERRY_CRATE_ITEM = registerBlockItem("orange_berry_crate", settings -> new TexturedPolyBlockItem(ORANGE_BERRY_CRATE, settings), new Item.Settings());

    public static final Block YELLOW_BERRY_CRATE = registerBlock("yellow_berry_crate", settings -> new SimplePolyBlock(settings, "yellow_berry_crate"), Block.Settings.copy(Blocks.OAK_PLANKS));
    public static final BlockItem YELLOW_BERRY_CRATE_ITEM = registerBlockItem("yellow_berry_crate", settings -> new TexturedPolyBlockItem(YELLOW_BERRY_CRATE, settings), new Item.Settings());

    public static final Block PURPLE_BERRY_CRATE = registerBlock("purple_berry_crate", settings -> new SimplePolyBlock(settings, "purple_berry_crate"), Block.Settings.copy(Blocks.OAK_PLANKS));
    public static final BlockItem PURPLE_BERRY_CRATE_ITEM = registerBlockItem("purple_berry_crate", settings -> new TexturedPolyBlockItem(PURPLE_BERRY_CRATE, settings), new Item.Settings());

    public static final Block GLOWBERRY_CRATE = registerBlock("glowberry_crate", settings -> new SimplePolyBlock(settings, "glowberry_crate"), Block.Settings.copy(Blocks.OAK_PLANKS).luminance((state) -> 13));
    public static final BlockItem GLOWBERRY_CRATE_ITEM = registerBlockItem("glowberry_crate", settings -> new TexturedPolyBlockItem(GLOWBERRY_CRATE, settings), new Item.Settings());

    public static final Block EGG_CRATE = registerBlock("egg_crate", settings -> new SimplePolyBlock(settings, "egg_crate"), Block.Settings.copy(Blocks.OAK_PLANKS));
    public static final BlockItem EGG_CRATE_ITEM = registerBlockItem("egg_crate", settings -> new TexturedPolyBlockItem(EGG_CRATE, settings), new Item.Settings());

    public static final Block DUCK_EGG_CRATE = registerBlock("duck_egg_crate", settings -> new SimplePolyBlock(settings, "duck_egg_crate"), Block.Settings.copy(Blocks.OAK_PLANKS));
    public static final BlockItem DUCK_EGG_CRATE_ITEM = registerBlockItem("duck_egg_crate", settings -> new TexturedPolyBlockItem(DUCK_EGG_CRATE, settings), new Item.Settings());

    public static final Block PEANUT_CRATE = registerBlock("peanut_crate", settings -> new SimplePolyBlock(settings, "peanut_crate"), Block.Settings.copy(Blocks.OAK_PLANKS));
    public static final BlockItem PEANUT_CRATE_ITEM = registerBlockItem("peanut_crate", settings -> new TexturedPolyBlockItem(PEANUT_CRATE, settings), new Item.Settings());

    public static final Block KIWI_EGG_CRATE = registerBlock("kiwi_egg_crate", settings -> new SimplePolyBlock(settings, "kiwi_egg_crate"), Block.Settings.copy(Blocks.OAK_PLANKS));
    public static final BlockItem KIWI_EGG_CRATE_ITEM = registerBlockItem("kiwi_egg_crate", settings -> new TexturedPolyBlockItem(KIWI_EGG_CRATE, settings), new Item.Settings());

    public static final Block KIWIFRUIT_CRATE = registerBlock("kiwifruit_crate", settings -> new SimplePolyBlock(settings, "kiwifruit_crate"), Block.Settings.copy(Blocks.OAK_PLANKS));
    public static final BlockItem KIWIFRUIT_CRATE_ITEM = registerBlockItem("kiwifruit_crate", settings -> new TexturedPolyBlockItem(KIWIFRUIT_CRATE, settings), new Item.Settings());

    public static final Block SALMON_CRATE = registerBlock("salmon_crate", settings -> new SimplePolyBlock(settings, "salmon_crate"), Block.Settings.copy(Blocks.OAK_PLANKS));
    public static final BlockItem SALMON_CRATE_ITEM = registerBlockItem("salmon_crate", settings -> new TexturedPolyBlockItem(SALMON_CRATE, settings), new Item.Settings());

    public static final Block COD_CRATE = registerBlock("cod_crate", settings -> new SimplePolyBlock(settings, "cod_crate"), Block.Settings.copy(Blocks.OAK_PLANKS));
    public static final BlockItem COD_CRATE_ITEM = registerBlockItem("cod_crate", settings -> new TexturedPolyBlockItem(COD_CRATE, settings), new Item.Settings());

    public static final Block CATFISH_CRATE = registerBlock("catfish_crate", settings -> new SimplePolyBlock(settings, "catfish_crate"), Block.Settings.copy(Blocks.OAK_PLANKS));
    public static final BlockItem CATFISH_CRATE_ITEM = registerBlockItem("catfish_crate", settings -> new TexturedPolyBlockItem(CATFISH_CRATE, settings), new Item.Settings());

    public static final Block BASS_CRATE = registerBlock("bass_crate", settings -> new SimplePolyBlock(settings, "bass_crate"), Block.Settings.copy(Blocks.OAK_PLANKS));
    public static final BlockItem BASS_CRATE_ITEM = registerBlockItem("bass_crate", settings -> new TexturedPolyBlockItem(BASS_CRATE, settings), new Item.Settings());

    public static final Block END_FISH_CRATE = registerBlock("end_fish_crate", settings -> new SimplePolyBlock(settings, "end_fish_crate"), Block.Settings.copy(Blocks.OAK_PLANKS));
    public static final BlockItem END_FISH_CRATE_ITEM = registerBlockItem("end_fish_crate", settings -> new TexturedPolyBlockItem(END_FISH_CRATE, settings), new Item.Settings());

    public static final Block RED_MUSHROOM_CRATE = registerBlock("red_mushroom_crate", settings -> new SimplePolyBlock(settings, "red_mushroom_crate"), Block.Settings.copy(Blocks.OAK_PLANKS));
    public static final BlockItem RED_MUSHROOM_CRATE_ITEM = registerBlockItem("red_mushroom_crate", settings -> new TexturedPolyBlockItem(RED_MUSHROOM_CRATE, settings), new Item.Settings());

    public static final Block BROWN_MUSHROOM_CRATE = registerBlock("brown_mushroom_crate", settings -> new SimplePolyBlock(settings, "brown_mushroom_crate"), Block.Settings.copy(Blocks.OAK_PLANKS));
    public static final BlockItem BROWN_MUSHROOM_CRATE_ITEM = registerBlockItem("brown_mushroom_crate", settings -> new TexturedPolyBlockItem(BROWN_MUSHROOM_CRATE, settings), new Item.Settings());

    public static final Block GOLDEN_CARROT_CRATE = registerBlock("golden_carrot_crate", settings -> new SimplePolyBlock(settings, "golden_carrot_crate"), Block.Settings.copy(Blocks.OAK_PLANKS));
    public static final BlockItem GOLDEN_CARROT_CRATE_ITEM = registerBlockItem("golden_carrot_crate", settings -> new TexturedPolyBlockItem(GOLDEN_CARROT_CRATE, settings), new Item.Settings());

    public static final Block GOLDEN_APPLE_CRATE = registerBlock("golden_apple_crate", settings -> new SimplePolyBlock(settings, "golden_apple_crate"), Block.Settings.copy(Blocks.OAK_PLANKS));
    public static final BlockItem GOLDEN_APPLE_CRATE_ITEM = registerBlockItem("golden_apple_crate", settings -> new TexturedPolyBlockItem(GOLDEN_APPLE_CRATE, settings), new Item.Settings());

    public static final Block COCOABEANS_BAG = registerBlock("cocoabeans_bag", settings -> new SimplePolyBlock(settings, "cocoabeans_bag"), Block.Settings.copy(Blocks.WHITE_WOOL));
    public static final BlockItem COCOABEANS_BAG_ITEM = registerBlockItem("cocoabeans_bag", settings -> new TexturedPolyBlockItem(COCOABEANS_BAG, settings), new Item.Settings());

    public static final Block SUGAR_BAG = registerBlock("sugar_bag", settings -> new SimplePolyBlock(settings, "sugar_bag"), Block.Settings.copy(Blocks.WHITE_WOOL));
    public static final BlockItem SUGAR_BAG_ITEM = registerBlockItem("sugar_bag", settings -> new TexturedPolyBlockItem(SUGAR_BAG, settings), new Item.Settings());

    public static final Block GUNPOWDER_BAG = registerBlock("gunpowder_bag", settings -> new SimplePolyBlock(settings, "gunpowder_bag"), Block.Settings.copy(Blocks.WHITE_WOOL));
    public static final BlockItem GUNPOWDER_BAG_ITEM = registerBlockItem("gunpowder_bag", settings -> new TexturedPolyBlockItem(GUNPOWDER_BAG, settings), new Item.Settings());

    public static final Block COOKIE_BAG = registerBlock("cookie_bag", settings -> new SimplePolyBlock(settings, "cookie_bag"), Block.Settings.copy(Blocks.WHITE_WOOL));
    public static final BlockItem COOKIE_BAG_ITEM = registerBlockItem("cookie_bag", settings -> new TexturedPolyBlockItem(COOKIE_BAG, settings), new Item.Settings());

    public static final Block SALT_BAG = registerBlock("salt_bag", settings -> new SimplePolyBlock(settings, "salt_bag"), Block.Settings.copy(Blocks.WHITE_WOOL));
    public static final BlockItem SALT_BAG_ITEM = registerBlockItem("salt_bag", settings -> new TexturedPolyBlockItem(SALT_BAG, settings), new Item.Settings());

    public static final Block GROUND_CINNAMON_BAG = registerBlock("ground_cinnamon_bag", settings -> new SimplePolyBlock(settings, "ground_cinnamon_bag"), Block.Settings.copy(Blocks.WHITE_WOOL));
    public static final BlockItem GROUND_CINNAMON_BAG_ITEM = registerBlockItem("ground_cinnamon_bag", settings -> new TexturedPolyBlockItem(GROUND_CINNAMON_BAG, settings), new Item.Settings());

    public static final Block WHEAT_FLOUR_BAG = registerBlock("wheat_flour_bag", settings -> new SimplePolyBlock(settings, "wheat_flour_bag"), Block.Settings.copy(Blocks.WHITE_WOOL));
    public static final BlockItem WHEAT_FLOUR_BAG_ITEM = registerBlockItem("wheat_flour_bag", settings -> new TexturedPolyBlockItem(WHEAT_FLOUR_BAG, settings), new Item.Settings());

    public static final Block POWDERED_OBSIDIAN_BAG = registerBlock("powdered_obsidian_bag", settings -> new SimplePolyBlock(settings, "powdered_obsidian_bag"), Block.Settings.copy(Blocks.WHITE_WOOL));
    public static final BlockItem POWDERED_OBSIDIAN_BAG_ITEM = registerBlockItem("powdered_obsidian_bag", settings -> new TexturedPolyBlockItem(POWDERED_OBSIDIAN_BAG, settings), new Item.Settings());

    public static final Block CINDER_FLOUR_BAG = registerBlock("cinder_flour_bag", settings -> new SimplePolyBlock(settings, "cinder_flour_bag"), Block.Settings.copy(Blocks.WHITE_WOOL));
    public static final BlockItem CINDER_FLOUR_BAG_ITEM = registerBlockItem("cinder_flour_bag", settings -> new TexturedPolyBlockItem(CINDER_FLOUR_BAG, settings), new Item.Settings());

    public static final Block ENDER_DUST_BAG = registerBlock("ender_dust_bag", settings -> new SimplePolyBlock(settings, "ender_dust_bag"), Block.Settings.copy(Blocks.WHITE_WOOL));
    public static final BlockItem ENDER_DUST_BAG_ITEM = registerBlockItem("ender_dust_bag", settings -> new TexturedPolyBlockItem(ENDER_DUST_BAG, settings), new Item.Settings());

    public static void registerModBlocks() {
        ItemGroup.Builder builder = PolymerItemGroupUtils.builder();
        builder.icon(() -> new ItemStack(BlockRegistry.BERRY_CRATE_ITEM, 1));
        builder.displayName(Text.translatable("itemGroup." + CrateDelightPort.MOD_ID));

        builder.entries((displayContext, entries) -> {
            if (!FabricLoader.getInstance().isModLoaded("farmersdelight")) {
                entries.add(BlockRegistry.CARROT_CRATE);
                entries.add(BlockRegistry.POTATO_CRATE);
                entries.add(BlockRegistry.BEETROOT_CRATE);
            }

            entries.add(BlockRegistry.APPLE_CRATE);

            if (FabricLoader.getInstance().isModLoaded("diamond_apples")) {
                entries.add(BlockRegistry.DIAMOND_APPLE_CRATE);
            }

            entries.add(BlockRegistry.BERRY_CRATE);

            if (FabricLoader.getInstance().isModLoaded("nutritious-feast") || FabricLoader.getInstance().isModLoaded("moreberries")) {
                entries.add(BlockRegistry.BLUEBERRY_CRATE);
            }

            if (FabricLoader.getInstance().isModLoaded("moreberries")) {
                entries.add(BlockRegistry.BLACK_BERRY_CRATE);
                entries.add(BlockRegistry.GREEN_BERRY_CRATE);
                entries.add(BlockRegistry.ORANGE_BERRY_CRATE);
                entries.add(BlockRegistry.YELLOW_BERRY_CRATE);
                entries.add(BlockRegistry.PURPLE_BERRY_CRATE);
            }

            entries.add(BlockRegistry.GLOWBERRY_CRATE);
            entries.add(BlockRegistry.EGG_CRATE);

            if (FabricLoader.getInstance().isModLoaded("naturalist")) {
                entries.add(BlockRegistry.DUCK_EGG_CRATE);
            }

            if (FabricLoader.getInstance().isModLoaded("expandeddelight")) {
                entries.add(BlockRegistry.PEANUT_CRATE);
            }

            if (FabricLoader.getInstance().isModLoaded("jagmkiwis")) {
                entries.add(BlockRegistry.KIWI_EGG_CRATE);
                entries.add(BlockRegistry.KIWIFRUIT_CRATE);
            }

            entries.add(BlockRegistry.SALMON_CRATE);
            entries.add(BlockRegistry.COD_CRATE);

            if (FabricLoader.getInstance().isModLoaded("naturalist")) {
                entries.add(BlockRegistry.CATFISH_CRATE);
                entries.add(BlockRegistry.BASS_CRATE);
            }

            if (FabricLoader.getInstance().isModLoaded("betterend")) {
                entries.add(BlockRegistry.END_FISH_CRATE);
            }

            entries.add(BlockRegistry.RED_MUSHROOM_CRATE);
            entries.add(BlockRegistry.BROWN_MUSHROOM_CRATE);
            entries.add(BlockRegistry.GOLDEN_CARROT_CRATE);
            entries.add(BlockRegistry.GOLDEN_APPLE_CRATE);
            entries.add(BlockRegistry.COCOABEANS_BAG);
            entries.add(BlockRegistry.SUGAR_BAG);
            entries.add(BlockRegistry.GUNPOWDER_BAG);
            entries.add(BlockRegistry.COOKIE_BAG);

            if (FabricLoader.getInstance().isModLoaded("expandeddelight")) {
                entries.add(BlockRegistry.SALT_BAG);
                entries.add(BlockRegistry.GROUND_CINNAMON_BAG);
            }

            if (FabricLoader.getInstance().isModLoaded("create")) {
                entries.add(BlockRegistry.WHEAT_FLOUR_BAG);
                entries.add(BlockRegistry.POWDERED_OBSIDIAN_BAG);
                entries.add(BlockRegistry.CINDER_FLOUR_BAG);
            }

            if (FabricLoader.getInstance().isModLoaded("betterend")) {
                entries.add(BlockRegistry.ENDER_DUST_BAG);
            }
        });
        ItemGroup polymerGroup = builder.build();
        PolymerItemGroupUtils.registerPolymerItemGroup(Identifier.of(CrateDelightPort.MOD_ID, "items"), polymerGroup);
        CrateDelightPort.LOGGER.info("Registering Item Groups for " + CrateDelightPort.MOD_ID);
    }

    public static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        var key = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(CrateDelightPort.MOD_ID, name));
        Block block = factory.apply(settings.registryKey(key));
        return Registry.register(Registries.BLOCK, key, block);
    }

    public static BlockItem registerBlockItem(String name, Function<Item.Settings, BlockItem> factory, Item.Settings settings) {
        var key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CrateDelightPort.MOD_ID, name));
        BlockItem item = factory.apply(settings.registryKey(key).useBlockPrefixedTranslationKey());
        return Registry.register(Registries.ITEM, key, item);
    }
}