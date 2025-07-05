package JavaApplicationComponents;

import java.util.*;

public class IntanceVariable {

    public static class Calculator {
        private int sum;
        String name;

        public int add(int a, int b) {
            sum = a + b;
            return sum;
        }
    }

    public static void main(String[] args) {

        Calculator objCalc = new Calculator();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name: ");
        objCalc.name = s.next();
        System.out.println("Enter your first number: ");
        int num1 = s.nextInt();
        System.out.println("Enter your second number: ");
        int num2 = s.nextInt();
        System.out.println("Dear, " + objCalc.name);
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + objCalc.add(num2, num2));

    }
}
