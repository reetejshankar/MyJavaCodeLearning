package DSA.Functions;

import java.util.Scanner;

public class Assignments06 {
    public static void main(String[] args) {

        // 6. Define a method to find out if a number is prime or not.

        Scanner s = new Scanner(System.in);
        int isPrime = s.nextInt();

        System.out.println(primeOrNot(isPrime));
    }

    static boolean primeOrNot(int isPrime) {
        if (isPrime <= 1) {
            return false;
        }

        int c = 2;
        if (c * c <= isPrime) {
            if (isPrime % c == 0) {
                return false;
            }
            c++;
        }
        return c * c >= isPrime;
    }
}
