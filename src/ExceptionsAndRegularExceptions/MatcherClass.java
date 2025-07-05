package ExceptionsAndRegularExceptions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherClass {
    public static void main(String[] args) {

        String choice;

        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the pattern: ");
            String expression = s.next();

            Pattern pt = Pattern.compile(expression);
            System.out.println("Enter the string to search: ");
            String search = s.next();
            Matcher mt = pt.matcher(search);

            boolean found = false;

            while (mt.find()) {
                System.out.println("Found the pattern " + mt.group() + " starting at index " + mt.start()
                        + " and ending at index " + mt.end());

                found = true;
            }

            if (!found) {
                System.out.println("No match found");
            }

            System.out.println("Press x to exits or y to continue");
            choice = s.next();

            if (choice.equals("x")) {
                System.exit(0);
            }
        }

    }
}
