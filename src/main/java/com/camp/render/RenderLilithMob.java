 package com.camp.render;
 
import com.camp.lib.StringLibrary;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
 
public class RenderLilithMob extends RenderBiped {
 
	 public RenderLilithMob(ModelBiped par1ModelBiped, float par2) {
	        super(par1ModelBiped, par2);
	        // TODO Auto-generated constructor stub
	    }
	 
	    @Override
	    protected ResourceLocation getEntityTexture(Entity var1) {
	        // TODO Auto-generated method stub
	        return new ResourceLocation(StringLibrary.MODID + ":textures/entity/LilithMob.png");    
	 
	    }
}
	 