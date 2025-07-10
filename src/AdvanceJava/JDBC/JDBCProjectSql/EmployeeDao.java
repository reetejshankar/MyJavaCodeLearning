package AdvanceJava.JDBC.JDBCProjectSql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeDao {
    public static void createEmployee (Employee employee) throws SQLException {
        Connection connection = DB.connect();
        String query = Query.insert;
        PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, employee.getId());
            preparedStatement.setString(2, employee.getName());
            preparedStatement.setString(3, employee.getEmail());
            preparedStatement.setInt(4, employee.getSalary());

            System.out.println("\n ps = " + preparedStatement + "\n" + employee);
            preparedStatement.executeUpdate();
            preparedStatement.close();
    }

    public static void updateEmployee(int id, String name) throws SQLException {
        Connection connection = DB.connect();
        String query = Query.update;
        PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);

        int rowsUpdated = preparedStatement.executeUpdate();
        System.out.println(rowsUpdated + " row(s) updated.");
        preparedStatement.close();
    }

    public static ArrayList<Employee> readAllEmployee() throws SQLException {
        ArrayList<Employee> empList = new ArrayList<>();
        Connection connection = DB.connect();
        String query = Query.select;
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String email = resultSet.getString("email");
            int salary = resultSet.getInt("salary");
            empList.add(new Employee(id, name, email, salary));
        }

        resultSet.close();
        preparedStatement.close();
        return empList;

    }

    public static void deleteEmployee(int id) throws SQLException {
        Connection connection = DB.connect();
        String query = Query.delete;
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);

        int rowsDeleted = preparedStatement.executeUpdate();
        System.out.println(rowsDeleted + " row(s) deleted.");
        preparedStatement.close();
    }
}
