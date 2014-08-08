package com.camp.entity;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityGiantZombie;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import com.camp.block.BlockManager;
import com.camp.item.ItemManager;


public class AdamMob extends EntityGiantZombie
{
    private static final String __OBFID = "CL_00001690";

    public AdamMob(World par1World)
    {
        super(par1World);
        this.yOffset *= 6.0F;
        this.setSize(this.width * 6.0F, this.height * 6.0F);
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(250.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(6.5D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(1000000000.0D);
        
    }
    @Override
    public void dropFewItems(boolean recentlyHit, int lootLevel) {
    	int quantity = this.rand.nextInt(4) + 1;
    	 
        for (int i = 0; i < quantity; i++) {
        	if (this.isBurning()) {
                this.dropItem(ItemManager.RedIngot, 1);
            }
            else {
                Item drop = Item.getItemFromBlock(BlockManager.EmptyBlock);
                this.dropItem(drop, 10);
            }
        }
     
    }

   
}