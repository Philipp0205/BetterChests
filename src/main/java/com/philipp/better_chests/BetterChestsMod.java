package com.philipp.better_chests;

import net.fabricmc.api.ModInitializer;
import com.philipp.better_chests.blocks.ChestControllerBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterChestsMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("better_chests");

    // Blocks
    public static Block CHEST_CONTROLLER_BLOCK;
    public static BlockEntityType<ChestControllerBlockEntity> CHEST_CONTROLLER_BLOCK_ENTITY;


    @Override
    public void onInitialize() {
		// Create and register chest controller block, block entity and block item.
        CHEST_CONTROLLER_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));
        CHEST_CONTROLLER_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                "better_chests:chest_controller_block_entity",
                FabricBlockEntityTypeBuilder.create(ChestControllerBlockEntity::new, CHEST_CONTROLLER_BLOCK).build(null));

		Registry.register(Registry.BLOCK, new Identifier("better_chests", "chest_controller_block"), CHEST_CONTROLLER_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("better_chests", "chest_controller_block"),
                new BlockItem(CHEST_CONTROLLER_BLOCK, new Item.Settings().group(ItemGroup.MISC)));

        LOGGER.info("Hello Fabric world!");
    }
}
