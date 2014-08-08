package com.camp.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

import com.camp.lib.StringLibrary;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class LanceSword extends ItemSword {

	 @SideOnly(Side.CLIENT)
	    public boolean hasEffect(ItemStack par1ItemStack)
	    {
	        return true;
	    }
	
	public LanceSword(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		// TODO Auto-generated constructor stub
	}

	
		
	
		
		
	}
