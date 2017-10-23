package fr.tommarx.gol.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import fr.tommarx.gol.Game;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 1664;
		config.height = 936;
		config.title = "Game of life";
		new LwjglApplication(new Game(), config);
	}
}
