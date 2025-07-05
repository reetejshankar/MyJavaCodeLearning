package DSA.ConditionalsAndLoops.BasicJavaProg;

import java.util.Scanner;

public class Assignments24 {
    public static void main(String[] args) {
        // 24. Take integer inputs till the user enter 0 and print the largest number

        Scanner s = new Scanner(System.in);
        System.out.println("Enter numbers (0 to exit):");
        int largest = s.nextInt();
        int count = 1;

        while (true) {
            int number = s.nextInt();
            if (number == 0) {
                break; // Exit the loop if the user enters 0
            }
            if (number > largest) {
                largest = number; // Update largest if the new number is greater
            }
            count++;
        }
        System.out.println(largest + " is the largest number entered.");
    }
}
