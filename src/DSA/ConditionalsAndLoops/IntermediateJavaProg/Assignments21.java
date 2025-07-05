package DSA.ConditionalsAndLoops.IntermediateJavaProg;

import java.util.Scanner;

public class Assignments21 {
    public static void main(String[] args) {

        // 21. Write a program to print the sum of negative numbers,
        // sum of positive even numbers and the sum of positive odd
        // numbers from a list of numbers (N) entered by the user.
        // The list terminates when the user enters a zero.

        Scanner s = new Scanner(System.in);

        System.out.println("Press 1 to continue: ");
        int value = s.nextInt();

        if (value == 1) {
            System.out.println("Enter number: ");
            int num = s.nextInt();

            int sum = 0;

            // for sum of negative number
            for (int i = -1; i >= num; i--) {
                if (num < 0) {
                    sum += i;
                }
            }
            System.out.println("Sum of negative number is: " + sum);

            // sum of positive even number
            int num1 = s.nextInt();
            int sum1 = 0;
            for (int i1 = 0; i1 <= num1; i1++) {
                if (i1 % 2 == 0) {
                    sum1 += i1;
                }
            }
            System.out.println("Sum of even number is: " + sum1);

            // sum of odd number
            int num2 = s.nextInt();
            int sum2 = 0;
            for (int i2 = 0; i2 <= num2; i2++) {
                if (i2 % 2 != 0) {
                    sum2 += i2;
                }
            }
            System.out.println("Sum of odd number is: " + sum2);

        }
    }
}
