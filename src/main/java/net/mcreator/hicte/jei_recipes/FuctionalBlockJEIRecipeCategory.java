
package net.mcreator.hicte.jei_recipes;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.mcreator.hicte.init.HicTeModJeiPlugin;
import net.mcreator.hicte.init.HicTeModBlocks;

import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.constants.VanillaTypes;

public class FuctionalBlockJEIRecipeCategory implements IRecipeCategory<FuctionalBlockJEIRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("hic_te", "fuctional_block_jei");
	public final static ResourceLocation TEXTURE = new ResourceLocation("hic_te", "textures/screens/fuctional_block_ui_jei.png");
	private final IDrawable background;
	private final IDrawable icon;

	public FuctionalBlockJEIRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 175, 84);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(HicTeModBlocks.FUCTIONAL_BLOCK.get().asItem()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<FuctionalBlockJEIRecipe> getRecipeType() {
		return HicTeModJeiPlugin.FuctionalBlockJEI_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Fuctional Block");
	}

	@Override
	public IDrawable getBackground() {
		return this.background;
	}

	@Override
	public IDrawable getIcon() {
		return this.icon;
	}

	@Override
	public void setRecipe(IRecipeLayoutBuilder builder, FuctionalBlockJEIRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 80, 22).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.INPUT, 80, 41).addIngredients(recipe.getIngredients().get(1));
		builder.addSlot(RecipeIngredientRole.INPUT, 80, 60).addIngredients(recipe.getIngredients().get(2));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 151, 41).addItemStack(recipe.getResultItem(null));
	}
}
