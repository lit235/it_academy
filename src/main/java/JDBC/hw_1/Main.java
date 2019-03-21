package JDBC.hw_1;

import com.github.javafaker.Faker;

import java.sql.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws SQLException {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:postgresql:postgres", "postgres", "235")) {
          /*  String createTable = "CREATE TABLE boks"+
                    "(id INTEGER not NULL, " +
                    " name VARCHAR(50), " +
                    "genre VARCHAR (50), " +
                    " id_autor INTEGER not NULL, " +
                    " PRIMARY KEY (id))";
            CreateTable(connection,createTable);*/
            addBoks(connection);

        }

    }

    public static void addBoks(Connection connection) throws SQLException {
        String insertTableSQL = "INSERT INTO boks(name, genre,id_autor)\n" +
                "VALUES (?,?,?);";
        Faker faker = new Faker();
        try (PreparedStatement statement = connection.prepareStatement(insertTableSQL)) {

                statement.setString(1, faker.book().title());
                statement.setString(2, faker.book().genre());
                statement.setInt(3, (int) Math.random() * 10);


            statement.execute();
        }
    }

    public static void CreateTable(Connection connection, String sql) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            statement.execute(sql);
        } catch (SQLException ex) {
            throw new SQLException();
        }
    }

}
