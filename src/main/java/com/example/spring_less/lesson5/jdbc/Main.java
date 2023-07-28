package com.example.spring_less.lesson5.jdbc;

import com.example.spring_less.lesson5.jdbc.UserManager;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        UserManager userManager = new UserManager();

        String userName;
        String password;
        String email;

        int choice;

        do {
            System.out.println("1. Создать пользователя ");
            System.out.println("2. Вход в систему ");
            System.out.println("3. Выход из системы ");
            System.out.println("4. Вывод информации ");
            System.out.println("5. Смена пароля ");
            System.out.println("6. Выход из меню");
            System.out.println("Выберите действие: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Введите имя: ");
                    userName = scanner.next();
                    System.out.print("Введите пароль: ");
                    password = scanner.next();
                    System.out.print("Введите почту: ");
                    email = scanner.next();
                    userManager.addUser(userName, password, email);
                    break;
                case 2:
                    System.out.print("Введите имя: ");
                    userName = scanner.next();
                    System.out.print("Введите пароль: ");
                    password = scanner.next();
                    userManager.logIn(userName, password);
                    break;
                case 3:
                    userManager.logOut();
                    break;
                case 4:
                    System.out.print("Информация о пользователе: ");
                    userManager.printInfo();
                    break;
                case 5:
                    System.out.print("Введите новый пароль");
                    password = scanner.next();
                    userManager.changePassword(password);
                    break;
                case 6:
                    System.out.println("Выход с программы");
                    break;
                default:
                    System.out.println("Ошибка");
            }
        } while (choice != 6);
    }
}
