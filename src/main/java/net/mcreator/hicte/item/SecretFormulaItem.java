
package net.mcreator.hicte.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SecretFormulaItem extends Item {
	public SecretFormulaItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}
}
