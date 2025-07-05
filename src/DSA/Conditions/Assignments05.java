package DSA.Conditions;

import java.util.Scanner;

public class Assignments05 {
    public static void main(String[] args) {

        // 5. Take 2 numbers as input and print the largest number.

        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = s.nextInt();

        System.out.println("Enter second number: ");
        int num2 = s.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else {
            System.out.println(num2 + " is greater than " + num1);
        }
    }
}
