
package net.mcreator.hicte.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RawPlasticItem extends Item {
	public RawPlasticItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
