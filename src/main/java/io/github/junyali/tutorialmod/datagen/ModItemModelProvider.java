package io.github.junyali.tutorialmod.datagen;

import io.github.junyali.tutorialmod.TutorialMod;
import io.github.junyali.tutorialmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TutorialMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.HACKITE.get());
        basicItem(ModItems.RAW_HACKITE.get());

        handheldItem(ModItems.HACKITE_SWORD);
        handheldItem(ModItems.HACKITE_PICKAXE);
        handheldItem(ModItems.HACKITE_SHOVEL);
        handheldItem(ModItems.HACKITE_AXE);
        handheldItem(ModItems.HACKITE_HOE);
    }

    private ItemModelBuilder handheldItem(DeferredItem<?> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(TutorialMod.MODID,"item/" + item.getId().getPath()));
    }
}
