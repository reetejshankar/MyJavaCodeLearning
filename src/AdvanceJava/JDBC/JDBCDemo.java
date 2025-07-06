package AdvanceJava.JDBC;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/students";
        String user = "root";
        String password = "shankar322@322";

        int rollno = 6;
        String name = "Shankar";
        int age = 22;

        String sql = "INSERT INTO students(rollno, name, age) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, rollno);
            pstmt.setString(2, name);
            pstmt.setInt(3, age);

            int m = pstmt.executeUpdate();

            if (m == 1) {
                System.out.println("Inserted successfully.");
            } else {
                System.out.println("Insertion failed.");
            }

        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
