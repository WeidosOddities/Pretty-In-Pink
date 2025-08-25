package com.weido.pretty_in_pink.blocks;

import com.simibubi.create.foundation.block.WrenchableDirectionalBlock;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.state.BlockState;

public class SteelDirectionalBlock extends WrenchableDirectionalBlock {
    public SteelDirectionalBlock(Properties properties) {
        super(properties);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return defaultBlockState().setValue(FACING, context.getClickedFace());
    }
}
