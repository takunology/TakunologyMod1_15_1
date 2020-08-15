package jp.takunology.takunologymod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Ores
{
    public static final Block takunolo_ore = new Block(Block.Properties
        .create(Material.ROCK)
        .hardnessAndResistance(0.5f, 15.0f)
        .sound(SoundType.STONE))
        .setRegistryName("takunolo_ore");
}