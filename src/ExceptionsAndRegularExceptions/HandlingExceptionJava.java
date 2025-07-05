package ExceptionsAndRegularExceptions;

import java.util.*;

public class HandlingExceptionJava {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = s.nextInt();

        System.out.print("Enter second number: ");
        int num2 = s.nextInt();

        HandlingExceptionJava obj = new HandlingExceptionJava();
        obj.calculate(num1, num2);
    }

    public void calculate(int a, int b) {

        try {
            int c = a / b; // line 1
            System.out.println("Division of " + a + " and " + b + " is " + c);

            int[] arr = new int[c];
            for (int i = 0; i < arr.length; i++) { // line 2
                arr[i] = i + 1;
            }
        } catch (ArithmeticException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred: " + e);
        } finally {
            System.out.println("--------------------------------");
            System.out.println("All resources closed in finally block");
        }
    }
}
