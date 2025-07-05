package DSA.ConditionalsAndLoops.IntermediateJavaProg;

import java.util.Scanner;

public class Assignments02 {
    public static void main(String[] args) {

        // 2. Calculate Electricity Bill
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of units consumed: ");
        double unitsConsumed = s.nextDouble(); // Example value for units consumed

        double billAmount;
        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 1.5; // Rate for first 100 units
        } else if (unitsConsumed <= 300) {
            billAmount = (100 * 1.5) + ((unitsConsumed - 100) * 2.5); // Rate for next 200 units
        } else {
            billAmount = (100 * 1.5) + (200 * 2.5) + ((unitsConsumed - 300) * 3.0); // Rate for above 300 units
        }
        System.out.println("Electricity Bill for " + unitsConsumed + " units is: $" + billAmount);
    }
}
