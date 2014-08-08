package com.camp.item;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.camp.lib.StringLibrary;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CustomArmor extends ItemArmor {

	 @SideOnly(Side.CLIENT)
	    public boolean hasEffect(ItemStack par1ItemStack)
	    {
	        return true;
	    }
	
	public CustomArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		// TODO Auto-generated constructor stub
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if(slot == 0 || slot == 1 || slot == 3) {
            return StringLibrary.MODID + ":textures/models/armor/custom_armor_layer_1.png";
 
        }
        else if(slot == 2) {
            return StringLibrary.MODID + ":textures/models/armor/custom_armor_layer_2.png";
        }
        else {
            return null;
        }

}
}
