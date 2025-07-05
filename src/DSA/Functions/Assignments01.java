package DSA.Functions;

public class Assignments01 {
    public static void main(String[] args) {

        // 1. Define two methods to print the maximum and the minimum
        // number respectively among three numbers entered by the user.

        maxNumber(20,44,21);
        minNumber(20,44,21);
    }

    static void maxNumber(int n, int m, int o) {
        if (n > m && n > o) {
            System.out.println(n + " greater than " + m + " and " + o);
        } else if (m > o && m > n) {
            System.out.println(m + " greater than " + o + " and " + n);
        } else {
            System.out.println(o + " greater than " + n + " and " + m);
        }
    }

    static void minNumber(int n, int m, int o) {
        if (n < m && n < o) {
            System.out.println(n + " lower than " + m + " and " + o);
        } else if (m < o && m < n) {
            System.out.println(m + " lower than " + o + " and " + n);
        } else {
            System.out.println(o + " lower than " + n + " and " + m);
        }
    }
}
