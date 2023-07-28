package com.example.spring_less.lesson3.init_destroy;

import com.example.spring_less.lesson1.application_context.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("application_context3.xml");
        Dog dog = context.getBean("myPet", Dog.class);
        dog.say();
        dog.init();

        context.close();
    }
}
