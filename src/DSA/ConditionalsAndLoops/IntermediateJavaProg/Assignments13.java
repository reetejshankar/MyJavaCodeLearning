package DSA.ConditionalsAndLoops.IntermediateJavaProg;

import java.util.Scanner;

public class Assignments13 {
    public static void main(String[] args) {

        // 13. Sum of n number

        Scanner s = new Scanner(System.in);
        System.out.println("Number: ");
        int num = s.nextInt();

        int sum = 0;

        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
