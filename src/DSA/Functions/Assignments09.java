package DSA.Functions;

import java.util.Scanner;

public class Assignments09 {
    public static void main(String[] args) {

        // 9. Write a function to find if a number is a palindrome or not. Take number as parameter.

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (isPalindrome(n) == true) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

    static boolean isPalindrome(int n) {
        int reverse = 0;

        // Copy of the original number so that the original
        // number remains unchanged while finding the reverse
        int temp = Math.abs(n);
        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
        }

        // If reverse is equal to the original number, the
        // number is palindrome
        return (reverse == Math.abs(n));
    }
}