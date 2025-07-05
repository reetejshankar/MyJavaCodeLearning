package DSA.ConditionalsAndLoops.IntermediateJavaProg;

import java.util.Scanner;

public class Assignments18 {
    public static void main(String[] args) {

        // 18. Perfect Numbers

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = s.nextInt();

        int sum = 0;

        // Find divisors from 1 to num - 1
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        if (sum == num) {
            System.out.println(num + " is a Perfect Number.");
        } else {
            System.out.println(num + " is NOT a Perfect Number.");
        }
    }
}
