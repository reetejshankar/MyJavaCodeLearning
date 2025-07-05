package DSA.Conditions;

import java.util.Scanner;

public class Assignments09 {
    public static void main(String[] args) {

        // 9. To find Armstrong Number between two given number.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");

        for (int num = start; num <= end; num++) {
            int original = num;
            int sum = 0;
            int digits = String.valueOf(num).length();

            int temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == original) {
                System.out.println(original);
            }
        }

        sc.close();
    }
}
