package com.camp.recipe;

import com.camp.block.BlockManager;
import com.camp.item.ItemManager;

import net.minecraft.entity.EntityList;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeManager {
	 
	public static void mainRegistry(){
	        addCraftingRecipes();
	        addSmeltingRecipes();
}

	public static void addCraftingRecipes() {
	
		ItemStack redstoneStack = new ItemStack(Items.redstone);
		ItemStack dirtStack = new ItemStack(Blocks.dirt);
		ItemStack sandStack = new ItemStack(Blocks.sand);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.emerald, 64), dirtStack, dirtStack, dirtStack, dirtStack, sandStack, sandStack);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.RedIngot, 10), Items.diamond);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.KnowSeeds, 5), ItemManager.KnowFruit);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.LifeSeeds, 5), ItemManager.LifeFruit);
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.LanceSword, 1), ItemManager.RedIngot);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.RedIngot, 2), redstoneStack, redstoneStack, redstoneStack, redstoneStack, redstoneStack, redstoneStack, redstoneStack, redstoneStack);
		GameRegistry.addShapedRecipe(new ItemStack(BlockManager.EmptyBlock), "yx", "xy", 'x', Blocks.glass, 'y', ItemManager.RedIngot);
		GameRegistry.addShapedRecipe(new ItemStack(BlockManager.EmptyBlock), "xy", "yx", 'x', Blocks.glass, 'y', ItemManager.RedIngot);
		GameRegistry.addShapedRecipe(new ItemStack(Items.carrot), "xyx", "y y", "xyx", 'x', Blocks.stone, 'y', Blocks.gravel);
		GameRegistry.addShapedRecipe(new ItemStack(BlockManager.FruitBlock), "yxy", "xyx", "yxy", 'x', ItemManager.KnowFruit, 'y', ItemManager.LifeFruit);
		GameRegistry.addShapedRecipe(new ItemStack(BlockManager.FruitBlock), "xyx", "yxy", "xyx", 'x', ItemManager.KnowFruit, 'y', ItemManager.LifeFruit);
	}
	public static void addSmeltingRecipes() {   
	
		GameRegistry.addSmelting(new ItemStack(ItemManager.RedIngot), new ItemStack(Items.diamond), 0.1f);
	}
}