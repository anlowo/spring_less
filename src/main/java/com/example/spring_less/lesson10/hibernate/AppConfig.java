package com.example.spring_less.lesson10.hibernate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

@Configuration
@EnableTransactionManagement
@PropertySource("classpath:application.properties")
public class AppConfig {

    // DataSource для встроенной базы данных (HSQLDB)
    @PersistenceUnit
    private EntityManagerFactory entityManagerFactory;

    @Bean
    public PlatformTransactionManager transactionManager() {
        return new JpaTransactionManager(entityManagerFactory);
    }

//    @Bean
//    public EmployeeDAO employeeDAO() {
//        return new EmployeeDAOImpl(entityManagerFactory);
//    }
////     Bean для EmployeeService, который будет использовать EmployeeDAO для CRUD операций
//    @Bean
//    public EmployeeService employeeService() {
//        return new EmployeeServiceImpl(employeeDAO());
//    }
}
