package net.jerrys.jerrys_flower_bands.item;

import java.util.function.Supplier;
import net.jerrys.jerrys_flower_bands.JerrysFlowerBands;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

@SuppressWarnings("java:S107")
public enum FlowerBandMaterials implements ArmorMaterial {
  BLOOM(
      "bloom",
      26,
      new int[] {0, 0, 0, 0},
      0,
      SoundEvents.ARMOR_EQUIP_GOLD,
      0f,
      0f,
      () -> Ingredient.EMPTY),
  BLUSH(
      "blush",
      26,
      new int[] {0, 0, 0, 0},
      0,
      SoundEvents.ARMOR_EQUIP_GOLD,
      0f,
      0f,
      () -> Ingredient.EMPTY),
  DAISY(
      "daisy",
      26,
      new int[] {0, 0, 0, 0},
      0,
      SoundEvents.ARMOR_EQUIP_GOLD,
      0f,
      0f,
      () -> Ingredient.EMPTY),
  DANDELION(
      "dandelion",
      26,
      new int[] {0, 0, 0, 0},
      0,
      SoundEvents.ARMOR_EQUIP_GOLD,
      0f,
      0f,
      () -> Ingredient.EMPTY),
  PINK_PETALS(
      "pink_petals",
      26,
      new int[] {0, 0, 0, 0},
      0,
      SoundEvents.ARMOR_EQUIP_GOLD,
      0f,
      0f,
      () -> Ingredient.EMPTY),
  SUNFIRE(
      "sunfire",
      26,
      new int[] {0, 0, 0, 0},
      0,
      SoundEvents.ARMOR_EQUIP_GOLD,
      0f,
      0f,
      () -> Ingredient.EMPTY);

  private final String name;
  private final int durabilityMultiplier;
  private final int[] protectionAmounts;
  private final int enchantmentValue;
  private final SoundEvent equipSound;
  private final float toughness;
  private final float knockbackResistance;
  private final Supplier<Ingredient> repairIngredient;

  private static final int[] BASE_DURABILITY = {100, 0, 0, 0};

  FlowerBandMaterials(
      String name,
      int durabilityMultiplier,
      int[] protectionAmounts,
      int enchantmentValue,
      SoundEvent equipSound,
      float toughness,
      float knockbackResistance,
      Supplier<Ingredient> repairIngredient) {
    this.name = name;
    this.durabilityMultiplier = durabilityMultiplier;
    this.protectionAmounts = protectionAmounts;
    this.enchantmentValue = enchantmentValue;
    this.equipSound = equipSound;
    this.toughness = toughness;
    this.knockbackResistance = knockbackResistance;
    this.repairIngredient = repairIngredient;
  }

  @Override
  public int getDurabilityForType(ArmorItem.Type pType) {
    return BASE_DURABILITY[pType.ordinal()] * this.durabilityMultiplier;
  }

  @Override
  public int getDefenseForType(ArmorItem.Type pType) {
    return this.protectionAmounts[pType.ordinal()];
  }

  @Override
  public int getEnchantmentValue() {
    return this.enchantmentValue;
  }

  @Override
  public SoundEvent getEquipSound() {
    return this.equipSound;
  }

  @Override
  public Ingredient getRepairIngredient() {
    return this.repairIngredient.get();
  }

  @Override
  public String getName() {
    return JerrysFlowerBands.MOD_ID + ":" + this.name;
  }

  @Override
  public float getToughness() {
    return this.toughness;
  }

  @Override
  public float getKnockbackResistance() {
    return this.knockbackResistance;
  }
}
