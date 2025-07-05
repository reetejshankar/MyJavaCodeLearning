package JavaReferenceType;

import java.util.*;

public class Assignment04 {

    public static void acceptValue(String[] playerNames, int[] scores) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter player name: ");
            playerNames[i] = sc.next();
            System.out.print("Enter the score: ");
            scores[i] = sc.nextInt();
            sc.nextLine(); // consume new line
        }
    }

    // Method to display values
    public static void displayValue(String[] playernames, int[] scores) {
        System.out.println("\nNames and Scores of the top three players:");
        System.out.println("Player\tScore");
        for (int i = 0; i < 3; i++) {
            System.out.println(playernames[i] + "\t" + scores[i]);
        }
    }

    public static void main(String[] args) {

        // check for at least 2 arguments
        if (args.length < 2) {
            System.out.println("Invalid credentials");
        }

        String username = args[0];
        String password = args[1];

        if (username.equals("admins") && password.equals("admins")) {
            String[] playerNames = new String[3];
            int[] scores = new int[3];

            acceptValue(playerNames, scores);
            displayValue(playerNames, scores);
        } else {
            System.out.println("Invalid credentials");
        }

    }
}
