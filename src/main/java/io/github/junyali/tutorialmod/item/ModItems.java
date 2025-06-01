package io.github.junyali.tutorialmod.item;

import io.github.junyali.tutorialmod.TutorialMod;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TutorialMod.MODID);

    public static final DeferredItem<Item> HACKITE = ITEMS.register("hackite",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_HACKITE = ITEMS.register("raw_hackite",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<SwordItem> HACKITE_SWORD = ITEMS.register("hackite_sword",
            () -> new SwordItem(ModToolTiers.HACKITE_TIER, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.HACKITE_TIER, 3, -2.4F))));

    public static final DeferredItem<PickaxeItem> HACKITE_PICKAXE = ITEMS.register("hackite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.HACKITE_TIER, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.HACKITE_TIER, 1.0F, -2.8F))));

    public static final DeferredItem<AxeItem> HACKITE_AXE = ITEMS.register("hackite_axe",
            () -> new AxeItem(ModToolTiers.HACKITE_TIER, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.HACKITE_TIER, 5.0F, -3.0F))));

    public static final DeferredItem<ShovelItem> HACKITE_SHOVEL = ITEMS.register("hackite_shovel",
            () -> new ShovelItem(ModToolTiers.HACKITE_TIER, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.HACKITE_TIER, 1.5F, -3.0F))));

    public static final DeferredItem<HoeItem> HACKITE_HOE = ITEMS.register("hackite_hoe",
            () -> new HoeItem(ModToolTiers.HACKITE_TIER, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.HACKITE_TIER, -3.0F, 0.0F))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
