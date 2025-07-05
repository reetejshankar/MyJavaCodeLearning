package DSA.ConditionalsAndLoops.BasicJavaProg;

import java.util.Scanner;

public class Assignments22 {
    public static void main(String[] args) {

        //22. Input a number and print all the factors of that number

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        System.out.println("Factors of " + num + " are: ");

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        s.close();
    }
}
