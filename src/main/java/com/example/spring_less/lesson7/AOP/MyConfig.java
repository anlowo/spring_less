package com.example.spring_less.lesson7.AOP;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.example.spring_less.lesson7.AOP")
@EnableAspectJAutoProxy
public class MyConfig {
}
