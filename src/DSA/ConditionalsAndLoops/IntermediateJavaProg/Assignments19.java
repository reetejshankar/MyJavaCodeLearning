package DSA.ConditionalsAndLoops.IntermediateJavaProg;

import java.util.Scanner;

public class Assignments19 {
    public static void main(String[] args) {

        // 19 leap year

        Scanner s = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = s.nextInt();

        if ((year % 4 == 0) && ((year % 400 != 0) || (year % 100 == 0))) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not leap year");
        }
    }
}
