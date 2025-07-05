package ExceptionsAndRegularExceptions;

import java.util.regex.Pattern;

public class SplitPatternClass {

    public static final String REGEX = ":";
    public static final String DIRECTION = "East:West:North:South";
    public static final String REGEX1 = "\\d";
    public static final String DIRECTIONS = "East1West2North3South";

    public static void main(String[] args) {

        Pattern pt = Pattern.compile(REGEX);
        String[] directions = pt.split(DIRECTION);

        for (String s : directions) {
            System.out.println(s);
        }

        System.out.println("-------------------------");

        Pattern obj1 = Pattern.compile(REGEX1);
        String[] days = obj1.split(DIRECTIONS);

        for (String s : days) {
            System.out.println(s);
        }
    }
}
