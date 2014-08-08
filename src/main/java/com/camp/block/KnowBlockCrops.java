package com.camp.block;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

import com.camp.item.ItemManager;

public class KnowBlockCrops extends BlockCrops{

	protected Item func_149866_i() {
        return ItemManager.KnowSeeds;
	} 
	protected Item func_149865_P() {
        return ItemManager.KnowFruit;
    }
}