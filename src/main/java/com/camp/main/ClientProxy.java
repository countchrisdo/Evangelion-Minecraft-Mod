package com.camp.main;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelCow;
import net.minecraft.client.model.ModelIronGolem;

import com.camp.entity.AdamMob;
import com.camp.entity.LilithMob;
import com.camp.entity.MPEMob;
import com.camp.render.RenderAdamMob;
import com.camp.render.RenderLilithMob;
import com.camp.render.RenderMPEMob;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy {

	public void registerRenderThings() {
		RenderingRegistry.registerEntityRenderingHandler(LilithMob.class, new RenderLilithMob(new ModelBiped(), 0));
		RenderingRegistry.registerEntityRenderingHandler(MPEMob.class, new RenderMPEMob(new ModelBiped(), 0));
		RenderingRegistry.registerEntityRenderingHandler(AdamMob.class, new RenderAdamMob(new ModelBiped(), 0, 0));
	}
	
	public int addArmor(String armor) {
        return RenderingRegistry.addNewArmourRendererPrefix(armor);
}
}
