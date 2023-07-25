package com.example.spring_less.lesson3.scope;

import com.example.spring_less.lesson1.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("application_context2.xml");
        Dog dog = context.getBean("myPet", Dog.class);
        Dog myDog = context.getBean("myPet", Dog.class);

        System.out.println(dog == myDog);
        System.out.println(myDog);
        System.out.println(dog);
        context.close();
    }
}
