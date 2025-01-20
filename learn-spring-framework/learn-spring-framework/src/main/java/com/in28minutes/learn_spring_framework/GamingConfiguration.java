package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.GamingConsole;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.PacmanGame;

@Configuration
public class GamingConfiguration {

@Bean
	public GamingConsole game() {
	return new PacmanGame();
}
	
	@Bean
	@Primary
	public GameRunner gameRunner(GamingConsole game)
	{
	return new GameRunner(game);
	
}
	
}
