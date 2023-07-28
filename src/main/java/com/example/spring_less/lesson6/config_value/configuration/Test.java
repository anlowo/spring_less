package com.example.spring_less.lesson6.config_value.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfiguration.class);
        Person person = context.getBean("personBean", Person.class);

        person.callPet();

        System.out.println(person.getName());
        System.out.println(person.getAge());

        context.close();
    }
}
