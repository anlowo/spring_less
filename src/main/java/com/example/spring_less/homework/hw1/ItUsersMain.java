package com.example.spring_less.homework.hw1;

import com.example.spring_less.homework.hw1.service.ItUserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;

@SpringBootApplication
public class ItUsersMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ItUsersMain.class, args);

        SwingUtilities.invokeLater(() -> {
            ItUserService itUserService = context.getBean(ItUserService.class);
//            StudentForm studentForm = new StudentForm(studentService);
//            studentForm.setVisible(true);
        });
    }
}
