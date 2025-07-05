package DSA.Conditions;

import java.util.Scanner;

public class Assignments03 {
    public static void main(String[] args) {

        // 3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Principle number: ");
        double p = s.nextDouble();

        System.out.println("Enter Time: ");
        int t = s.nextInt();

        System.out.println("Enter Rate: ");
        double r = s.nextDouble();

        double SI = ( p * t * r) / 100;

        System.out.println(SI);

    }
}
