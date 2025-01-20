package com.in28minutes.learn_spring_framework.game;

public class GameRunner {

	GamingConsole game;
	public GameRunner(GamingConsole game) {
		// TODO Auto-generated constructor stub
		this.game = game;
	}
	public void run() {
	System.out.println("Running game" + game);
	game.up();
	game.down();
	game.left();
	game.right();
		
	}

}
