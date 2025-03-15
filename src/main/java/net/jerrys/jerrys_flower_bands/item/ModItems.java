package net.jerrys.jerrys_flower_bands.item;

import net.jerrys.jerrys_flower_bands.JerrysFlowerBands;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            JerrysFlowerBands.MOD_ID);

    public static final RegistryObject<Item> DAISY_FLOWER_BAND = ITEMS.register("daisy_flower_band",
            () -> new Item(new Properties()));
    public static final RegistryObject<Item> DANDELION_FLOWER_BAND = ITEMS.register("dandelion_flower_band",
            () -> new Item(new Properties()));
    public static final RegistryObject<Item> POPPY_BAND = ITEMS.register("poppy_flower_band",
            () -> new Item(new Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
