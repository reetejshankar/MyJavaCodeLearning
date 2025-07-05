package DSA.ConditionalsAndLoops.IntermediateJavaProg;

import java.util.Scanner;

public class Assignments03 {
    public static void main(String[] args) {
        // 3. Average of n numbers

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = s.nextInt();

        double sum = 0;
        System.out.println("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            double num = s.nextDouble();
            sum += num; // Add each number to the sum
        }
        double average = sum / n; // Calculate the average
        System.out.println("The average of the entered numbers is: " + average);
    }
}
