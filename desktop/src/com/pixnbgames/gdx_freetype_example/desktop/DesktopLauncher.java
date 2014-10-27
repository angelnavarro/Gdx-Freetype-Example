package com.pixnbgames.gdx_freetype_example.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.pixnbgames.gdx_freetype_example.GdxGameFreetypeExampleGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width  = 320;
		config.height = 240;
		
		new LwjglApplication(new GdxGameFreetypeExampleGame(), config);
	}
}
