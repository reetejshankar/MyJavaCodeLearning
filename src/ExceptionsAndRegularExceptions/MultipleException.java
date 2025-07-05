package ExceptionsAndRegularExceptions;

import java.util.*;

public class MultipleException {


    public static void main(String[] args) {

            Scanner s = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int num1 = s.nextInt();

            System.out.print("Enter second number: ");
            int num2 = s.nextInt();

            MultipleException obj = new MultipleException();

            try {
                obj.calculate(num1, num2);
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception occurred: " + e);
            } finally {
                System.out.println("--------------------------");
                System.out.println("All resources closed in finally block");
            }

    }

    public void calculate(int a, int b) throws ArithmeticException, ArrayIndexOutOfBoundsException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        int c = a / b;
        System.out.println("Division of " + a + " and " + b + " is " + c);
        int[] arr = new int[c];
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length) {
                throw new ArrayIndexOutOfBoundsException();
            }
            arr[i] = i + 1;
        }
    }
}

