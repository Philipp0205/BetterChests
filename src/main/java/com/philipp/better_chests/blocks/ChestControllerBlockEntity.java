package com.philipp.better_chests.blocks;

import com.philipp.better_chests.BetterChestsMod;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class ChestControllerBlockEntity extends BlockEntity {

    public ChestControllerBlockEntity(BlockPos pos, BlockState state) {
        super(BetterChestsMod.CHEST_CONTROLLER_BLOCK_ENTITY, pos, state);
    }
}
