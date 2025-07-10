package AdvanceJava.JDBC.JDBCProjectSql;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws SQLException {

        while (true) {
            System.out.println("\n Employee Management");
            System.out.print("1 = Create, 2 = Read, 3 = Update, 4 = Delete: ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            if (choice < 1 || choice >= 5){
                System.out.println("Exiting.....");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.println("Enter Employee Details (id, name, email, salary):");
                    int id = sc.nextInt();
                    sc.nextLine();
                    String name = sc.nextLine();
                    String email = sc.nextLine();
                    int salary = sc.nextInt();
                    Employee emp = new Employee(id, name, email, salary);
                    EmployeeDao.createEmployee(emp);
                    System.out.println("Employee added successfully!!");
                    break;

                case 2:
                    ArrayList<Employee> List = EmployeeDao.readAllEmployee();
                    for (Employee employee : List) {
                        System.out.println(employee);
                    }
                    break;

                case 3:
                    System.out.println("id & name ");
                    id = sc.nextInt();
                    sc.nextLine();
                    name = sc.nextLine();
                    EmployeeDao.updateEmployee(id, name);
                    System.out.println("Employee updated successfully!!");
                    break;

                case 4:
                    System.out.println("Enter Employee ID to Delete:");
                    id = sc.nextInt();
                    EmployeeDao.deleteEmployee(id);
                    System.out.println("Employee deleted successfully!!");
                    break;
            }
        }
    }
}
