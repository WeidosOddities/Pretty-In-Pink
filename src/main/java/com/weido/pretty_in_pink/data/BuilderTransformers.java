package com.weido.pretty_in_pink.data;

import com.simibubi.create.AllTags;
import com.simibubi.create.foundation.data.SharedProperties;
import com.tterrag.registrate.builders.BlockBuilder;
import com.tterrag.registrate.util.nullness.NonNullUnaryOperator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import static com.simibubi.create.foundation.data.TagGen.*;

public class BuilderTransformers {
    public static <B extends Block, P>NonNullUnaryOperator<BlockBuilder<B, P>> sharedBlock() {
        return b -> b.initialProperties(SharedProperties::softMetal)
                .properties(p -> p.sound(SoundType.NETHERITE_BLOCK).noOcclusion())
                .properties(BlockBehaviour.Properties::requiresCorrectToolForDrops)
                .transform(pickaxeOnly())
                .tag(AllTags.AllBlockTags.WRENCH_PICKUP.tag);
    }
}
