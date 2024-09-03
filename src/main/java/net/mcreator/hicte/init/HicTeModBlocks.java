
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hicte.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.hicte.block.PlasticBlockBlock;
import net.mcreator.hicte.block.FuctionalBlockBlock;
import net.mcreator.hicte.HicTeMod;

public class HicTeModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, HicTeMod.MODID);
	public static final RegistryObject<Block> FUCTIONAL_BLOCK = REGISTRY.register("fuctional_block", () -> new FuctionalBlockBlock());
	public static final RegistryObject<Block> PLASTIC_BLOCK = REGISTRY.register("plastic_block", () -> new PlasticBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
