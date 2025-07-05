package ExceptionsAndRegularExceptions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternClass {
    public static void main(String[] args) {

        Pattern pt = Pattern.compile("b*x");

        // create the matcher object using the pattern object with the string to match
        Matcher mt = pt.matcher("bbbx");

        // check for match
        boolean result = mt.matches();
        System.out.println("Pattern Match: " + result);
    }
}
