package AdvanceJava.JDBC.JDBCProjectSql;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {

    static Connection connection = null;

    public static Connection connect() {
        try {
            String url = "jdbc:mysql://localhost:3306/students";
            String userName = "root";
            String password = "shankar322@322";

            connection = DriverManager.getConnection(url, userName, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
