package io.github.junyali.tutorialmod;

import io.github.junyali.tutorialmod.block.ModBlocks;
import io.github.junyali.tutorialmod.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.fml.common.Mod;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(TutorialMod.MODID)
public class TutorialMod {
    public static final String MODID = "tutorialmod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public TutorialMod(IEventBus eventBus, ModContainer container) {
        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        eventBus.addListener(this::addCreativeTabs);
    }

    private void addCreativeTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.HACKITE);
            event.accept(ModItems.RAW_HACKITE);
        }

        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.HACKITE_ORE);
            event.accept(ModBlocks.DEEPSLATE_HACKITE_ORE);
            event.accept(ModBlocks.HACKITE_BLOCK);
        }

        if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(ModItems.HACKITE_SWORD);
        }

        if (event.getTabKey() == CreativeModeTabs.INVENTORY) {
            event.accept(ModItems.HACKITE_PICKAXE);
            event.accept(ModItems.HACKITE_AXE);
            event.accept(ModItems.HACKITE_SHOVEL);
            event.accept(ModItems.HACKITE_HOE);
        }
    }

}
