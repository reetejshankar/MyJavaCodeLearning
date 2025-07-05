package DSA.ConditionalsAndLoops.IntermediateJavaProg;

import java.util.Scanner;

public class Assignments11 {
    public static void main(String[] args) {

        // 11. Compound Interest

        // A = Total amount after time T
        //P = Principal (initial amount)
        //R = Annual interest rate (%)
        //T = Time (in years)

        Scanner s  = new Scanner(System.in);

        System.out.println("Principle: ");
        double P = s.nextDouble(); // Principal (initial amount)

        System.out.println("Rate: ");
        double R = s.nextDouble(); // Annual interest rate (%)

        System.out.println("Time (in Year): ");
        double T = s.nextDouble(); // Time (in years)

        double amount  = P * Math.pow((1 + R / 100), T);
        double ci = amount - P;

        System.out.println("Total Amount: " + amount);
        System.out.println("Compound Interest: " + ci);
    }
}
