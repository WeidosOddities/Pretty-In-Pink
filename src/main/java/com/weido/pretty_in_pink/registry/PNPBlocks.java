package com.weido.pretty_in_pink.registry;

import com.simibubi.create.AllTags;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.data.SharedProperties;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.weido.pretty_in_pink.PrettyInPink;
import com.weido.pretty_in_pink.blocks.SteelBoilerBlock;
import com.weido.pretty_in_pink.blocks.SteelHullBlock;
import com.weido.pretty_in_pink.blocks.SteelBlock;
import com.weido.pretty_in_pink.blocks.SteelPillarBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

import static com.simibubi.create.foundation.data.TagGen.*;

public class PNPBlocks {
    private static final CreateRegistrate REGISTRATE = PrettyInPink.registrate();

    static {
        REGISTRATE.setCreativeTab(PNPCreativeModeTabs.BASE_CREATIVE_TAB);
    }

    public static <T extends Block> BlockEntry<T> registerBlock(String name, BlockFactory<T> factory, MapColor color, SoundType sound) {
        return REGISTRATE
                .block(name, factory::create)
                .initialProperties(SharedProperties::softMetal)
                .properties(BlockBehaviour.Properties::requiresCorrectToolForDrops)
                .properties(p -> p.noOcclusion().mapColor(color).sound(sound).strength(2f,6f))
                .blockstate((c, p) -> p.simpleBlock(c.get()))
                .simpleItem()
                .transform(pickaxeOnly())
                .tag(AllTags.AllBlockTags.WRENCH_PICKUP.tag)
                .register();
    }

    @FunctionalInterface
    public interface BlockFactory<T extends Block> {
        T create(Block.Properties properties);
    }

