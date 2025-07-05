package JavaProgrammingConstructs;

import java.util.*;

public class JumpStatements {
    public static void main(String[] args) {

        int stopVal;
        for (int cnt = 1; cnt <= 10; cnt++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter any number or zero to stop: ");
            stopVal = input.nextInt();
            if (stopVal == 0) {
                System.out.println("Got zero. Loop Terminated.");
                break;
            }
        }
        System.out.println();
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Value of i is " + i);
        }
    }
}
