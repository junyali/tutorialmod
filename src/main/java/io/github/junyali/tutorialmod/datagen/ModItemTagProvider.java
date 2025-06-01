package io.github.junyali.tutorialmod.datagen;

import io.github.junyali.tutorialmod.TutorialMod;
import io.github.junyali.tutorialmod.item.ModItems;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, TutorialMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.SWORDS)
                .add(ModItems.HACKITE_SWORD.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.HACKITE_PICKAXE.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.HACKITE_SHOVEL.get());
        tag(ItemTags.AXES)
                .add(ModItems.HACKITE_AXE.get());
        tag(ItemTags.HOES)
                .add(ModItems.HACKITE_HOE.get());
    }
}
