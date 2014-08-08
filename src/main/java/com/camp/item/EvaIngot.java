package com.camp.item;

import net.minecraft.item.Item;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;


public class EvaIngot extends Item {
	
	public EvaIngot() {
		this.setUnlocalizedName("EvaIngot");
	    this.setMaxStackSize(64);
		this.setCreativeTab(CreativeTabsManager.tabItem);
		this.setTextureName(StringLibrary.MODID + ":EvaIngot");
	}

}