package com.weido.pretty_in_pink.registry;

import com.simibubi.create.AllTags;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.data.SharedProperties;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.weido.pretty_in_pink.PrettyInPink;
import com.weido.pretty_in_pink.blocks.BoilerBlock;
import com.weido.pretty_in_pink.blocks.WrenchableHullBlock;
import com.weido.pretty_in_pink.blocks.WrenchableBlock;
import com.weido.pretty_in_pink.blocks.WrenchablePillarBlock;
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
    public static final BlockEntry<WrenchablePillarBlock> PINK_BRUSHED_STEEL = registerBlock(
            "pink_brushed_steel", WrenchablePillarBlock::new, MapColor.COLOR_PINK, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> PINK_STEEL_TANK = registerBlock(
            "pink_steel_tank", WrenchablePillarBlock::new, MapColor.COLOR_PINK, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> PINK_CORRUGATED_STEEL = registerBlock(
            "pink_corrugated_steel", WrenchablePillarBlock::new, MapColor.COLOR_PINK, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableBlock> PINK_STEEL_BLOCK = registerBlock(
            "pink_steel_block", WrenchableBlock::new, MapColor.COLOR_PINK, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<BoilerBlock> PINK_STEEL_BOILER = registerBlock(
            "pink_steel_boiler", BoilerBlock::new, MapColor.COLOR_PINK, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> PINK_STEEL_HULL = registerBlock(
            "pink_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_PINK, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> PINK_BRUSHED_STEEL_HULL = registerBlock(
            "pink_brushed_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_PINK, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<WrenchablePillarBlock> MAGENTA_BRUSHED_STEEL = registerBlock(
            "magenta_brushed_steel", WrenchablePillarBlock::new, MapColor.COLOR_MAGENTA, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> MAGENTA_STEEL_TANK = registerBlock(
            "magenta_steel_tank", WrenchablePillarBlock::new, MapColor.COLOR_MAGENTA, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> MAGENTA_CORRUGATED_STEEL = registerBlock(
            "magenta_corrugated_steel", WrenchablePillarBlock::new, MapColor.COLOR_MAGENTA, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableBlock> MAGENTA_STEEL_BLOCK = registerBlock(
            "magenta_steel_block", WrenchableBlock::new, MapColor.COLOR_MAGENTA, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<BoilerBlock> MAGENTA_STEEL_BOILER = registerBlock(
            "magenta_steel_boiler", BoilerBlock::new, MapColor.COLOR_MAGENTA, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> MAGENTA_STEEL_HULL = registerBlock(
            "magenta_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_MAGENTA, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> MAGENTA_BRUSHED_STEEL_HULL = registerBlock(
            "magenta_brushed_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_MAGENTA, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<WrenchablePillarBlock> MAROON_BRUSHED_STEEL = registerBlock(
            "maroon_brushed_steel", WrenchablePillarBlock::new, MapColor.COLOR_RED, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> MAROON_STEEL_TANK = registerBlock(
            "maroon_steel_tank", WrenchablePillarBlock::new, MapColor.COLOR_RED, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> MAROON_CORRUGATED_STEEL = registerBlock(
            "maroon_corrugated_steel", WrenchablePillarBlock::new, MapColor.COLOR_RED, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableBlock> MAROON_STEEL_BLOCK = registerBlock(
            "maroon_steel_block", WrenchableBlock::new, MapColor.COLOR_RED, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<BoilerBlock> MAROON_STEEL_BOILER = registerBlock(
            "maroon_steel_boiler", BoilerBlock::new, MapColor.COLOR_RED, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> MAROON_STEEL_HULL = registerBlock(
            "maroon_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_RED, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> MAROON_BRUSHED_STEEL_HULL = registerBlock(
            "maroon_brushed_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_RED, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<WrenchablePillarBlock> RED_BRUSHED_STEEL = registerBlock(
            "red_brushed_steel", WrenchablePillarBlock::new, MapColor.COLOR_RED, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> RED_STEEL_TANK = registerBlock(
            "red_steel_tank", WrenchablePillarBlock::new, MapColor.COLOR_RED, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> RED_CORRUGATED_STEEL = registerBlock(
            "red_corrugated_steel", WrenchablePillarBlock::new, MapColor.COLOR_RED, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableBlock> RED_STEEL_BLOCK = registerBlock(
            "red_steel_block", WrenchableBlock::new, MapColor.COLOR_RED, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<BoilerBlock> RED_STEEL_BOILER = registerBlock(
            "red_steel_boiler", BoilerBlock::new, MapColor.COLOR_RED, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> RED_STEEL_HULL = registerBlock(
            "red_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_RED, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> RED_BRUSHED_STEEL_HULL = registerBlock(
            "red_brushed_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_RED, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<WrenchablePillarBlock> ORANGE_BRUSHED_STEEL = registerBlock(
            "orange_brushed_steel", WrenchablePillarBlock::new, MapColor.COLOR_ORANGE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> ORANGE_STEEL_TANK = registerBlock(
            "orange_steel_tank", WrenchablePillarBlock::new, MapColor.COLOR_ORANGE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> ORANGE_CORRUGATED_STEEL = registerBlock(
            "orange_corrugated_steel", WrenchablePillarBlock::new, MapColor.COLOR_ORANGE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableBlock> ORANGE_STEEL_BLOCK = registerBlock(
            "orange_steel_block", WrenchableBlock::new, MapColor.COLOR_ORANGE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<BoilerBlock> ORANGE_STEEL_BOILER = registerBlock(
            "orange_steel_boiler", BoilerBlock::new, MapColor.COLOR_ORANGE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> ORANGE_STEEL_HULL = registerBlock(
            "orange_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_ORANGE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> ORANGE_BRUSHED_STEEL_HULL = registerBlock(
            "orange_brushed_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_ORANGE, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<WrenchablePillarBlock> VERMILION_BRUSHED_STEEL = registerBlock(
            "vermilion_brushed_steel", WrenchablePillarBlock::new, MapColor.COLOR_ORANGE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> VERMILION_STEEL_TANK = registerBlock(
            "vermilion_steel_tank", WrenchablePillarBlock::new, MapColor.COLOR_ORANGE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> VERMILION_CORRUGATED_STEEL = registerBlock(
            "vermilion_corrugated_steel", WrenchablePillarBlock::new, MapColor.COLOR_ORANGE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableBlock> VERMILION_STEEL_BLOCK = registerBlock(
            "vermilion_steel_block", WrenchableBlock::new, MapColor.COLOR_ORANGE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<BoilerBlock> VERMILION_STEEL_BOILER = registerBlock(
            "vermilion_steel_boiler", BoilerBlock::new, MapColor.COLOR_ORANGE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> VERMILION_STEEL_HULL = registerBlock(
            "vermilion_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_ORANGE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> VERMILION_BRUSHED_STEEL_HULL = registerBlock(
            "vermilion_brushed_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_ORANGE, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<WrenchablePillarBlock> YELLOW_BRUSHED_STEEL = registerBlock(
            "yellow_brushed_steel", WrenchablePillarBlock::new, MapColor.COLOR_YELLOW, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> YELLOW_STEEL_TANK = registerBlock(
            "yellow_steel_tank", WrenchablePillarBlock::new, MapColor.COLOR_YELLOW, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> YELLOW_CORRUGATED_STEEL = registerBlock(
            "yellow_corrugated_steel", WrenchablePillarBlock::new, MapColor.COLOR_YELLOW, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableBlock> YELLOW_STEEL_BLOCK = registerBlock(
            "yellow_steel_block", WrenchableBlock::new, MapColor.COLOR_YELLOW, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<BoilerBlock> YELLOW_STEEL_BOILER = registerBlock(
            "yellow_steel_boiler", BoilerBlock::new, MapColor.COLOR_YELLOW, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> YELLOW_STEEL_HULL = registerBlock(
            "yellow_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_YELLOW, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> YELLOW_BRUSHED_STEEL_HULL = registerBlock(
            "yellow_brushed_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_YELLOW, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<WrenchablePillarBlock> CYAN_BRUSHED_STEEL = registerBlock(
            "cyan_brushed_steel", WrenchablePillarBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> CYAN_STEEL_TANK = registerBlock(
            "cyan_steel_tank", WrenchablePillarBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> CYAN_CORRUGATED_STEEL = registerBlock(
            "cyan_corrugated_steel", WrenchablePillarBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableBlock> CYAN_STEEL_BLOCK = registerBlock(
            "cyan_steel_block", WrenchableBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<BoilerBlock> CYAN_STEEL_BOILER = registerBlock(
            "cyan_steel_boiler", BoilerBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> CYAN_STEEL_HULL = registerBlock(
            "cyan_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> CYAN_BRUSHED_STEEL_HULL = registerBlock(
            "cyan_brushed_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<WrenchablePillarBlock> PINE_GREEN_BRUSHED_STEEL = registerBlock(
            "pine_green_brushed_steel", WrenchablePillarBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> PINE_GREEN_STEEL_TANK = registerBlock(
            "pine_green_steel_tank", WrenchablePillarBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> PINE_GREEN_CORRUGATED_STEEL = registerBlock(
            "pine_green_corrugated_steel", WrenchablePillarBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableBlock> PINE_GREEN_STEEL_BLOCK = registerBlock(
            "pine_green_steel_block", WrenchableBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<BoilerBlock> PINE_GREEN_STEEL_BOILER = registerBlock(
            "pine_green_steel_boiler", BoilerBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> PINE_GREEN_STEEL_HULL = registerBlock(
            "pine_green_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> PINE_GREEN_BRUSHED_STEEL_HULL = registerBlock(
            "pine_green_brushed_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<WrenchablePillarBlock> GREEN_BRUSHED_STEEL = registerBlock(
            "green_brushed_steel", WrenchablePillarBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> GREEN_STEEL_TANK = registerBlock(
            "green_steel_tank", WrenchablePillarBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> GREEN_CORRUGATED_STEEL = registerBlock(
            "green_corrugated_steel", WrenchablePillarBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableBlock> GREEN_STEEL_BLOCK = registerBlock(
            "green_steel_block", WrenchableBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<BoilerBlock> GREEN_STEEL_BOILER = registerBlock(
            "green_steel_boiler", BoilerBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> GREEN_STEEL_HULL = registerBlock(
            "green_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> GREEN_BRUSHED_STEEL_HULL = registerBlock(
            "green_brushed_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<WrenchablePillarBlock> OLIVE_BRUSHED_STEEL = registerBlock(
            "olive_brushed_steel", WrenchablePillarBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> OLIVE_STEEL_TANK = registerBlock(
            "olive_steel_tank", WrenchablePillarBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> OLIVE_CORRUGATED_STEEL = registerBlock(
            "olive_corrugated_steel", WrenchablePillarBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableBlock> OLIVE_STEEL_BLOCK = registerBlock(
            "olive_steel_block", WrenchableBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<BoilerBlock> OLIVE_STEEL_BOILER = registerBlock(
            "olive_steel_boiler", BoilerBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> OLIVE_STEEL_HULL = registerBlock(
            "olive_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> OLIVE_BRUSHED_STEEL_HULL = registerBlock(
            "olive_brushed_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_GREEN, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<WrenchablePillarBlock> LIME_BRUSHED_STEEL = registerBlock(
            "lime_brushed_steel", WrenchablePillarBlock::new, MapColor.COLOR_LIGHT_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> LIME_STEEL_TANK = registerBlock(
            "lime_steel_tank", WrenchablePillarBlock::new, MapColor.COLOR_LIGHT_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> LIME_CORRUGATED_STEEL = registerBlock(
            "lime_corrugated_steel", WrenchablePillarBlock::new, MapColor.COLOR_LIGHT_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableBlock> LIME_STEEL_BLOCK = registerBlock(
            "lime_steel_block", WrenchableBlock::new, MapColor.COLOR_LIGHT_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<BoilerBlock> LIME_STEEL_BOILER = registerBlock(
            "lime_steel_boiler", BoilerBlock::new, MapColor.COLOR_LIGHT_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> LIME_STEEL_HULL = registerBlock(
            "lime_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_LIGHT_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> LIME_BRUSHED_STEEL_HULL = registerBlock(
            "lime_brushed_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_LIGHT_GREEN, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<WrenchablePillarBlock> CHARTREUSE_BRUSHED_STEEL = registerBlock(
            "chartreuse_brushed_steel", WrenchablePillarBlock::new, MapColor.COLOR_LIGHT_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> CHARTREUSE_STEEL_TANK = registerBlock(
            "chartreuse_steel_tank", WrenchablePillarBlock::new, MapColor.COLOR_LIGHT_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> CHARTREUSE_CORRUGATED_STEEL = registerBlock(
            "chartreuse_corrugated_steel", WrenchablePillarBlock::new, MapColor.COLOR_LIGHT_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableBlock> CHARTREUSE_STEEL_BLOCK = registerBlock(
            "chartreuse_steel_block", WrenchableBlock::new, MapColor.COLOR_LIGHT_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<BoilerBlock> CHARTREUSE_STEEL_BOILER = registerBlock(
            "chartreuse_steel_boiler", BoilerBlock::new, MapColor.COLOR_LIGHT_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> CHARTREUSE_STEEL_HULL = registerBlock(
            "chartreuse_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_LIGHT_GREEN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> CHARTREUSE_BRUSHED_STEEL_HULL = registerBlock(
            "chartreuse_brushed_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_LIGHT_GREEN, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<WrenchablePillarBlock> SEA_GREEN_BRUSHED_STEEL = registerBlock(
            "sea_green_brushed_steel", WrenchablePillarBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> SEA_GREEN_STEEL_TANK = registerBlock(
            "sea_green_steel_tank", WrenchablePillarBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> SEA_GREEN_CORRUGATED_STEEL = registerBlock(
            "sea_green_corrugated_steel", WrenchablePillarBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableBlock> SEA_GREEN_STEEL_BLOCK = registerBlock(
            "sea_green_steel_block", WrenchableBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<BoilerBlock> SEA_GREEN_STEEL_BOILER = registerBlock(
            "sea_green_steel_boiler", BoilerBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> SEA_GREEN_STEEL_HULL = registerBlock(
            "sea_green_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> SEA_GREEN_BRUSHED_STEEL_HULL = registerBlock(
            "sea_green_brushed_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<WrenchablePillarBlock> TURQUOISE_BRUSHED_STEEL = registerBlock(
            "turquoise_brushed_steel", WrenchablePillarBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> TURQUOISE_STEEL_TANK = registerBlock(
            "turquoise_steel_tank", WrenchablePillarBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> TURQUOISE_CORRUGATED_STEEL = registerBlock(
            "turquoise_corrugated_steel", WrenchablePillarBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableBlock> TURQUOISE_STEEL_BLOCK = registerBlock(
            "turquoise_steel_block", WrenchableBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<BoilerBlock> TURQUOISE_STEEL_BOILER = registerBlock(
            "turquoise_steel_boiler", BoilerBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> TURQUOISE_STEEL_HULL = registerBlock(
            "turquoise_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> TURQUOISE_BRUSHED_STEEL_HULL = registerBlock(
            "turquoise_brushed_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_CYAN, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<WrenchablePillarBlock> LIGHT_BLUE_BRUSHED_STEEL = registerBlock(
            "light_blue_brushed_steel", WrenchablePillarBlock::new, MapColor.COLOR_LIGHT_BLUE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> LIGHT_BLUE_STEEL_TANK = registerBlock(
            "light_blue_steel_tank", WrenchablePillarBlock::new, MapColor.COLOR_LIGHT_BLUE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> LIGHT_BLUE_CORRUGATED_STEEL = registerBlock(
            "light_blue_corrugated_steel", WrenchablePillarBlock::new, MapColor.COLOR_LIGHT_BLUE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableBlock> LIGHT_BLUE_STEEL_BLOCK = registerBlock(
            "light_blue_steel_block", WrenchableBlock::new, MapColor.COLOR_LIGHT_BLUE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<BoilerBlock> LIGHT_BLUE_STEEL_BOILER = registerBlock(
            "light_blue_steel_boiler", BoilerBlock::new, MapColor.COLOR_LIGHT_BLUE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> LIGHT_BLUE_STEEL_HULL = registerBlock(
            "light_blue_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_LIGHT_BLUE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> LIGHT_BLUE_BRUSHED_STEEL_HULL = registerBlock(
            "light_blue_brushed_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_LIGHT_BLUE, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<WrenchablePillarBlock> BLUE_BRUSHED_STEEL = registerBlock(
            "blue_brushed_steel", WrenchablePillarBlock::new, MapColor.COLOR_BLUE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> BLUE_STEEL_TANK = registerBlock(
            "blue_steel_tank", WrenchablePillarBlock::new, MapColor.COLOR_BLUE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> BLUE_CORRUGATED_STEEL = registerBlock(
            "blue_corrugated_steel", WrenchablePillarBlock::new, MapColor.COLOR_BLUE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableBlock> BLUE_STEEL_BLOCK = registerBlock(
            "blue_steel_block", WrenchableBlock::new, MapColor.COLOR_BLUE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<BoilerBlock> BLUE_STEEL_BOILER = registerBlock(
            "blue_steel_boiler", BoilerBlock::new, MapColor.COLOR_BLUE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> BLUE_STEEL_HULL = registerBlock(
            "blue_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_BLUE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> BLUE_BRUSHED_STEEL_HULL = registerBlock(
            "blue_brushed_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_BLUE, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<WrenchablePillarBlock> ROYAL_BLUE_BRUSHED_STEEL = registerBlock(
            "royal_blue_brushed_steel", WrenchablePillarBlock::new, MapColor.COLOR_BLUE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> ROYAL_BLUE_STEEL_TANK = registerBlock(
            "royal_blue_steel_tank", WrenchablePillarBlock::new, MapColor.COLOR_BLUE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> ROYAL_BLUE_CORRUGATED_STEEL = registerBlock(
            "royal_blue_corrugated_steel", WrenchablePillarBlock::new, MapColor.COLOR_BLUE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableBlock> ROYAL_BLUE_STEEL_BLOCK = registerBlock(
            "royal_blue_steel_block", WrenchableBlock::new, MapColor.COLOR_BLUE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<BoilerBlock> ROYAL_BLUE_STEEL_BOILER = registerBlock(
            "royal_blue_steel_boiler", BoilerBlock::new, MapColor.COLOR_BLUE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> ROYAL_BLUE_STEEL_HULL = registerBlock(
            "royal_blue_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_BLUE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> ROYAL_BLUE_BRUSHED_STEEL_HULL = registerBlock(
            "royal_blue_brushed_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_BLUE, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<WrenchablePillarBlock> PURPLE_BRUSHED_STEEL = registerBlock(
            "purple_brushed_steel", WrenchablePillarBlock::new, MapColor.COLOR_PURPLE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> PURPLE_STEEL_TANK = registerBlock(
            "purple_steel_tank", WrenchablePillarBlock::new, MapColor.COLOR_PURPLE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> PURPLE_CORRUGATED_STEEL = registerBlock(
            "purple_corrugated_steel", WrenchablePillarBlock::new, MapColor.COLOR_PURPLE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableBlock> PURPLE_STEEL_BLOCK = registerBlock(
            "purple_steel_block", WrenchableBlock::new, MapColor.COLOR_PURPLE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<BoilerBlock> PURPLE_STEEL_BOILER = registerBlock(
            "purple_steel_boiler", BoilerBlock::new, MapColor.COLOR_PURPLE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> PURPLE_STEEL_HULL = registerBlock(
            "purple_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_PURPLE, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> PURPLE_BRUSHED_STEEL_HULL = registerBlock(
            "purple_brushed_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_PURPLE, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<WrenchablePillarBlock> BROWN_BRUSHED_STEEL = registerBlock(
            "brown_brushed_steel", WrenchablePillarBlock::new, MapColor.COLOR_BROWN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> BROWN_STEEL_TANK = registerBlock(
            "brown_steel_tank", WrenchablePillarBlock::new, MapColor.COLOR_BROWN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> BROWN_CORRUGATED_STEEL = registerBlock(
            "brown_corrugated_steel", WrenchablePillarBlock::new, MapColor.COLOR_BROWN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableBlock> BROWN_STEEL_BLOCK = registerBlock(
            "brown_steel_block", WrenchableBlock::new, MapColor.COLOR_BROWN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<BoilerBlock> BROWN_STEEL_BOILER = registerBlock(
            "brown_steel_boiler", BoilerBlock::new, MapColor.COLOR_BROWN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> BROWN_STEEL_HULL = registerBlock(
            "brown_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_BROWN, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> BROWN_BRUSHED_STEEL_HULL = registerBlock(
            "brown_brushed_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_BROWN, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<WrenchablePillarBlock> WHITE_BRUSHED_STEEL = registerBlock(
            "white_brushed_steel", WrenchablePillarBlock::new, MapColor.COLOR_LIGHT_GRAY, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> WHITE_STEEL_TANK = registerBlock(
            "white_steel_tank", WrenchablePillarBlock::new, MapColor.COLOR_LIGHT_GRAY, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> WHITE_CORRUGATED_STEEL = registerBlock(
            "white_corrugated_steel", WrenchablePillarBlock::new, MapColor.COLOR_LIGHT_GRAY, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableBlock> WHITE_STEEL_BLOCK = registerBlock(
            "white_steel_block", WrenchableBlock::new, MapColor.COLOR_LIGHT_GRAY, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<BoilerBlock> WHITE_STEEL_BOILER = registerBlock(
            "white_steel_boiler", BoilerBlock::new, MapColor.COLOR_LIGHT_GRAY, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> WHITE_STEEL_HULL = registerBlock(
            "white_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_LIGHT_GRAY, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> WHITE_BRUSHED_STEEL_HULL = registerBlock(
            "white_brushed_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_LIGHT_GRAY, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<WrenchablePillarBlock> LIGHT_GRAY_BRUSHED_STEEL = registerBlock(
            "light_gray_brushed_steel", WrenchablePillarBlock::new, MapColor.COLOR_LIGHT_GRAY, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> LIGHT_GRAY_STEEL_TANK = registerBlock(
            "light_gray_steel_tank", WrenchablePillarBlock::new, MapColor.COLOR_LIGHT_GRAY, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> LIGHT_GRAY_CORRUGATED_STEEL = registerBlock(
            "light_gray_corrugated_steel", WrenchablePillarBlock::new, MapColor.COLOR_LIGHT_GRAY, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableBlock> LIGHT_GRAY_STEEL_BLOCK = registerBlock(
            "light_gray_steel_block", WrenchableBlock::new, MapColor.COLOR_LIGHT_GRAY, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<BoilerBlock> LIGHT_GRAY_STEEL_BOILER = registerBlock(
            "light_gray_steel_boiler", BoilerBlock::new, MapColor.COLOR_LIGHT_GRAY, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> LIGHT_GRAY_STEEL_HULL = registerBlock(
            "light_gray_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_LIGHT_GRAY, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> LIGHT_GRAY_BRUSHED_STEEL_HULL = registerBlock(
            "light_gray_brushed_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_LIGHT_GRAY, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<WrenchablePillarBlock> GRAY_BRUSHED_STEEL = registerBlock(
            "gray_brushed_steel", WrenchablePillarBlock::new, MapColor.COLOR_GRAY, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> GRAY_STEEL_TANK = registerBlock(
            "gray_steel_tank", WrenchablePillarBlock::new, MapColor.COLOR_GRAY, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> GRAY_CORRUGATED_STEEL = registerBlock(
            "gray_corrugated_steel", WrenchablePillarBlock::new, MapColor.COLOR_GRAY, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableBlock> GRAY_STEEL_BLOCK = registerBlock(
            "gray_steel_block", WrenchableBlock::new, MapColor.COLOR_GRAY, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<BoilerBlock> GRAY_STEEL_BOILER = registerBlock(
            "gray_steel_boiler", BoilerBlock::new, MapColor.COLOR_GRAY, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> GRAY_STEEL_HULL = registerBlock(
            "gray_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_GRAY, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> GRAY_BRUSHED_STEEL_HULL = registerBlock(
            "gray_brushed_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_GRAY, SoundType.NETHERITE_BLOCK);


    public static final BlockEntry<WrenchablePillarBlock> BLACK_BRUSHED_STEEL = registerBlock(
            "black_brushed_steel", WrenchablePillarBlock::new, MapColor.COLOR_BLACK, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> BLACK_STEEL_TANK = registerBlock(
            "black_steel_tank", WrenchablePillarBlock::new, MapColor.COLOR_BLACK, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchablePillarBlock> BLACK_CORRUGATED_STEEL = registerBlock(
            "black_corrugated_steel", WrenchablePillarBlock::new, MapColor.COLOR_BLACK, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableBlock> BLACK_STEEL_BLOCK = registerBlock(
            "black_steel_block", WrenchableBlock::new, MapColor.COLOR_BLACK, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<BoilerBlock> BLACK_STEEL_BOILER = registerBlock(
            "black_steel_boiler", BoilerBlock::new, MapColor.COLOR_BLACK, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> BLACK_STEEL_HULL = registerBlock(
            "black_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_BLACK, SoundType.NETHERITE_BLOCK);

    public static final BlockEntry<WrenchableHullBlock> BLACK_BRUSHED_STEEL_HULL = registerBlock(
            "black_brushed_steel_hull", WrenchableHullBlock::new, MapColor.COLOR_BLACK, SoundType.NETHERITE_BLOCK);

    public static void register() {

    }
}
