package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.GamingConsole;
import com.in28minutes.learn_spring_framework.game.PacmanGame;

public class AppGaming02Spring {

			public static void main(String[] args) {
				
				try(	var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
						){
					context.getBean(GameRunner.class).run();
					//context.getBean("mariogame");
				}
		
			

		}

	}
