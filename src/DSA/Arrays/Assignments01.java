package DSA.Arrays;

import java.util.Scanner;

public class Assignments01 {
    public static void main(String[] args) {

        // 1. Given an array of marks of students if the marks of
        // any student is less than 35 prints its role number
        // [ roll number here refers to the index of the array]

        Scanner s = new Scanner(System.in);
        System.out.println("Enter marks index size: ");
        int marksSize = s.nextInt();

        int[] marks = new int[marksSize];

        System.out.println("Enter marks of sub: ");
        for (int i = 0; i < marksSize; i++) {
            marks[i] = s.nextInt();
        }

        for (int i = 0; i < marksSize; i++) {
            if (marks[i] <= 35) {
                System.out.println("Your less 35 marks index is: " + i);
            }
        }

        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }
}
