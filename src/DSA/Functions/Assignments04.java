package DSA.Functions;

import java.util.Scanner;

public class Assignments04 {
    public static void main(String[] args) {

        // 4. Write a program to print the sum of two numbers
        // entered by user by defining your own method.

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        sumOfNum(n,m);

        // Define a method that returns the product of two numbers entered by user.
        prodOfNum(n,m);

    }

    static void sumOfNum(int n, int m) {
        int sum = n + m;
        System.out.println("Sum of " + n + " and " + m + " is " + sum);
    }

    static  void prodOfNum(int n, int m) {
        int multi = n * m;
        System.out.println("Product of " + n + " and " + m + " is " + multi);
    }
}
