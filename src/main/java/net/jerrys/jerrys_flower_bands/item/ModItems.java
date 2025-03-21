package net.jerrys.jerrys_flower_bands.item;

import net.jerrys.jerrys_flower_bands.JerrysFlowerBands;
import net.jerrys.jerrys_flower_bands.item.custom.FlowerBandItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
  // Private constructor to prevent instantiation
  private ModItems() {
    throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
  }

  public static final DeferredRegister<Item> ITEMS =
      DeferredRegister.create(ForgeRegistries.ITEMS, JerrysFlowerBands.MOD_ID);

  public static final RegistryObject<Item> BLOOM_FLOWER_BAND =
      ITEMS.register(
          "bloom_flower_band",
          () ->
              new FlowerBandItem(
                  FlowerBandMaterials.BLOOM, ArmorItem.Type.HELMET, new Properties()));
  public static final RegistryObject<Item> BLUSH_FLOWER_BAND =
      ITEMS.register(
          "blush_flower_band",
          () ->
              new FlowerBandItem(
                  FlowerBandMaterials.BLUSH, ArmorItem.Type.HELMET, new Properties()));
  public static final RegistryObject<Item> DAISY_FLOWER_BAND =
      ITEMS.register(
          "daisy_flower_band",
          () ->
              new FlowerBandItem(
                  FlowerBandMaterials.DAISY, ArmorItem.Type.HELMET, new Properties()));
  public static final RegistryObject<Item> DANDELION_FLOWER_BAND =
      ITEMS.register(
          "dandelion_flower_band",
          () ->
              new FlowerBandItem(
                  FlowerBandMaterials.DANDELION, ArmorItem.Type.HELMET, new Properties()));
  public static final RegistryObject<Item> PINK_PETALS_FLOWER_BAND =
      ITEMS.register(
          "pink_petals_flower_band",
          () ->
              new FlowerBandItem(
                  FlowerBandMaterials.PINK_PETALS, ArmorItem.Type.HELMET, new Properties()));
  public static final RegistryObject<Item> SUNFIRE_FLOWER_BAND =
      ITEMS.register(
          "sunfire_flower_band",
          () ->
              new FlowerBandItem(
                  FlowerBandMaterials.SUNFIRE, ArmorItem.Type.HELMET, new Properties()));

  public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);
  }
}
