package com.camp.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.camp.lib.StringLibrary;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlockManager {
	
	public static void mainRegistry() {
        initializeBlock();
        registerBlock();
        
	}
	
    public static Block EmptyBlock;
    public static Block multiBlock;
    public static Block FruitBlock;
    public static Block LifeBlockCrops;
    public static Block KnowBlockCrops;
 
    public static void initializeBlock() {
 
    	EmptyBlock = new EmptyBlock(Material.packedIce);
    	multiBlock = new MultiBlock(Material.rock);
    	FruitBlock = new FruitBlock(Material.gourd);
    	LifeBlockCrops = new LifeBlockCrops().setCreativeTab(CreativeTabs.tabBlock).setBlockName("LifeBlockCrops").setBlockTextureName(StringLibrary.MODID + ":life_block_crops");
    	KnowBlockCrops = new KnowBlockCrops().setCreativeTab(CreativeTabs.tabBlock).setBlockName("KnowBlockCrops").setBlockTextureName(StringLibrary.MODID + ":know_block_crops");
    }
 
    public static void registerBlock() {
 
    	GameRegistry.registerBlock(EmptyBlock, EmptyBlock.getUnlocalizedName());
    	GameRegistry.registerBlock(multiBlock, multiBlock.getUnlocalizedName());
    	GameRegistry.registerBlock(FruitBlock, FruitBlock.getUnlocalizedName());
    	GameRegistry.registerBlock(LifeBlockCrops, LifeBlockCrops.getUnlocalizedName());
    	GameRegistry.registerBlock(KnowBlockCrops, KnowBlockCrops.getUnlocalizedName());
    }

}
