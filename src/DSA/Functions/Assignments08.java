package DSA.Functions;

import java.util.Scanner;

public class Assignments08 {
    public static void main(String[] args) {

        // 08. Factorial number
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int result = factorial(n);
        System.out.println(result);
    }

    static int factorial(int n) {
        int fact = 1;
        int i = 1;

        while (i <= n) {
            if (n == 1) {
                return 1;
            }
            fact *= i;
            i++;
        }
        return fact;
    }
}
