package AdvanceJava.JDBC.MyPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class University {

    public void createDatabase() {
        try {
            String url = "jdbc:mysql://localhost:3306/";
            String userName = "root";
            String password = "shankar322@322";

            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();

            String name = "CREATE DATABASE IF NOT EXISTS university";
            statement.execute(name);
            System.out.println("Database created successfully.");
            connection.close();

        } catch (Exception e) {
            System.out.println("Exception caught in createDatabase: " + e.getMessage());
        }
    }

    public void createTable() {
        try {
            String url = "jdbc:mysql://localhost:3306/university";
            String userName = "root";
            String password = "shankar322@322";

            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();

            String query = "CREATE TABLE IF NOT EXISTS teachers (" +
                    "id INT PRIMARY KEY, " +
                    "name VARCHAR(50), " +
                    "salary INT, " +
                    "email VARCHAR(50))";

            statement.executeUpdate(query);
            System.out.println("Table created successfully.");
            connection.close();

        } catch (Exception e) {
            System.out.println("Exception caught in createTable: " + e.getMessage());
        }
    }

    public void createData() {
        try {
            String url = "jdbc:mysql://localhost:3306/university";
            String userName = "root";
            String password = "shankar322@322";

            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();

            String query = "INSERT INTO teachers (id, name, salary, email) VALUES " +
                    "(1, 'Anjali Sharma', 20000, 'anjalisharma@gmail.com'), " +
                    "(2, 'Mia Khalifa', 200000, 'miasexy@gmail.com'), " +
                    "(3, 'Reetej Singh Rajput', 500000, 'reetej@gmail.com'), " +
                    "(4, 'Ram Singh', 500000, 'ram@gmail.com')";

            statement.executeUpdate(query);
            System.out.println("Data inserted successfully.");
            connection.close();

        } catch (Exception e) {
            System.out.println("Exception caught in createData: " + e.getMessage());
        }
    }

    public void readData() {
        try {
            String url = "jdbc:mysql://localhost:3306/university";
            String userName = "root";
            String password = "shankar322@322";

            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();

            String query = "SELECT * FROM teachers";
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                System.out.println("id = " + rs.getInt("id"));
                System.out.println("name = " + rs.getString("name"));
                System.out.println("salary = " + rs.getInt("salary"));
                System.out.println("email = " + rs.getString("email"));
                System.out.println("-------------------------");
            }

            System.out.println("Data read successfully.");
            connection.close();

        } catch (Exception e) {
            System.out.println("Exception caught in readData: " + e.getMessage());
        }
    }

    public void updateData() {
        try {
            String url = "jdbc:mysql://localhost:3306/university";
            String userName = "root";
            String password = "shankar322@322";

            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();

            String query = "UPDATE teachers SET salary = 600000 WHERE name = 'Reetej Singh Rajput'";
            statement.executeUpdate(query);

            System.out.println("Data updated successfully.");
            connection.close();

        } catch (Exception e) {
            System.out.println("Exception caught in updateData: " + e.getMessage());
        }
    }

    public void deleteData() {

        try {
            String url = "jdbc:mysql://localhost:3306/university";
            String userName = "root";
            String password = "shankar322@322";

            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();

            // Example: delete teacher where id = 2
            String query = "DELETE FROM teachers WHERE id = 2";
            int rowsAffected = statement.executeUpdate(query);

            if (rowsAffected > 0) {
                System.out.println("Data deleted successfully.");
            } else {
                System.out.println("No data found to delete.");
            }

            connection.close();

        } catch (Exception e) {
            System.out.println("Exception caught in deleteData: " + e.getMessage());
        }
    }
}
