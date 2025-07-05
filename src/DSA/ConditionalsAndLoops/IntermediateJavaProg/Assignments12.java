package DSA.ConditionalsAndLoops.IntermediateJavaProg;

import java.util.Scanner;

public class Assignments12 {
    public static void main(String[] args) {

        // 12. Calculate Avg

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Total Subjects: ");
        int totalSub = s.nextInt();

        int sum = 0;

        for (int i = 1; i <= totalSub; i++) {
            System.out.println("Enter your sub " + i);
            int sub = s.nextInt();
            sum += sub;
        }
        double avg = (double) sum / totalSub;
        System.out.println(avg);

    }
}
