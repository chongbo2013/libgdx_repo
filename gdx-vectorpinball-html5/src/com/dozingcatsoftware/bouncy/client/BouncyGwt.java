
package com.dozingcatsoftware.bouncy.client;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import com.dozingcatsoftware.bouncy.Bouncy;

public class BouncyGwt extends GwtApplication {
	@Override
	public GwtApplicationConfiguration getConfig () {
		GwtApplicationConfiguration config = new GwtApplicationConfiguration(320, 480);
		return config;
	}

	@Override
	public ApplicationListener getApplicationListener () {
		return new Bouncy();
	}
}
