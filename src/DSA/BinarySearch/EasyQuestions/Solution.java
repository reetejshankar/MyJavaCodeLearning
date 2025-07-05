package DSA.BinarySearch.EasyQuestions;

import java.util.*;

class GuessGame {
    private int pick;

    // Constructor to set the picked number
    public GuessGame(int pick) {
        this.pick = pick;
    }

    // The guess API as described
    public int guess(int num) {
        if (num > pick) return -1;
        else if (num < pick) return 1;
        else return 0;
    }
}

public class Solution extends GuessGame {

    // Constructor to initialize the picked number
    public Solution(int pick) {
        super(pick);
    }

    // Main method to guess the number
    public int guessNumber(int n) {
        int low = 1;
        int high = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int result = guess(mid);

            if (result == 0) {
                return mid;
            } else if (result < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1; // Should not be reached
    }
    // Main method to run the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the upper bound (n): ");
        int n = scanner.nextInt();

        System.out.print("Enter the picked number (between 1 and " + n + "): ");
        int pickedNumber = scanner.nextInt();

        Solution game = new Solution(pickedNumber);
        int guessedNumber = game.guessNumber(n);

        System.out.println("Guessed number is: " + guessedNumber);
    }
}
