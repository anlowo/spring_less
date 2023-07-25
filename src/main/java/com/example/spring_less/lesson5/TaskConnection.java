package com.example.spring_less.lesson5;

import java.sql.*;

public class TaskConnection {
    static String url = "jdbc:postgresql://localhost:5432/postgres";
    static String username = "postgres";
    static String password = "postgres";
    public static void addUser(User user) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String sql = "insert into users (username, password, email) " + "value (?, ?, ?)";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, user.getUserName());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getEmail());

            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("Запись успешно создана");
                statement.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }
}
