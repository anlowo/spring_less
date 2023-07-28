package com.example.spring_less.lesson2.application_context2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("application_context.xml");
        Person person = context.getBean("myPerson", Person.class);
        person.callPet();

        System.out.println(person.getName());
        System.out.println(person.getAge());

        context.close();
    }
}
