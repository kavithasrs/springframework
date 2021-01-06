package com.kav.springframework;

import com.kav.springframework.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.sql.DataSource;

@Configuration
@ComponentScan (basePackages = "com.kav.springframework")
public class AppConfig {

    @Autowired
    private DataSource dataSource;


    @Autowired @Qualifier("cubs")
    private Team home;

    @Autowired @Qualifier("redSox")
    private Team away;

    @Bean
    public Game game(DataSource dataSource) {
        BaseballGame baseballGame = new BaseballGame(home, away);
        baseballGame.setDataSource(dataSource);
        return baseballGame;
    }

}
