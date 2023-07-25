package com.example.spring_less.lesson5;

public class User {
    private String userName;
    private String email;
    private String password;
    public User(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getInfo() {
        return "Name: " + userName + ", Password: " + password + ", Email: " + email;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    public boolean checkUserName(String userName) {
        return this.userName.equals(userName);
    }

    public void changePassword(String password) {
        this.password = password;
        System.out.println("Пароль изменён\n");
    }
}
