package DSA.FlowOfProgram;

import java.util.Scanner;

public class Assignments05 {
    public static void main(String[] args) {

        // 5. Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

        Scanner s = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = s.nextInt();

        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
