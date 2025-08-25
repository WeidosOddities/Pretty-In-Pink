package com.weido.pretty_in_pink.registry;

import com.simibubi.create.AllItems;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.DataIngredient;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.weido.pretty_in_pink.PrettyInPink;
import com.weido.pretty_in_pink.blocks.SteelDirectionalBlock;
import com.weido.pretty_in_pink.blocks.SteelBlock;
import com.weido.pretty_in_pink.blocks.SteelHullBlock;
import com.weido.pretty_in_pink.data.BuilderTransformers;
import net.minecraft.core.Direction;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PNPBlocks {
    private static final CreateRegistrate REGISTRATE = PrettyInPink.registrate();

    public static final Map<String, BlockEntry<SteelBlock>> BRUSHED_STEEL_BLOCKS = new HashMap<>();

    public static MutableComponent TAB_TITLE = add("itemGroup", "base", PrettyInPink.MOD_NAME + " 🗿");

    static {
        REGISTRATE.setCreativeTab(PNPCreativeModeTabs.BASE_CREATIVE_TAB);
    }

    record DyeColor(String name, MapColor color) {}

    static final List<DyeColor> COLORS = List.of(
        new DyeColor("pink", MapColor.COLOR_PINK),
        new DyeColor("magenta", MapColor.COLOR_MAGENTA),
        new DyeColor("maroon", MapColor.COLOR_RED),
        new DyeColor("red", MapColor.COLOR_RED),
        new DyeColor("orange", MapColor.COLOR_ORANGE),
        new DyeColor("vermilion", MapColor.COLOR_ORANGE),
        new DyeColor("yellow", MapColor.COLOR_YELLOW),
        new DyeColor("cyan", MapColor.COLOR_CYAN),
        new DyeColor("pine_green", MapColor.COLOR_GREEN),
        new DyeColor("olive", MapColor.COLOR_GREEN),
        new DyeColor("green", MapColor.COLOR_GREEN),
        new DyeColor("lime", MapColor.COLOR_LIGHT_GREEN),
        new DyeColor("chartreuse", MapColor.COLOR_LIGHT_GREEN),
        new DyeColor("sea_green", MapColor.COLOR_CYAN),
        new DyeColor("turquoise", MapColor.COLOR_CYAN),
        new DyeColor("light_blue", MapColor.COLOR_LIGHT_BLUE),
        new DyeColor("blue", MapColor.COLOR_BLUE),
        new DyeColor("royal_blue", MapColor.COLOR_BLUE),
        new DyeColor("purple", MapColor.COLOR_PURPLE),
        new DyeColor("brown", MapColor.COLOR_BROWN),
        new DyeColor("white", MapColor.COLOR_LIGHT_GRAY),
        new DyeColor("light_gray", MapColor.COLOR_LIGHT_GRAY),
        new DyeColor("gray", MapColor.COLOR_GRAY),
        new DyeColor("black", MapColor.COLOR_BLACK)
    );

    static {
        for (DyeColor color : COLORS) {
            String colorName = color.name();
            MapColor mapColor = color.color();

            BlockEntry<SteelBlock> entry = REGISTRATE.block(colorName + "_steel_block", SteelBlock::new)
                .transform(BuilderTransformers.sharedBlock())
                .properties(p -> p.mapColor(mapColor))
                .blockstate((c, p) -> p.simpleBlock(c.get(), p.models().getExistingFile(p.modLoc("block/" + colorName + "/steel_block"))))
                    .recipe((c, p) -> {
                        p.stonecutting(DataIngredient.items(AllItems.ANDESITE_ALLOY.get()), RecipeCategory.DECORATIONS, c, 2);
                        p.stonecutting(DataIngredient.items(c), RecipeCategory.DECORATIONS, AllItems.ANDESITE_ALLOY, 2);
                    })
                .lang(capitalize(colorName) + " " + capitalize("steel_block"))
                .item()
                .model((c, p) -> p.withExistingParent(c.getName(), p.modLoc("block/" + colorName + "/steel_block")))
                .build()
                .register();

            registerBlocks(colorName, mapColor, "corrugated_steel");
            registerBlocks(colorName, mapColor, "steel_tank");
            registerBlocks(colorName, mapColor, "brushed_steel");
            registerBlocks(colorName, mapColor, "steel_boiler");

            registerHulls(colorName, mapColor, "steel_hull");
            registerHulls(colorName, mapColor, "brushed_steel_hull");

            BRUSHED_STEEL_BLOCKS.put(colorName, entry);
        }
    }

    private static void registerBlocks(String colorName, MapColor mapColor, String type) {
        REGISTRATE.block(colorName + "_" + type, SteelDirectionalBlock::new)
            .transform(BuilderTransformers.sharedBlock())
            .properties(p -> p.mapColor(mapColor))
            .blockstate((c, p) -> p.directionalBlock(c.get(), p.models().getExistingFile(p.modLoc("block/" + colorName + "/" + type))))
                .recipe((c, p) -> {
                    p.stonecutting(DataIngredient.items(AllItems.ANDESITE_ALLOY.get()), RecipeCategory.DECORATIONS, c, 2);
                    p.stonecutting(DataIngredient.items(c), RecipeCategory.DECORATIONS, AllItems.ANDESITE_ALLOY, 2);
                })
            .lang(capitalize(colorName) + " " + capitalize(type))
            .item()
            .model((c, p) -> p.withExistingParent(c.getName(), p.modLoc("block/" + colorName + "/" + type)))
            .build()
            .register();
    }

    private static void registerHulls(String colorName, MapColor mapColor, String type) {
        REGISTRATE.block(colorName + "_" + type, SteelHullBlock::new)
            .transform(BuilderTransformers.sharedBlock())
            .properties(p -> p.mapColor(mapColor))
            .blockstate((c, p) -> p.getVariantBuilder(c.get())
                .forAllStates(state -> {
                    Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                    boolean raised = state.getValue(SteelHullBlock.RAISED);
                    String modelName = raised ? type + "_raised" : type;
                    int y = switch (facing) {
                        case NORTH -> 90;
                        case EAST -> 180;
                        case SOUTH -> 270;
                        default -> 0;
                    };
                    return ConfiguredModel.builder()
                        .modelFile(p.models().getExistingFile(p.modLoc("block/" + colorName + "/" + modelName)))
                        .rotationX(0)
                        .rotationY(y)
                        .build();
                })
            )
                .recipe((c, p) -> {
                    p.stonecutting(DataIngredient.items(AllItems.ANDESITE_ALLOY.get()), RecipeCategory.DECORATIONS, c, 2);
                    p.stonecutting(DataIngredient.items(c), RecipeCategory.DECORATIONS, AllItems.ANDESITE_ALLOY, 2);
                })
            .lang(capitalize(colorName) + " " + capitalize(type))
            .item()
            .model((c, p) -> p.withExistingParent(c.getName(), p.modLoc("block/" + colorName + "/" + type)))
            .build()
            .register();
    }

    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) return str;
        str = str.replace("_", " ");
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static MutableComponent add(String type, String key, String lang) {
        return REGISTRATE.addLang(type, PrettyInPink.asResource(key), lang);
    }

    public static void register() { }
}
