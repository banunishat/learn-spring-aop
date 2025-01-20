package com.in28minutes.learn_spring_framework.game;

public class PacmanGame implements GamingConsole {

	public void up()
	{
		System.out.println("Jump from Pacman");
	}
	public void down()
	{
		System.out.println("go into a holes  from Pacman");
	}
	public void left()
	{
		System.out.println("go back  from Pacman");
	}
	public void right()
	{
		System.out.println("Accelerate  from Pacman");
	}
}

