package JavaProgrammingConstructs;

public class Loops {
    public static void main(String[] args) {

        // ===>> While loop

        // Infinite loop
        // while (true) {
        // System.out.println("This is infinite loop");
        // }

        int num1 = 10;
        // while loop with nested-if construct
        while (num1 < 15) {
            System.out.println("Number is: " + num1);
            if (num1 == 12) {
                System.out.println("Warning!! The number " + num1 + " is not allowed");
            }
            num1++;
        }

        System.out.println("------------------------------------");

        // null statement loop
        int num2 = 20;
        while (++num1 < --num2) {
            System.out.println("Mid-point of num1 and num2 is " + num1);
        }

        System.out.println("------------------------------------");

        int num3 = 20;
        // do-while loop that will execute at least once
        // even though condition is false
        do {
            System.out.println("The value of num3 is " + num3);
        } while (num3 > 21);
    }
}
