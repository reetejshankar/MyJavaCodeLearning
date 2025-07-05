package DSA.Conditions;

import java.util.Scanner;

public class Assignments01 {
    public static void main(String[] args) {

        // 1. Write a program to print whether a number is even or odd, also take input from the user.

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is Even number");
        } else {
            System.out.println(num + " is Odd number");
        }
    }
}
