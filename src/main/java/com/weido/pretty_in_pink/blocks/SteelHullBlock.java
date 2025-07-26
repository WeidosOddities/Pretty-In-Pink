package com.weido.pretty_in_pink.blocks;

import com.simibubi.create.content.equipment.wrench.IWrenchable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class SteelHullBlock extends Block implements IWrenchable {
    //Steam 'N Rails Boiler Implementation

    public static final EnumProperty<Direction> HORIZONTAL_FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final BooleanProperty RAISED = BooleanProperty.create("raised");

    public SteelHullBlock(Properties properties) {
        super(properties);
        registerDefaultState(defaultBlockState()
            .setValue(HORIZONTAL_FACING, Direction.NORTH)
            .setValue(RAISED, false)
        );
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(HORIZONTAL_FACING, RAISED);
    }

    @Override
    public BlockState getRotatedBlockState(BlockState originalState, Direction targetedFace) {
        originalState.getValue(HORIZONTAL_FACING);
        return IWrenchable.super.getRotatedBlockState(originalState, targetedFace);
    }

    @Override
    public boolean skipRendering(@NotNull BlockState state, BlockState adjacentBlockState, @NotNull Direction direction) {
        return adjacentBlockState.is(this)
                && adjacentBlockState.getValue(HORIZONTAL_FACING) == state.getValue(HORIZONTAL_FACING)
                && adjacentBlockState.getValue(RAISED) == state.getValue(RAISED);
    }

    @Override
    public @NotNull VoxelShape getOcclusionShape(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos) {
        return Shapes.empty();
    }

    @Override
    public float getShadeBrightness(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos) {
        return 1.0f;
    }

    @Override
    public @NotNull BlockState rotate(@NotNull BlockState state, Rotation rotation) {
        return switch (rotation) {
            case COUNTERCLOCKWISE_90, CLOCKWISE_90 -> state.cycle(HORIZONTAL_FACING);
            default -> state;
        };
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        boolean raised = context.getPlayer() != null && context.getPlayer().isShiftKeyDown();
        Direction direction = context.getHorizontalDirection();
        return defaultBlockState()
                .setValue(HORIZONTAL_FACING, direction)
                .setValue(RAISED, raised);
    }
}