    //There is a way better way to implement these, but I decided the hard way was more fun (I just don't know how yet)
    public static final BlockEntry<SteelPillarBlock> PINK_BRUSHED_STEEL = registerBlock(
            "pink_brushed_steel", SteelPillarBlock::new, MapColor.COLOR_PINK, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> PINK_STEEL_TANK = registerBlock(
            "pink_steel_tank", SteelPillarBlock::new, MapColor.COLOR_PINK, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> PINK_CORRUGATED_STEEL = registerBlock(
            "pink_corrugated_steel", SteelPillarBlock::new, MapColor.COLOR_PINK, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBlock> PINK_STEEL_BLOCK = registerBlock(
            "pink_steel_block", SteelBlock::new, MapColor.COLOR_PINK, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBoilerBlock> PINK_STEEL_BOILER = registerBlock(
            "pink_steel_boiler", SteelBoilerBlock::new, MapColor.COLOR_PINK, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> PINK_STEEL_HULL = registerBlock(
            "pink_steel_hull", SteelHullBlock::new, MapColor.COLOR_PINK, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> PINK_BRUSHED_STEEL_HULL = registerBlock(
            "pink_brushed_steel_hull", SteelHullBlock::new, MapColor.COLOR_PINK, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<SteelPillarBlock> MAGENTA_BRUSHED_STEEL = registerBlock(
            "magenta_brushed_steel", SteelPillarBlock::new, MapColor.COLOR_MAGENTA, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> MAGENTA_STEEL_TANK = registerBlock(
            "magenta_steel_tank", SteelPillarBlock::new, MapColor.COLOR_MAGENTA, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> MAGENTA_CORRUGATED_STEEL = registerBlock(
            "magenta_corrugated_steel", SteelPillarBlock::new, MapColor.COLOR_MAGENTA, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBlock> MAGENTA_STEEL_BLOCK = registerBlock(
            "magenta_steel_block", SteelBlock::new, MapColor.COLOR_MAGENTA, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBoilerBlock> MAGENTA_STEEL_BOILER = registerBlock(
            "magenta_steel_boiler", SteelBoilerBlock::new, MapColor.COLOR_MAGENTA, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> MAGENTA_STEEL_HULL = registerBlock(
            "magenta_steel_hull", SteelHullBlock::new, MapColor.COLOR_MAGENTA, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> MAGENTA_BRUSHED_STEEL_HULL = registerBlock(
            "magenta_brushed_steel_hull", SteelHullBlock::new, MapColor.COLOR_MAGENTA, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<SteelPillarBlock> MAROON_BRUSHED_STEEL = registerBlock(
            "maroon_brushed_steel", SteelPillarBlock::new, MapColor.COLOR_RED, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> MAROON_STEEL_TANK = registerBlock(
            "maroon_steel_tank", SteelPillarBlock::new, MapColor.COLOR_RED, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> MAROON_CORRUGATED_STEEL = registerBlock(
            "maroon_corrugated_steel", SteelPillarBlock::new, MapColor.COLOR_RED, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBlock> MAROON_STEEL_BLOCK = registerBlock(
            "maroon_steel_block", SteelBlock::new, MapColor.COLOR_RED, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBoilerBlock> MAROON_STEEL_BOILER = registerBlock(
            "maroon_steel_boiler", SteelBoilerBlock::new, MapColor.COLOR_RED, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> MAROON_STEEL_HULL = registerBlock(
            "maroon_steel_hull", SteelHullBlock::new, MapColor.COLOR_RED, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> MAROON_BRUSHED_STEEL_HULL = registerBlock(
            "maroon_brushed_steel_hull", SteelHullBlock::new, MapColor.COLOR_RED, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<SteelPillarBlock> RED_BRUSHED_STEEL = registerBlock(
            "red_brushed_steel", SteelPillarBlock::new, MapColor.COLOR_RED, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> RED_STEEL_TANK = registerBlock(
            "red_steel_tank", SteelPillarBlock::new, MapColor.COLOR_RED, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> RED_CORRUGATED_STEEL = registerBlock(
            "red_corrugated_steel", SteelPillarBlock::new, MapColor.COLOR_RED, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBlock> RED_STEEL_BLOCK = registerBlock(
            "red_steel_block", SteelBlock::new, MapColor.COLOR_RED, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBoilerBlock> RED_STEEL_BOILER = registerBlock(
            "red_steel_boiler", SteelBoilerBlock::new, MapColor.COLOR_RED, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> RED_STEEL_HULL = registerBlock(
            "red_steel_hull", SteelHullBlock::new, MapColor.COLOR_RED, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> RED_BRUSHED_STEEL_HULL = registerBlock(
            "red_brushed_steel_hull", SteelHullBlock::new, MapColor.COLOR_RED, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<SteelPillarBlock> ORANGE_BRUSHED_STEEL = registerBlock(
            "orange_brushed_steel", SteelPillarBlock::new, MapColor.COLOR_ORANGE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> ORANGE_STEEL_TANK = registerBlock(
            "orange_steel_tank", SteelPillarBlock::new, MapColor.COLOR_ORANGE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> ORANGE_CORRUGATED_STEEL = registerBlock(
            "orange_corrugated_steel", SteelPillarBlock::new, MapColor.COLOR_ORANGE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBlock> ORANGE_STEEL_BLOCK = registerBlock(
            "orange_steel_block", SteelBlock::new, MapColor.COLOR_ORANGE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBoilerBlock> ORANGE_STEEL_BOILER = registerBlock(
            "orange_steel_boiler", SteelBoilerBlock::new, MapColor.COLOR_ORANGE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> ORANGE_STEEL_HULL = registerBlock(
            "orange_steel_hull", SteelHullBlock::new, MapColor.COLOR_ORANGE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> ORANGE_BRUSHED_STEEL_HULL = registerBlock(
            "orange_brushed_steel_hull", SteelHullBlock::new, MapColor.COLOR_ORANGE, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<SteelPillarBlock> VERMILION_BRUSHED_STEEL = registerBlock(
            "vermilion_brushed_steel", SteelPillarBlock::new, MapColor.COLOR_ORANGE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> VERMILION_STEEL_TANK = registerBlock(
            "vermilion_steel_tank", SteelPillarBlock::new, MapColor.COLOR_ORANGE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> VERMILION_CORRUGATED_STEEL = registerBlock(
            "vermilion_corrugated_steel", SteelPillarBlock::new, MapColor.COLOR_ORANGE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBlock> VERMILION_STEEL_BLOCK = registerBlock(
            "vermilion_steel_block", SteelBlock::new, MapColor.COLOR_ORANGE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBoilerBlock> VERMILION_STEEL_BOILER = registerBlock(
            "vermilion_steel_boiler", SteelBoilerBlock::new, MapColor.COLOR_ORANGE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> VERMILION_STEEL_HULL = registerBlock(
            "vermilion_steel_hull", SteelHullBlock::new, MapColor.COLOR_ORANGE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> VERMILION_BRUSHED_STEEL_HULL = registerBlock(
            "vermilion_brushed_steel_hull", SteelHullBlock::new, MapColor.COLOR_ORANGE, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<SteelPillarBlock> YELLOW_BRUSHED_STEEL = registerBlock(
            "yellow_brushed_steel", SteelPillarBlock::new, MapColor.COLOR_YELLOW, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> YELLOW_STEEL_TANK = registerBlock(
            "yellow_steel_tank", SteelPillarBlock::new, MapColor.COLOR_YELLOW, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> YELLOW_CORRUGATED_STEEL = registerBlock(
            "yellow_corrugated_steel", SteelPillarBlock::new, MapColor.COLOR_YELLOW, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBlock> YELLOW_STEEL_BLOCK = registerBlock(
            "yellow_steel_block", SteelBlock::new, MapColor.COLOR_YELLOW, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBoilerBlock> YELLOW_STEEL_BOILER = registerBlock(
            "yellow_steel_boiler", SteelBoilerBlock::new, MapColor.COLOR_YELLOW, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> YELLOW_STEEL_HULL = registerBlock(
            "yellow_steel_hull", SteelHullBlock::new, MapColor.COLOR_YELLOW, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> YELLOW_BRUSHED_STEEL_HULL = registerBlock(
            "yellow_brushed_steel_hull", SteelHullBlock::new, MapColor.COLOR_YELLOW, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<SteelPillarBlock> CYAN_BRUSHED_STEEL = registerBlock(
            "cyan_brushed_steel", SteelPillarBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> CYAN_STEEL_TANK = registerBlock(
            "cyan_steel_tank", SteelPillarBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> CYAN_CORRUGATED_STEEL = registerBlock(
            "cyan_corrugated_steel", SteelPillarBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBlock> CYAN_STEEL_BLOCK = registerBlock(
            "cyan_steel_block", SteelBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBoilerBlock> CYAN_STEEL_BOILER = registerBlock(
            "cyan_steel_boiler", SteelBoilerBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> CYAN_STEEL_HULL = registerBlock(
            "cyan_steel_hull", SteelHullBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> CYAN_BRUSHED_STEEL_HULL = registerBlock(
            "cyan_brushed_steel_hull", SteelHullBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<SteelPillarBlock> PINE_GREEN_BRUSHED_STEEL = registerBlock(
            "pine_green_brushed_steel", SteelPillarBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> PINE_GREEN_STEEL_TANK = registerBlock(
            "pine_green_steel_tank", SteelPillarBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> PINE_GREEN_CORRUGATED_STEEL = registerBlock(
            "pine_green_corrugated_steel", SteelPillarBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBlock> PINE_GREEN_STEEL_BLOCK = registerBlock(
            "pine_green_steel_block", SteelBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBoilerBlock> PINE_GREEN_STEEL_BOILER = registerBlock(
            "pine_green_steel_boiler", SteelBoilerBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> PINE_GREEN_STEEL_HULL = registerBlock(
            "pine_green_steel_hull", SteelHullBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> PINE_GREEN_BRUSHED_STEEL_HULL = registerBlock(
            "pine_green_brushed_steel_hull", SteelHullBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<SteelPillarBlock> GREEN_BRUSHED_STEEL = registerBlock(
            "green_brushed_steel", SteelPillarBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> GREEN_STEEL_TANK = registerBlock(
            "green_steel_tank", SteelPillarBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> GREEN_CORRUGATED_STEEL = registerBlock(
            "green_corrugated_steel", SteelPillarBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBlock> GREEN_STEEL_BLOCK = registerBlock(
            "green_steel_block", SteelBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBoilerBlock> GREEN_STEEL_BOILER = registerBlock(
            "green_steel_boiler", SteelBoilerBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> GREEN_STEEL_HULL = registerBlock(
            "green_steel_hull", SteelHullBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> GREEN_BRUSHED_STEEL_HULL = registerBlock(
            "green_brushed_steel_hull", SteelHullBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<SteelPillarBlock> OLIVE_BRUSHED_STEEL = registerBlock(
            "olive_brushed_steel", SteelPillarBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> OLIVE_STEEL_TANK = registerBlock(
            "olive_steel_tank", SteelPillarBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> OLIVE_CORRUGATED_STEEL = registerBlock(
            "olive_corrugated_steel", SteelPillarBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBlock> OLIVE_STEEL_BLOCK = registerBlock(
            "olive_steel_block", SteelBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBoilerBlock> OLIVE_STEEL_BOILER = registerBlock(
            "olive_steel_boiler", SteelBoilerBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> OLIVE_STEEL_HULL = registerBlock(
            "olive_steel_hull", SteelHullBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> OLIVE_BRUSHED_STEEL_HULL = registerBlock(
            "olive_brushed_steel_hull", SteelHullBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<SteelPillarBlock> LIME_BRUSHED_STEEL = registerBlock(
            "lime_brushed_steel", SteelPillarBlock::new, MapColor.COLOR_LIGHT_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> LIME_STEEL_TANK = registerBlock(
            "lime_steel_tank", SteelPillarBlock::new, MapColor.COLOR_LIGHT_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> LIME_CORRUGATED_STEEL = registerBlock(
            "lime_corrugated_steel", SteelPillarBlock::new, MapColor.COLOR_LIGHT_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBlock> LIME_STEEL_BLOCK = registerBlock(
            "lime_steel_block", SteelBlock::new, MapColor.COLOR_LIGHT_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBoilerBlock> LIME_STEEL_BOILER = registerBlock(
            "lime_steel_boiler", SteelBoilerBlock::new, MapColor.COLOR_LIGHT_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> LIME_STEEL_HULL = registerBlock(
            "lime_steel_hull", SteelHullBlock::new, MapColor.COLOR_LIGHT_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> LIME_BRUSHED_STEEL_HULL = registerBlock(
            "lime_brushed_steel_hull", SteelHullBlock::new, MapColor.COLOR_LIGHT_GREEN, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<SteelPillarBlock> CHARTREUSE_BRUSHED_STEEL = registerBlock(
            "chartreuse_brushed_steel", SteelPillarBlock::new, MapColor.COLOR_LIGHT_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> CHARTREUSE_STEEL_TANK = registerBlock(
            "chartreuse_steel_tank", SteelPillarBlock::new, MapColor.COLOR_LIGHT_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> CHARTREUSE_CORRUGATED_STEEL = registerBlock(
            "chartreuse_corrugated_steel", SteelPillarBlock::new, MapColor.COLOR_LIGHT_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBlock> CHARTREUSE_STEEL_BLOCK = registerBlock(
            "chartreuse_steel_block", SteelBlock::new, MapColor.COLOR_LIGHT_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBoilerBlock> CHARTREUSE_STEEL_BOILER = registerBlock(
            "chartreuse_steel_boiler", SteelBoilerBlock::new, MapColor.COLOR_LIGHT_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> CHARTREUSE_STEEL_HULL = registerBlock(
            "chartreuse_steel_hull", SteelHullBlock::new, MapColor.COLOR_LIGHT_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> CHARTREUSE_BRUSHED_STEEL_HULL = registerBlock(
            "chartreuse_brushed_steel_hull", SteelHullBlock::new, MapColor.COLOR_LIGHT_GREEN, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<SteelPillarBlock> SEA_GREEN_BRUSHED_STEEL = registerBlock(
            "sea_green_brushed_steel", SteelPillarBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> SEA_GREEN_STEEL_TANK = registerBlock(
            "sea_green_steel_tank", SteelPillarBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> SEA_GREEN_CORRUGATED_STEEL = registerBlock(
            "sea_green_corrugated_steel", SteelPillarBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBlock> SEA_GREEN_STEEL_BLOCK = registerBlock(
            "sea_green_steel_block", SteelBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBoilerBlock> SEA_GREEN_STEEL_BOILER = registerBlock(
            "sea_green_steel_boiler", SteelBoilerBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> SEA_GREEN_STEEL_HULL = registerBlock(
            "sea_green_steel_hull", SteelHullBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> SEA_GREEN_BRUSHED_STEEL_HULL = registerBlock(
            "sea_green_brushed_steel_hull", SteelHullBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<SteelPillarBlock> TURQUOISE_BRUSHED_STEEL = registerBlock(
            "turquoise_brushed_steel", SteelPillarBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> TURQUOISE_STEEL_TANK = registerBlock(
            "turquoise_steel_tank", SteelPillarBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> TURQUOISE_CORRUGATED_STEEL = registerBlock(
            "turquoise_corrugated_steel", SteelPillarBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBlock> TURQUOISE_STEEL_BLOCK = registerBlock(
            "turquoise_steel_block", SteelBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBoilerBlock> TURQUOISE_STEEL_BOILER = registerBlock(
            "turquoise_steel_boiler", SteelBoilerBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> TURQUOISE_STEEL_HULL = registerBlock(
            "turquoise_steel_hull", SteelHullBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> TURQUOISE_BRUSHED_STEEL_HULL = registerBlock(
            "turquoise_brushed_steel_hull", SteelHullBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<SteelPillarBlock> LIGHT_BLUE_BRUSHED_STEEL = registerBlock(
            "light_blue_brushed_steel", SteelPillarBlock::new, MapColor.COLOR_LIGHT_BLUE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> LIGHT_BLUE_STEEL_TANK = registerBlock(
            "light_blue_steel_tank", SteelPillarBlock::new, MapColor.COLOR_LIGHT_BLUE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> LIGHT_BLUE_CORRUGATED_STEEL = registerBlock(
            "light_blue_corrugated_steel", SteelPillarBlock::new, MapColor.COLOR_LIGHT_BLUE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBlock> LIGHT_BLUE_STEEL_BLOCK = registerBlock(
            "light_blue_steel_block", SteelBlock::new, MapColor.COLOR_LIGHT_BLUE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBoilerBlock> LIGHT_BLUE_STEEL_BOILER = registerBlock(
            "light_blue_steel_boiler", SteelBoilerBlock::new, MapColor.COLOR_LIGHT_BLUE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> LIGHT_BLUE_STEEL_HULL = registerBlock(
            "light_blue_steel_hull", SteelHullBlock::new, MapColor.COLOR_LIGHT_BLUE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> LIGHT_BLUE_BRUSHED_STEEL_HULL = registerBlock(
            "light_blue_brushed_steel_hull", SteelHullBlock::new, MapColor.COLOR_LIGHT_BLUE, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<SteelPillarBlock> BLUE_BRUSHED_STEEL = registerBlock(
            "blue_brushed_steel", SteelPillarBlock::new, MapColor.COLOR_BLUE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> BLUE_STEEL_TANK = registerBlock(
            "blue_steel_tank", SteelPillarBlock::new, MapColor.COLOR_BLUE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> BLUE_CORRUGATED_STEEL = registerBlock(
            "blue_corrugated_steel", SteelPillarBlock::new, MapColor.COLOR_BLUE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBlock> BLUE_STEEL_BLOCK = registerBlock(
            "blue_steel_block", SteelBlock::new, MapColor.COLOR_BLUE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBoilerBlock> BLUE_STEEL_BOILER = registerBlock(
            "blue_steel_boiler", SteelBoilerBlock::new, MapColor.COLOR_BLUE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> BLUE_STEEL_HULL = registerBlock(
            "blue_steel_hull", SteelHullBlock::new, MapColor.COLOR_BLUE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> BLUE_BRUSHED_STEEL_HULL = registerBlock(
            "blue_brushed_steel_hull", SteelHullBlock::new, MapColor.COLOR_BLUE, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<SteelPillarBlock> ROYAL_BLUE_BRUSHED_STEEL = registerBlock(
            "royal_blue_brushed_steel", SteelPillarBlock::new, MapColor.COLOR_BLUE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> ROYAL_BLUE_STEEL_TANK = registerBlock(
            "royal_blue_steel_tank", SteelPillarBlock::new, MapColor.COLOR_BLUE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> ROYAL_BLUE_CORRUGATED_STEEL = registerBlock(
            "royal_blue_corrugated_steel", SteelPillarBlock::new, MapColor.COLOR_BLUE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBlock> ROYAL_BLUE_STEEL_BLOCK = registerBlock(
            "royal_blue_steel_block", SteelBlock::new, MapColor.COLOR_BLUE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBoilerBlock> ROYAL_BLUE_STEEL_BOILER = registerBlock(
            "royal_blue_steel_boiler", SteelBoilerBlock::new, MapColor.COLOR_BLUE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> ROYAL_BLUE_STEEL_HULL = registerBlock(
            "royal_blue_steel_hull", SteelHullBlock::new, MapColor.COLOR_BLUE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> ROYAL_BLUE_BRUSHED_STEEL_HULL = registerBlock(
            "royal_blue_brushed_steel_hull", SteelHullBlock::new, MapColor.COLOR_BLUE, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<SteelPillarBlock> PURPLE_BRUSHED_STEEL = registerBlock(
            "purple_brushed_steel", SteelPillarBlock::new, MapColor.COLOR_PURPLE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> PURPLE_STEEL_TANK = registerBlock(
            "purple_steel_tank", SteelPillarBlock::new, MapColor.COLOR_PURPLE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> PURPLE_CORRUGATED_STEEL = registerBlock(
            "purple_corrugated_steel", SteelPillarBlock::new, MapColor.COLOR_PURPLE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBlock> PURPLE_STEEL_BLOCK = registerBlock(
            "purple_steel_block", SteelBlock::new, MapColor.COLOR_PURPLE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBoilerBlock> PURPLE_STEEL_BOILER = registerBlock(
            "purple_steel_boiler", SteelBoilerBlock::new, MapColor.COLOR_PURPLE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> PURPLE_STEEL_HULL = registerBlock(
            "purple_steel_hull", SteelHullBlock::new, MapColor.COLOR_PURPLE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> PURPLE_BRUSHED_STEEL_HULL = registerBlock(
            "purple_brushed_steel_hull", SteelHullBlock::new, MapColor.COLOR_PURPLE, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<SteelPillarBlock> BROWN_BRUSHED_STEEL = registerBlock(
            "brown_brushed_steel", SteelPillarBlock::new, MapColor.COLOR_BROWN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> BROWN_STEEL_TANK = registerBlock(
            "brown_steel_tank", SteelPillarBlock::new, MapColor.COLOR_BROWN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> BROWN_CORRUGATED_STEEL = registerBlock(
            "brown_corrugated_steel", SteelPillarBlock::new, MapColor.COLOR_BROWN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBlock> BROWN_STEEL_BLOCK = registerBlock(
            "brown_steel_block", SteelBlock::new, MapColor.COLOR_BROWN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBoilerBlock> BROWN_STEEL_BOILER = registerBlock(
            "brown_steel_boiler", SteelBoilerBlock::new, MapColor.COLOR_BROWN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> BROWN_STEEL_HULL = registerBlock(
            "brown_steel_hull", SteelHullBlock::new, MapColor.COLOR_BROWN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> BROWN_BRUSHED_STEEL_HULL = registerBlock(
            "brown_brushed_steel_hull", SteelHullBlock::new, MapColor.COLOR_BROWN, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<SteelPillarBlock> WHITE_BRUSHED_STEEL = registerBlock(
            "white_brushed_steel", SteelPillarBlock::new, MapColor.COLOR_LIGHT_GRAY, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> WHITE_STEEL_TANK = registerBlock(
            "white_steel_tank", SteelPillarBlock::new, MapColor.COLOR_LIGHT_GRAY, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> WHITE_CORRUGATED_STEEL = registerBlock(
            "white_corrugated_steel", SteelPillarBlock::new, MapColor.COLOR_LIGHT_GRAY, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBlock> WHITE_STEEL_BLOCK = registerBlock(
            "white_steel_block", SteelBlock::new, MapColor.COLOR_LIGHT_GRAY, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBoilerBlock> WHITE_STEEL_BOILER = registerBlock(
            "white_steel_boiler", SteelBoilerBlock::new, MapColor.COLOR_LIGHT_GRAY, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> WHITE_STEEL_HULL = registerBlock(
            "white_steel_hull", SteelHullBlock::new, MapColor.COLOR_LIGHT_GRAY, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> WHITE_BRUSHED_STEEL_HULL = registerBlock(
            "white_brushed_steel_hull", SteelHullBlock::new, MapColor.COLOR_LIGHT_GRAY, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<SteelPillarBlock> LIGHT_GRAY_BRUSHED_STEEL = registerBlock(
            "light_gray_brushed_steel", SteelPillarBlock::new, MapColor.COLOR_LIGHT_GRAY, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> LIGHT_GRAY_STEEL_TANK = registerBlock(
            "light_gray_steel_tank", SteelPillarBlock::new, MapColor.COLOR_LIGHT_GRAY, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> LIGHT_GRAY_CORRUGATED_STEEL = registerBlock(
            "light_gray_corrugated_steel", SteelPillarBlock::new, MapColor.COLOR_LIGHT_GRAY, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBlock> LIGHT_GRAY_STEEL_BLOCK = registerBlock(
            "light_gray_steel_block", SteelBlock::new, MapColor.COLOR_LIGHT_GRAY, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBoilerBlock> LIGHT_GRAY_STEEL_BOILER = registerBlock(
            "light_gray_steel_boiler", SteelBoilerBlock::new, MapColor.COLOR_LIGHT_GRAY, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> LIGHT_GRAY_STEEL_HULL = registerBlock(
            "light_gray_steel_hull", SteelHullBlock::new, MapColor.COLOR_LIGHT_GRAY, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> LIGHT_GRAY_BRUSHED_STEEL_HULL = registerBlock(
            "light_gray_brushed_steel_hull", SteelHullBlock::new, MapColor.COLOR_LIGHT_GRAY, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<SteelPillarBlock> GRAY_BRUSHED_STEEL = registerBlock(
            "gray_brushed_steel", SteelPillarBlock::new, MapColor.COLOR_GRAY, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> GRAY_STEEL_TANK = registerBlock(
            "gray_steel_tank", SteelPillarBlock::new, MapColor.COLOR_GRAY, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> GRAY_CORRUGATED_STEEL = registerBlock(
            "gray_corrugated_steel", SteelPillarBlock::new, MapColor.COLOR_GRAY, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBlock> GRAY_STEEL_BLOCK = registerBlock(
            "gray_steel_block", SteelBlock::new, MapColor.COLOR_GRAY, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBoilerBlock> GRAY_STEEL_BOILER = registerBlock(
            "gray_steel_boiler", SteelBoilerBlock::new, MapColor.COLOR_GRAY, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> GRAY_STEEL_HULL = registerBlock(
            "gray_steel_hull", SteelHullBlock::new, MapColor.COLOR_GRAY, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> GRAY_BRUSHED_STEEL_HULL = registerBlock(
            "gray_brushed_steel_hull", SteelHullBlock::new, MapColor.COLOR_GRAY, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<SteelPillarBlock> BLACK_BRUSHED_STEEL = registerBlock(
            "black_brushed_steel", SteelPillarBlock::new, MapColor.COLOR_BLACK, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> BLACK_STEEL_TANK = registerBlock(
            "black_steel_tank", SteelPillarBlock::new, MapColor.COLOR_BLACK, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelPillarBlock> BLACK_CORRUGATED_STEEL = registerBlock(
            "black_corrugated_steel", SteelPillarBlock::new, MapColor.COLOR_BLACK, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBlock> BLACK_STEEL_BLOCK = registerBlock(
            "black_steel_block", SteelBlock::new, MapColor.COLOR_BLACK, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelBoilerBlock> BLACK_STEEL_BOILER = registerBlock(
            "black_steel_boiler", SteelBoilerBlock::new, MapColor.COLOR_BLACK, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> BLACK_STEEL_HULL = registerBlock(
            "black_steel_hull", SteelHullBlock::new, MapColor.COLOR_BLACK, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<SteelHullBlock> BLACK_BRUSHED_STEEL_HULL = registerBlock(
            "black_brushed_steel_hull", SteelHullBlock::new, MapColor.COLOR_BLACK, SoundType.NETHERITE_BLOCK);

    public static void register() {

    }
}
