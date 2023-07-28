package com.example.spring_less.lesson10.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MyApplication2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        session.beginTransaction();

//        Employee employee = session.get(Employee.class,2L);
//        employee.setSalary(1200);

//        session.createQuery("update Employee set salary = 1000 where fullName = 'Alex'")
//                        .executeUpdate();


        session.getTransaction().commit();

        factory.close();
    }
}
