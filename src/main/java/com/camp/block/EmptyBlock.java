package com.camp.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.item.ItemManager;
import com.camp.lib.StringLibrary;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EmptyBlock extends Block {

	 @SideOnly(Side.CLIENT)
	    public boolean hasEffect(ItemStack par1ItemStack)
	    {
	        return true;
	    }
	
	protected EmptyBlock(Material p_i45394_1_) {
		super(p_i45394_1_);
		// TODO Auto-generated constructor stub
		
		this.setBlockName("EmptyBlock");
	    this.setCreativeTab(CreativeTabs.tabBlock);
	    this.setLightLevel((float) 15);
	    this.setHardness((float) 5.0);
	    this.setResistance((float) 1);
	    this.setBlockTextureName(StringLibrary.MODID + ":EmptyBlock");
	}

    @Override
    public int quantityDropped(Random rand)
    {
        return rand.nextInt(5) + 1;
    }
    
    @Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return ItemManager.RedIngot;
    }
}
