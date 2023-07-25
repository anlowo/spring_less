package com.example.spring_less.component;

import com.example.spring_less.lesson1.Cat;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("application_context4.xml");
        Cat cat = context.getBean("cat", Cat.class);
        cat.say();

        context.close();
    }
}
