package jp.takunology.takunologymod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class DiceBlocks
{
    public static final Block dice_one = new Block(Block.Properties
    .create(Material.IRON)
    .hardnessAndResistance(0.5f, 15.0f)
    .sound(SoundType.SAND)).setRegistryName("dice_block");

}