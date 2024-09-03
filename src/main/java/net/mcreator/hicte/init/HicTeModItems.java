
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hicte.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.hicte.item.SecretFormulaItem;
import net.mcreator.hicte.item.RawPlasticItem;
import net.mcreator.hicte.item.PlasticItem;
import net.mcreator.hicte.item.MeltedPlasticItem;
import net.mcreator.hicte.item.HiCTex3Item;
import net.mcreator.hicte.item.HiCTeinBoxItem;
import net.mcreator.hicte.item.HiCTeSwordItem;
import net.mcreator.hicte.item.HiCTePackItem;
import net.mcreator.hicte.item.HiCTePackBoxItem;
import net.mcreator.hicte.item.HiCTe2LtItem;
import net.mcreator.hicte.item.HiCTe2LtEmptyItem;
import net.mcreator.hicte.item.DyebottleItem;
import net.mcreator.hicte.item.CardboardItem;
import net.mcreator.hicte.item.CarboardBoxItem;
import net.mcreator.hicte.HicTeMod;

public class HicTeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HicTeMod.MODID);
	public static final RegistryObject<Item> FUCTIONAL_BLOCK = block(HicTeModBlocks.FUCTIONAL_BLOCK);
	public static final RegistryObject<Item> HI_C_TEIN_BOX = REGISTRY.register("hi_c_tein_box", () -> new HiCTeinBoxItem());
	public static final RegistryObject<Item> HI_C_TEX_3 = REGISTRY.register("hi_c_tex_3", () -> new HiCTex3Item());
	public static final RegistryObject<Item> HI_C_TE_PACK_BOX = REGISTRY.register("hi_c_te_pack_box", () -> new HiCTePackBoxItem());
	public static final RegistryObject<Item> HI_C_TE_PACK = REGISTRY.register("hi_c_te_pack", () -> new HiCTePackItem());
	public static final RegistryObject<Item> HI_C_TE_2_LT_EMPTY = REGISTRY.register("hi_c_te_2_lt_empty", () -> new HiCTe2LtEmptyItem());
	public static final RegistryObject<Item> HI_C_TE_2_LT = REGISTRY.register("hi_c_te_2_lt", () -> new HiCTe2LtItem());
	public static final RegistryObject<Item> CARBOARD_BOX = REGISTRY.register("carboard_box", () -> new CarboardBoxItem());
	public static final RegistryObject<Item> CARDBOARD = REGISTRY.register("cardboard", () -> new CardboardItem());
	public static final RegistryObject<Item> SECRET_FORMULA = REGISTRY.register("secret_formula", () -> new SecretFormulaItem());
	public static final RegistryObject<Item> RAW_PLASTIC = REGISTRY.register("raw_plastic", () -> new RawPlasticItem());
	public static final RegistryObject<Item> PLASTIC_BLOCK = block(HicTeModBlocks.PLASTIC_BLOCK);
	public static final RegistryObject<Item> PLASTIC = REGISTRY.register("plastic", () -> new PlasticItem());
	public static final RegistryObject<Item> DYEBOTTLE = REGISTRY.register("dyebottle", () -> new DyebottleItem());
	public static final RegistryObject<Item> MELTED_PLASTIC = REGISTRY.register("melted_plastic", () -> new MeltedPlasticItem());
	public static final RegistryObject<Item> HI_C_TE_SWORD = REGISTRY.register("hi_c_te_sword", () -> new HiCTeSwordItem());
	public static final RegistryObject<Item> BOSS_SPAWN_EGG = REGISTRY.register("boss_spawn_egg", () -> new ForgeSpawnEggItem(HicTeModEntities.BOSS, -10027162, -26368, new Item.Properties()));

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
