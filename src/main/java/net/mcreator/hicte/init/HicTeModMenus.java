
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hicte.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.hicte.world.inventory.FuctionalBlockUIMenu;
import net.mcreator.hicte.HicTeMod;

public class HicTeModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, HicTeMod.MODID);
	public static final RegistryObject<MenuType<FuctionalBlockUIMenu>> FUCTIONAL_BLOCK_UI = REGISTRY.register("fuctional_block_ui", () -> IForgeMenuType.create(FuctionalBlockUIMenu::new));
}
