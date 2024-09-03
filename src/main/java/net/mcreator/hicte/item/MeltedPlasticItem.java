
package net.mcreator.hicte.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MeltedPlasticItem extends Item {
	public MeltedPlasticItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
