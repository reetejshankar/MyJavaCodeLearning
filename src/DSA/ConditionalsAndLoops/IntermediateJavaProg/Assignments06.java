package DSA.ConditionalsAndLoops.IntermediateJavaProg;

import java.util.Scanner;

public class Assignments06 {
    public static void main(String[] args) {

        // 6. Calculate commission percentage

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your commission amount: ");
        double commissionAmount = s.nextDouble();

        System.out.println("Total Sales: ");
        double sales = s.nextDouble();

        double commission = (commissionAmount / sales) * 100;
        System.out.println("If a salesperson earned ₹" + sales + " commission on ₹"
                + commissionAmount + " of sales is: " + commission);
    }
}

