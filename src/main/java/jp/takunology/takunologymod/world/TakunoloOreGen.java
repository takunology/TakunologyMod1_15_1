package jp.takunology.takunologymod.world;

import jp.takunology.takunologymod.blocks.Ores;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class TakunoloOreGen 
{
    public static void generateOre()
    {
        for(Biome biome : ForgeRegistries.BIOMES)
        {
            if(biome == Biomes.PLAINS)
            {
                ConfiguredPlacement customConfig = Placement.COUNT_RANGE
                .func_227446_a_(new CountRangeConfig(20, 5, 5, 25));
            
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, 
                Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, 
                Ores.takunolo_ore.getDefaultState(), 10))
                .func_227228_a_(customConfig));
            }
        }
    }
}