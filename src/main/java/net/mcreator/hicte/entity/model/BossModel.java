package net.mcreator.hicte.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.hicte.entity.BossEntity;

public class BossModel extends GeoModel<BossEntity> {
	@Override
	public ResourceLocation getAnimationResource(BossEntity entity) {
		return new ResourceLocation("hic_te", "animations/hi-c_os_boss_-_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BossEntity entity) {
		return new ResourceLocation("hic_te", "geo/hi-c_os_boss_-_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BossEntity entity) {
		return new ResourceLocation("hic_te", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(BossEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
