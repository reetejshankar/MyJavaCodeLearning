package DSA.FlowOfProgram;

import java.util.Scanner;

public class Assignments03 {
    public static void main(String[] args) {

        // 3. Take a number as input and print the multiplication table for it.

        Scanner s = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = s.nextInt();

        int mul = 1;
        for (int i = 1; i <= 10; i++) {
            mul *= i;
            System.out.print(num * i + " ");
        }
        System.out.println();
    }
}
