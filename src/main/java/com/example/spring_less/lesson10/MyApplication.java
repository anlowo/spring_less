package com.example.spring_less.lesson10;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MyApplication {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().
                configure().
                addAnnotatedClass(Employee.class).
                buildSessionFactory();

        Session session = factory.getCurrentSession();
        Employee employee = new Employee("Alex", 500);
        session.beginTransaction();
        session.save(employee);

        session.getTransaction().commit();

        System.out.println("Данные сохраненны");

        factory.close();

        //////////

        session = factory.getCurrentSession();
        session.beginTransaction();
        Employee employee1 = session.get(Employee.class, 2L);
        session.getTransaction().commit();
        System.out.println(employee1);

    }
}
