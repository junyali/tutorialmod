package io.github.junyali.tutorialmod.block;

import io.github.junyali.tutorialmod.TutorialMod;
import io.github.junyali.tutorialmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(TutorialMod.MODID);

    public static final DeferredBlock<Block> HACKITE_ORE = registerBlock("hackite_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f)
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> DEEPSLATE_HACKITE_ORE = registerBlock("deepslate_hackite_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f)
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> HACKITE_BLOCK = registerBlock("hackite_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f)
                    .sound(SoundType.STONE)));

    // helper functions
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
