package ExceptionsAndRegularExceptions;

import java.util.Scanner;
import java.util.regex.*;

// Step 1: Custom exception class
class ValidationException extends Exception {
    public ValidationException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}

// Step 2: Login class
class Login {
    String empid;
    String password;

    public Login(String empid, String password) {
        this.empid = empid;
        this.password = password;
    }

    // Step 3: Method to validate employee ID format
    public static boolean validateEmployeeId(String empid) {
        // Regular expression to match employee IDs like E0001, E0002 etc.
        String regex = "E\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(empid);
        return matcher.matches();
    }

    // Step 4: Method to validate credentials
    public static void validateCredentials(String empid, String password) throws ValidationException {
        // Dummy values
        String correctEmpId = "E0002";
        String correctPassword = "gatepass";

        if (empid.equals(correctEmpId) && password.equals(correctPassword)) {
            System.out.println("Welcome Employee!");
        } else {
            throw new ValidationException("Invalid employee ID or password.");
        }
    }

    public String getEmpid() {
        return empid;
    }

    public String getPassword() {
        return password;
    }
}

public class Assignment06 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            String empid;
            // Step 5: Infinite loop to get valid employee ID
            while (true) {
                System.out.print("Enter Employee ID: ");
                empid = sc.nextLine();

                if (Login.validateEmployeeId(empid)) {
                    break;
                } else {
                    System.out.println("Invalid employee ID format. Try again.");
                }
            }
            // Step 6: Ask for password and validate
            System.out.print("Enter Password: ");
            String password = sc.nextLine();
            try {
                Login.validateCredentials(empid, password);
            } catch (ValidationException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
