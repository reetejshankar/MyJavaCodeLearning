package DSA.ConditionalsAndLoops.BasicJavaProg;

public class Assignments23 {
    public static void main(String[] args) {

        // 23. Take integer inputs till the user enters 0
        // and print the sum of all numbers (HINT: while loop)

        int sum = 0;
        int number = 0;
        while (true) {
            System.out.print("Enter a number (0 to exit): ");
            number = new java.util.Scanner(System.in).nextInt();

            if (number == 0) {
                break; // Exit the loop if the user enters 0
            }

            sum += number; // Add the number to the sum
        }
        System.out.println("The sum of all entered numbers is: " + sum);




    }
}
