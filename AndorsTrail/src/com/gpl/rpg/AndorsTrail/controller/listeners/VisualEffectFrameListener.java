package com.gpl.rpg.AndorsTrail.controller.listeners;

import com.gpl.rpg.AndorsTrail.controller.VisualEffectController.SpriteMoveAnimation;
import com.gpl.rpg.AndorsTrail.controller.VisualEffectController.VisualEffectAnimation;

public interface VisualEffectFrameListener {
	void onNewAnimationFrame(VisualEffectAnimation animation, int tileID, int textYOffset);
	void onAnimationCompleted(VisualEffectAnimation animation);
	void onSpriteMoveStarted(SpriteMoveAnimation animation);
	void onNewSpriteMoveFrame(SpriteMoveAnimation animation);
	void onSpriteMoveCompleted(SpriteMoveAnimation animation);
}
