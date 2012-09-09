
package com.jesse.TweenExample;

import aurelienribon.tweenengine.BaseTween;
import aurelienribon.tweenengine.Timeline;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.TweenCallback;
import aurelienribon.tweenengine.demo.App;
import aurelienribon.tweenengine.primitives.MutableFloat;
import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import java.util.Locale;


//
//
//  @Override
//  
//      
//      
//      
//  }
//}
public class MainActivity extends AndroidApplication {
	public void onCreate(Bundle savedInstanceState) {
		// Demo
		
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration cfg = new AndroidApplicationConfiguration();
		cfg.useGL20 = false;
      
		initialize(new App(), cfg);
		
		
		
//		cfg.resizable = false;
//		cfg.vSyncEnabled = true;
//		cfg.useGL20 = false;
//		cfg.width = 800;
//		cfg.height = 480;
//		cfg.title = "Tween-Engine tests";
//		new LwjglApplication(new App(), cfg);

		// Tests

		float step = 0.0001f;

		System.out.println("-----------------------------------------------");
		System.out.println("Tween (v:value, lt:localTime, gt:globalTime)");
		System.out.println("-----------------------------------------------");
		testTween(step);

		System.out.println("-----------------------------------------------");
		System.out.println("Timeline (v:value, lt:localTime, gt:globalTime)");
		System.out.println("-----------------------------------------------");
		testTimeline(step);
	}

	private static void testTween(float step) {
		MutableFloat target = new MutableFloat(0);
		Tween t = Tween.to(target, 0, 1.0f).target(1).repeat(2, 1).delay(1).start();

		t.setCallback(buildCallback("t", target, t)).setCallbackTriggers(TweenCallback.ANY);

		float acc = 0;
		while (acc < t.getFullDuration()+1) {
			t.update(step);
			acc += step;
		}
		System.out.println("-----------------------------------------------");
		while (acc > -1) {
			t.update(-step);
			acc -= step;
		}
		System.out.println("-----------------------------------------------");
		while (acc < t.getFullDuration()+1) {
			t.update(step);
			acc += step;
		}
	}

	private static void testTimeline(float step) {
		MutableFloat target1 = new MutableFloat(0);
		MutableFloat target2 = new MutableFloat(0);
		Tween t1 = Tween.to(target1, 0, 1.0f).targetRelative(1);
		Tween t2 = Tween.to(target2, 0, 1.0f).targetRelative(1);

		Timeline tl = Timeline.createSequence()
			.push(t1)
			.push(t2)
			.repeat(1, 10)
			.start();

		tl.setCallback(buildCallback("TL", null, tl)).setCallbackTriggers(TweenCallback.ANY);
		t1.setCallback(buildCallback("t1", target1, tl)).setCallbackTriggers(TweenCallback.ANY);
		t2.setCallback(buildCallback("t2", target2, tl)).setCallbackTriggers(TweenCallback.ANY);

		float acc = 0;
		while (acc < tl.getFullDuration()+1) {
			tl.update(step);
			acc += step;
		}
		System.out.println("-----------------------------------------------");
		while (acc > -1) {
			tl.update(-step);
			acc -= step;
		}
		System.out.println("-----------------------------------------------");
		while (acc < tl.getFullDuration()+1) {
			tl.update(step);
			acc += step;
		}
	}

	
	private static TweenCallback buildCallback(final String name, final MutableFloat target, final BaseTween<?> timeSource) {
		return new TweenCallback() {
			 public void onEvent(int type, BaseTween<?> source) {
				String t = type == TweenCallback.BEGIN ? "BEGIN        "
					: type == TweenCallback.START ? "START        "
					: type == TweenCallback.END ? "END          "
					: type == TweenCallback.COMPLETE ? "COMPLETE     "
					: type == TweenCallback.BACK_BEGIN ? "BACK_BEGIN   "
					: type == TweenCallback.BACK_START ? "BACK_START   "
					: type == TweenCallback.BACK_END ? "BACK_END     "
					: type == TweenCallback.BACK_COMPLETE ? "BACK_COMPLETE"
					: "???";

				String str = String.format(Locale.US, "%s %s v %.2f   lt %.2f   gt %.2f", name, t, target != null ? target.floatValue() : 0, source.getCurrentTime(), timeSource.getCurrentTime());
				System.out.println(str);
			}
		};
	}
}


