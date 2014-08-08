package com.camp.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

public class MultiBlock extends Block {

	public IIcon[] iconArray = new IIcon[6];
	protected MultiBlock(Material p_i45394_1_) {
		super(p_i45394_1_);
		// TODO Auto-generated constructor stub
		this.setBlockName("MultiBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
	    this.setHardness((float) 1.0);
	    this.setResistance((float) 1);
	}
	    @Override
	    public void registerBlockIcons(IIconRegister iconReg) {
	        for(int i = 0; i < iconArray.length; i++) {
	            iconArray[i] = iconReg.registerIcon(StringLibrary.MODID + ":multiblock_side_" + i);
	        }
	    }
	    @Override
	    public IIcon getIcon(int side, int meta) {
	        return iconArray[side];
	    }

}
