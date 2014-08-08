package com.camp.entity;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import com.camp.block.BlockManager;
import com.camp.item.ItemManager;


public class MPEMob extends EntityMob
{
    private static final String __OBFID = "CL_00001690";

    public MPEMob(World par1World)
    {
        super(par1World);
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(250.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(6.5D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(10.5D);
        
    }
    @Override
    public void dropFewItems(boolean recentlyHit, int lootLevel) {
    	int quantity = this.rand.nextInt(4) + 1;
    	 
        for (int i = 0; i < quantity; i++) {
        	if (this.isBurning()) {
                this.dropItem(ItemManager.RedIngot, 1);
            }
            else {
                Item drop = Item.getItemFromBlock(BlockManager.FruitBlock);
                this.dropItem(drop, 2);
            }
        }
     
    }

   
}