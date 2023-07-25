package com.example.spring_less.lesson5;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class UserManager {
    private final Map<String, User> users;
    User user;

    public UserManager() {
        users = new HashMap<>();
        user = null;
    }

    public void addUser(String name, String email, String password) {
        User user = new User(name, password, email);
        users.put(email, user);
        System.out.println("\n" + "Пользователь был создан");
        TaskConnection.addUser(user);
    }

    public void logIn(String name, String password) {
        User user1 = users.get(name);
        if (user1 != null && user1.checkPassword(password)) {
            user = user1;
            System.out.println("\n" + "Пользователь верен");
        } else {
            System.out.println("Пользователь не верен");
        }
    }

    public void logOut() {
        user = null;
        System.out.println("\n" + "Пользователь вышел");
    }

    public void printInfo() {
        if (user != null) {
            System.out.println(user.getInfo() + "\n");
        } else {
            System.out.println("Пользователь не найден");
        }
    }
    public void changePassword(String password) {
        user.changePassword(password);
    }
}