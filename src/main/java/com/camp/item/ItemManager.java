package com.camp.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemSeeds;
import net.minecraftforge.common.util.EnumHelper;

import com.camp.block.BlockManager;
import com.camp.lib.StringLibrary;
import com.camp.main.MainRegistry;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemManager {

	public static void mainRegistry() {
		initalizeItem();
		registerItem();
	}
	
	public static Item RedIngot;
	public static Item EvaIngot;
	
	public static Item KnowFruit;
	public static Item KnowSeeds;
	
	public static Item LanceSword;
	
	public static Item LifeFruit;
	public static Item LifeSeeds;
	
	public static ToolMaterial EvangelionT = EnumHelper.addToolMaterial("EvangelionT", 3, 1999999999, 12, 12, 30);
	public static ArmorMaterial Evangelion = EnumHelper.addArmorMaterial("Evangelion", 66, new int[]{6, 16, 12, 6}, 20);
	
	public static Item customHelmet;
	public static Item EvaChest;
	public static Item EvaPant;
	public static Item EvaBoot;
	
	
	
	
	
    public static void initalizeItem() {
		RedIngot = new RedIngot();
		LanceSword = new LanceSword(EvangelionT).setUnlocalizedName("LanceOfLongenuis").setCreativeTab(CreativeTabs.tabCombat).setTextureName(StringLibrary.MODID + ":LanceSword");
		LifeFruit = new LifeFruit(20, 0.6F, true).setCreativeTab(CreativeTabs.tabFood).setUnlocalizedName("LifeFruit").setTextureName(StringLibrary.MODID + ":LifeFruit");
		KnowFruit = new KnowFruit(20, 0.6F, true).setCreativeTab(CreativeTabs.tabFood).setUnlocalizedName("KnowFruit").setTextureName(StringLibrary.MODID + ":KnowFruit");
		KnowSeeds = new ItemSeeds(BlockManager.KnowBlockCrops, Blocks.farmland).setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("KnowSeeds").setTextureName(StringLibrary.MODID + ":KnowSeeds"); 
		EvaIngot = new EvaIngot();
		LifeSeeds = new ItemSeeds(BlockManager.LifeBlockCrops, Blocks.farmland).setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("LifeSeeds").setTextureName(StringLibrary.MODID + ":LifeSeeds");
		customHelmet = new CustomArmor(Evangelion, MainRegistry.proxy.addArmor("CustomHelmet"), 0).setUnlocalizedName("CustomHelmet").setCreativeTab(CreativeTabs.tabCombat).setTextureName(StringLibrary.MODID + ":custom_helmet");
		EvaChest = new CustomArmor(Evangelion, MainRegistry.proxy.addArmor("EvaChest"), 1).setUnlocalizedName("EvaChest").setCreativeTab(CreativeTabs.tabCombat).setTextureName(StringLibrary.MODID + ":EvaChest");
		EvaPant = new CustomArmor(Evangelion, MainRegistry.proxy.addArmor("EvaPant"), 2).setUnlocalizedName("EvaPant").setCreativeTab(CreativeTabs.tabCombat).setTextureName(StringLibrary.MODID + ":EvaPant");
    	EvaBoot = new CustomArmor(Evangelion, MainRegistry.proxy.addArmor("EvaBoot"), 3).setUnlocalizedName("EvaBoot").setCreativeTab(CreativeTabs.tabCombat).setTextureName(StringLibrary.MODID + ":EvaBoot");
    }
	
	public static void registerItem() {
		GameRegistry.registerItem(LanceSword, LanceSword.getUnlocalizedName ());
		GameRegistry.registerItem(RedIngot, RedIngot.getUnlocalizedName ());
		GameRegistry.registerItem(EvaIngot, EvaIngot.getUnlocalizedName ());
		GameRegistry.registerItem(LifeFruit, LifeFruit.getUnlocalizedName());
		GameRegistry.registerItem(KnowFruit, KnowFruit.getUnlocalizedName());
		GameRegistry.registerItem(LifeSeeds, LifeSeeds.getUnlocalizedName());
		GameRegistry.registerItem(KnowSeeds, KnowSeeds.getUnlocalizedName());
		GameRegistry.registerItem(customHelmet, customHelmet.getUnlocalizedName());
		GameRegistry.registerItem(EvaChest, EvaChest.getUnlocalizedName());
		GameRegistry.registerItem(EvaPant, EvaPant.getUnlocalizedName());
		GameRegistry.registerItem(EvaBoot, EvaBoot.getUnlocalizedName());
	}
		

}
