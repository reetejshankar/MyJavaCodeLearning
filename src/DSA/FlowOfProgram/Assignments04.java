package DSA.FlowOfProgram;

import java.util.Scanner;

public class Assignments04 {
    public static void main(String[] args) {

        // 4. Take 2 numbers as inputs and find their HCF and LCM.

        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = s.nextInt();

        System.out.println("Enter second number: ");
        int num2 = s.nextInt();

        int hcf = 1;
        int a = num1;
        int b = num2;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        hcf = a;
        int lcm = (num1 * num2) / hcf;

        System.out.println(hcf);
        System.out.println(lcm);
    }
}
