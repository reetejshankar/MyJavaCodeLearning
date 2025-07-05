package DSA.FlowOfProgram;

import java.util.Scanner;

public class Flowcharts {
    public static void main(String[] args) {

        // 01.

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        int salary = s.nextInt();

        if (salary > 10000) {
            salary = salary + 2000;
        } else {
            salary = salary + 1000;
        }
        System.out.println("Your salary is when bonus added: $" + salary);

        System.out.println("------------------------");

        // 02.

        System.out.println("Enter a number is: ");
        int isPrime = s.nextInt();

        if (isPrime <= 1) {
            System.out.println("neither prime nor composite");
        }

        int c = 2;

        while (c * c <= isPrime) {
            if (isPrime % c == 0) {
                System.out.println("Not a prime");
            }
            c += 1;
        }
    }
}
