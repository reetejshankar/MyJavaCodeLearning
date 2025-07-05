package ExceptionsAndRegularExceptions;

public class SystemClass {

    static String[] str1 = { "Mon", "Tue", "Wed", "Thu" };
    static String[] str2 = { "East", "West", "North", "South" };

    public static void main(String[] args) {

        System.out.println("Current time in milliseconds is: " + System.currentTimeMillis());
        System.out.println("Value of path variable is: " + System.getenv("PATH"));
        System.arraycopy(str1, 0, str2, 0, 3);
        System.out.println("Copied array is: ");
        for (int i = 0; i < 4; i++) {
            System.out.println(str2[i]);
        }

    }
}
