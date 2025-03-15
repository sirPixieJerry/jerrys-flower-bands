package net.jerrys.jerrys_flower_bands.item.custom;

import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class FlowerBandItem extends ArmorItem {

  public FlowerBandItem(ArmorMaterial material, Type type, Properties properties) {
    super(material, type, properties);
  }

  @Override
  public void appendHoverText(
      ItemStack stack, @Nullable Level world, List<Component> tooltip, TooltipFlag flag) {
    stack.getOrCreateTag().putInt("HideFlags", 2);
    super.appendHoverText(stack, world, tooltip, flag);
  }

  @Override
  public void onCraftedBy(ItemStack stack, Level world, Player player) {
    stack.getOrCreateTag().putInt("HideFlags", 2);
    super.onCraftedBy(stack, world, player);
  }
}
