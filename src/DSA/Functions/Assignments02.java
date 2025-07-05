package DSA.Functions;

public class Assignments02 {
    public static void main(String[] args) {

        // 2. even or odd
        evenOrOdd(3);
        evenOrOdd(98);
    }

    static void evenOrOdd(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is an Even number");
        } else {
            System.out.println(n + " is a Odd number");
        }
    }
}
