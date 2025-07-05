package JavaProgrammingConstructs;

import java.util.*;

public class assignment01 {
    public static void main(String[] args) {
        /*
         * Create a Java program with the below specifications:
         *
         * 1. Create a class with the main() method.
         *
         * 2. Create an infinite while-loop and within the loop, perform the following:
         *
         * Ask the users if they wish to continue (0/1). Here 0 is for yes and 1 is for
         * no.
         *
         * If the user enters 1, exit the loop.
         *
         * If the user enters 0, display a menu with four options one for each -
         * addition, subtraction, multiplication, division numbered from 1 to 4
         * respectively.
         *
         * Take input of choice from the user.
         *
         * Take the input of two numbers from the user.
         *
         * Based on the choice, perform the appropriate arithmetic operation on the
         * numbers.
         *
         * (Hint: Use a switch-case for numbers 1 to 4)
         *
         * Display the result to the user.
         */

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Do you wish to continue (0/1)? ");
            int value = sc.nextInt();

            if (value == 0) {
                System.out.println("1. Addition\n2. Substraction\n3. Multiplication\n4. Division\n5. Modulus");
                Scanner input = new Scanner(System.in);
                System.out.println("Select an arihmetic operation ");
                int val = input.nextInt();
                System.out.print("Enter first number: ");
                double num1 = input.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = input.nextDouble();
                switch (val) {
                    case 1 -> System.out.println("Addition of " + num1 + " and " + num2 + " is " + num1 + num2);
                    case 2 -> System.out.println("Substraction of " + num1 + " and " + num2 + " is " + (num1 - num2));
                    case 3 -> System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + num1 * num2);
                    case 4 -> System.out.println("Division of " + num1 + " and " + num2 + " is " + num1 / num2);
                    default -> System.out.println("Modulus of " + num1 + " and " + num2 + " is " + num1 % num2);
                }
            }
            if (value == 1) {
                System.out.println("Program Terminated");
                break;
            }
        }
    }
}
