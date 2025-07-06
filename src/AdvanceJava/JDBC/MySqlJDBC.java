package AdvanceJava.JDBC;

import java.sql.*;

public class MySqlJDBC {
    public static void main(String[] args) throws SQLException {

        String sql = "select name from students where rollno = 4";
        String url = "jdbc:mysql://localhost:3306/students";
        String username = "root";
        String password = "shankar322@322";

        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        String name = rs.getString(1);
        System.out.println(name);
        con.close();
    }
}
