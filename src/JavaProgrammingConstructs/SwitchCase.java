package JavaProgrammingConstructs;

public class SwitchCase {

    enum Days {
        Mon, Tue, Wed, Thu, Fri, Sat, Sun
    }

    public static void main(String[] args) {

        // int day = 5;

        // switch (day) {
        // case 1 -> System.out.println("Monday");
        // case 2 -> System.out.println("Tuesday");
        // case 3 -> System.out.println("Wednesday");
        // case 4 -> System.out.println("Thursday");
        // case 5 -> System.out.println("Friday");
        // case 6 -> System.out.println("Saturday");
        // case 7 -> System.out.println("Sunday");
        // default -> System.out.println("Invalid Day");

        // nested switch-case
        Days today = Days.Tue;
        String hour = "am";
        int week = 2;
        switch (today) {
            case Mon, Tue, Wed, Thu, Fri -> {
                System.out.println("Discount scheme for weekdays");
                switch (week) {
                    case 1, 3 -> System.out.println("No discont in week 1 and 3");
                    case 2, 4 -> System.out.println("20% discount in week 2 and 4");
                }
            }
            case Sat, Sun -> {
                switch (hour) {
                    case "am" -> System.out.println("Discount is 40%");
                    case "pm" -> System.out.println("Discount is 20%");
                }
            }
            default -> System.out.println("Day does not exist");
        }
    }
}
