package DSA.Conditions;

import java.util.Scanner;

public class Assignments04 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter first num: ");
        int num1 = s.nextInt();

        System.out.println("Enter Second num: ");
        int num2 = s.nextInt();

        System.out.println("1. ADD\n2. Sub\n3. Mul\n4. Div");
        System.out.println("Put 1 to 4: ");
        int value = s.nextInt();

        if (value == 1) {
            System.out.println(num1 + num2);
        } else if (value == 2) {
            System.out.println(num1 - num2);
        } else if (value == 3) {
            System.out.println(num1 * num2);
        } else {
            System.out.println(num1 / num2);
        }
    }
}
