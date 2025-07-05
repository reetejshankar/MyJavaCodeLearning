package DSA.ConditionalsAndLoops.IntermediateJavaProg;

import java.util.Scanner;

public class Assignments17 {
    public static void main(String[] args) {

        // 17. Vowel or Consonant

        Scanner s = new Scanner(System.in);
        char ch = s.next().charAt(0);

        if (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a Vowels");
        } else {
            System.out.println(ch + " is a consonant");
        }
    }
}
