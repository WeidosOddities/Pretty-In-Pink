package com.weido.pretty_in_pink.blocks;

import com.simibubi.create.content.equipment.wrench.IWrenchable;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;

public class WrenchablePillarBlock extends RotatedPillarBlock implements IWrenchable {
    public WrenchablePillarBlock(Properties p_i48440_1_) {
        super(p_i48440_1_);
    }

    @Override
    public InteractionResult onWrenched(BlockState state, UseOnContext context) {
        return InteractionResult.FAIL;
    }
}
