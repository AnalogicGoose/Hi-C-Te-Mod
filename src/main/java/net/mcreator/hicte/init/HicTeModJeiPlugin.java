
package net.mcreator.hicte.init;

import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.hicte.jei_recipes.FuctionalBlockJEIRecipeCategory;
import net.mcreator.hicte.jei_recipes.FuctionalBlockJEIRecipe;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.Objects;
import java.util.List;

@JeiPlugin
public class HicTeModJeiPlugin implements IModPlugin {
	public static mezz.jei.api.recipe.RecipeType<FuctionalBlockJEIRecipe> FuctionalBlockJEI_Type = new mezz.jei.api.recipe.RecipeType<>(FuctionalBlockJEIRecipeCategory.UID, FuctionalBlockJEIRecipe.class);

	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("hic_te:jei_plugin");
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		registration.addRecipeCategories(new FuctionalBlockJEIRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		RecipeManager recipeManager = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
		List<FuctionalBlockJEIRecipe> FuctionalBlockJEIRecipes = recipeManager.getAllRecipesFor(FuctionalBlockJEIRecipe.Type.INSTANCE);
		registration.addRecipes(FuctionalBlockJEI_Type, FuctionalBlockJEIRecipes);
	}

	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
		registration.addRecipeCatalyst(new ItemStack(HicTeModBlocks.FUCTIONAL_BLOCK.get().asItem()), FuctionalBlockJEI_Type);
	}
}
