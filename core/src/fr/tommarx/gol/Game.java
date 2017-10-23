package fr.tommarx.gol;

public class Game extends fr.tommarx.gameengine.Game.Game {

	public void init() {
		setScreen(new GameScreen(this));
	}

}
