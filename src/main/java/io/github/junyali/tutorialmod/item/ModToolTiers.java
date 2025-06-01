package io.github.junyali.tutorialmod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier HACKITE_TIER = new SimpleTier(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            1561,
            8.0F,
            3.0F,
            10,
            () -> Ingredient.of(ModItems.HACKITE.get())
    );
}
