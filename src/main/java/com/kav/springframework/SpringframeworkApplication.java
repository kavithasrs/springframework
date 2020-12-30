package com.kav.springframework;

import com.kav.springframework.entities.Game;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringframeworkApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringframeworkApplication.class, args);

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Game game = context.getBean("game", Game.class);
        System.out.println(game.playGame());
    }

}
