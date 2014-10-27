package com.pixnbgames.gdx_freetype_example;

import java.util.Locale;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.pixnbgames.gdx_freetype_example.util.FontFactory;

public class GdxGameFreetypeExampleGame extends ApplicationAdapter {
	
	// Messages
	public static final String SPANISH_MESSAGE = "¡Hola Mundo!";
	public static final String RUSSIAN_MESSAGE = "Привет мир!";
	
	// Batch
	private SpriteBatch batch;
	
	// Locales for languages
	private Locale esLocale;
	private Locale ruLocale;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		
		// Initialize FontFactory
		FontFactory.getInstance().initialize();
		
		// Initialize locales
		esLocale = new Locale("es", "ES");
		ruLocale = new Locale("ru", "RU");
	}

	@Override
	public void render () {
		// Clear screen
		Gdx.gl.glClearColor(0, 0, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		// Draw with fonts
		batch.begin();
		FontFactory.getInstance().getFont(esLocale).draw(batch, SPANISH_MESSAGE, 110.f, 150.f);
		FontFactory.getInstance().getFont(ruLocale).draw(batch, RUSSIAN_MESSAGE,  70.f, 100.f);
		batch.end();
		
	}

	@Override
	public void dispose() {
		super.dispose();
		FontFactory.getInstance().dispose();
	}
	
}
