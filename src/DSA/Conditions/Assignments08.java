package DSA.Conditions;

import java.util.*;

public class Assignments08 {
    public static void main(String[] args) {

        // 8. To find out whether the given String is Palindrome or not.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = sc.nextLine();

        // Convert to lowercase to ignore case sensitivity
        String str = original.toLowerCase();

        // Reverse the string
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        // Check if original equals reversed
        if (str.equals(reversed)) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is NOT a Palindrome");
        }

        sc.close();

    }
}
