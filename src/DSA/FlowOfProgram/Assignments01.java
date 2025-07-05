package DSA.FlowOfProgram;

import java.util.Scanner;

public class Assignments01 {
    public static void main(String[] args) {

        // 1. Input a year and find whether it is a leap year or not.

        Scanner s = new Scanner(System.in);
        System.out.println("Enter number: ");
        int isLeapYear = s.nextInt();

        if ((isLeapYear % 4 == 0) && (isLeapYear % 100 != 0 || isLeapYear % 400 == 0)) {
            System.out.println(isLeapYear + " is a leap year.");
        } else {
            System.out.println(isLeapYear + " is not a leap year.");
        }
    }
}
