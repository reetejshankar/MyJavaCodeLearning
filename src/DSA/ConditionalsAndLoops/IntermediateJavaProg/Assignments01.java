package DSA.ConditionalsAndLoops.IntermediateJavaProg;

import java.util.Scanner;

public class Assignments01 {
    public static void main(String[] args) {

        // 1. Factorial of a number

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial: ");
        int n = s.nextInt();

        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}
