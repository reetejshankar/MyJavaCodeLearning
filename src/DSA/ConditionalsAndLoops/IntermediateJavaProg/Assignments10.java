package DSA.ConditionalsAndLoops.IntermediateJavaProg;

import java.util.Scanner;

public class Assignments10 {
    public static void main(String[] args) {

        // 10. Calculate CGPA

        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int n = s.nextInt();

        double total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter grade point for subject " + i + ": ");
            double grade = s.nextDouble();
            total += grade;
        }

        double cgpa = total / n;

        System.out.println("Your CGPA is: " + cgpa);

        // Optional: Convert CGPA to Percentage (CBSE rule)
        double percentage = cgpa * 9.5;
        System.out.println("Equivalent Percentage: " + percentage + "%");

    }
}
