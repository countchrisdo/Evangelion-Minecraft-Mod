package com.camp.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class RedIngot extends Item {
	
	 @SideOnly(Side.CLIENT)
	    public boolean hasEffect(ItemStack par1ItemStack)
	    {
	        return true;
	    }
	
	public RedIngot() {
		this.setUnlocalizedName("RedIngot");
	    this.setMaxStackSize(27);
		this.setCreativeTab(CreativeTabsManager.tabItem);
		this.setTextureName(StringLibrary.MODID + ":Redingot");
	}

}