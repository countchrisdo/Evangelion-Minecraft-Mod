package com.camp.entity; 

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.init.Items;
import net.minecraft.world.World;

public class CustomEntityPassive extends EntityAnimal{

	public CustomEntityPassive(World par1World) {
		super(par1World);
		this.setSize(1.0f, 1.0f);
		
		this.tasks.addTask(1, new EntityAITempt(this, 1.0d, Items.apple, false));
	    this.tasks.addTask(2, new EntityAIPanic(this, 0.7d));
	    this.tasks.addTask(3, new EntityAIWander(this, 0.3d));
		this.tasks.addTask(0, new EntityAISwimming(this));
	}
		// TODO Auto-generated constructor stub
	

	@Override
	public EntityAgeable createChild(EntityAgeable var1) {
		// TODO Auto-generated method stub
		return new CustomEntityPassive(worldObj);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(1.0d);
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(200.0D);
	}

	  public boolean isAIEnabled() {
	        return true;
	  }
}