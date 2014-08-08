package com.camp.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.camp.item.ItemManager;

public class ItemTab extends CreativeTabs {

	public ItemTab(String lable) {
        super(lable);
        // TODO Auto-generated constructor stub
    }

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return ItemManager.RedIngot;
	}

}
