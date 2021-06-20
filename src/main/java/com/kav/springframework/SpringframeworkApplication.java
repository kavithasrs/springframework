package com.kav.springframework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringframeworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringframeworkApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ApplicationContext ctx){
        return args -> {
            int beanCount = ctx.getBeanDefinitionCount();
            System.out.println("There are " + beanCount + " beans in this application");
            System.out.println("The bean names are: ");

            for(String beanName : ctx.getBeanDefinitionNames()){
                if(beanName.contains("AutoConfig")){
                    System.out.println(beanName);
                }
            }
        };
    }
}
