package com.example.spring_less.lesson6.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.example.spring_less.lesson6.configuration")  // Указываем буть к нашему конфигу
@PropertySource("application.properties")
public class MyConfiguration {
    @Bean
    public Pet catsBean() {
        return new Cat();
    }
    @Bean
    public Person personBean() {
        return new Person(catsBean());
    }
}
