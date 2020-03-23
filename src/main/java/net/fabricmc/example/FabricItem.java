package net.fabricmc.example;

import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.sound.*;
import net.minecraft.util.*;
import net.minecraft.world.*;

public class FabricItem extends Item {
  public FabricItem(Settings settings) {
    super(settings);
  }

  @Override
  public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand)
  {
    playerEntity.playSound(SoundEvents.BLOCK_WOOL_BREAK, 1.0F, 1.0F);
    return new TypedActionResult<>(ActionResult.SUCCESS, playerEntity.getStackInHand(hand));
  }
}