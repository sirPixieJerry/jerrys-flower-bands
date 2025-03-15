package net.jerrys.jerrys_flower_bands.item;

import net.jerrys.jerrys_flower_bands.JerrysFlowerBands;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    // Private constructor to prevent instantiation
    private ModCreativeModTabs() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister
            .create(Registries.CREATIVE_MODE_TAB, JerrysFlowerBands.MOD_ID);

    public static final RegistryObject<CreativeModeTab> JERRYS_FLOWER_BANDS_TAB = CREATIVE_MODE_TABS.register(
            "jerrys_flower_bands_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.BLUSH_FLOWER_BAND.get()))
                    .title(Component.translatable("creativetab.jerrys_flower_bands_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        for (RegistryObject<Item> itemRegistryObject : ModItems.ITEMS.getEntries()) {
                            pOutput.accept(itemRegistryObject.get());
                        }
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
