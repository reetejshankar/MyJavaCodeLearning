package ExceptionsAndRegularExceptions;

import java.util.*;

class StandardException extends Exception {

    public StandardException(Throwable cause) {
        super(cause);
    }

    public StandardException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class WrapperExceptions {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int num1 = s.nextInt();

        System.out.println("Enter Second number: ");
        int num2 = s.nextInt();

        try {
            WrapperExceptions obj = new WrapperExceptions();
            obj.calculate(num1, num2);
        } catch (StandardException e) {
            // Throwable t = e.getCause();

            // print the message and the clause
            System.out.println("Error: " + e.getMessage());
            // System.out.println("Cause: " + t);
        } finally {
            System.out.println("---------------------------");
            System.out.println("All resources closed in finally block");
        }


    }

    public void calculate(int a, int b) throws StandardException {

        try {
            int c = a / b;
            System.out.println("Division of " + a + " and " + b + " is " + c);

            int[] arr = new int[c];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i + 1;
            }
        } catch (ArithmeticException e) {
            throw new StandardException("Divided by zero", e);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new StandardException("Array Index out of bounds", e);
        }
    }
}
