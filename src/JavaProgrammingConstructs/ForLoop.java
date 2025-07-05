package JavaProgrammingConstructs;

public class ForLoop {
    public static void main(String[] args) {

        // for loop
        // Multiple expresion in for loop
        int x, y, n = 10;
        for (x = 0, y = n; x <= y; x++, y--) {
            System.out.println(x + " + " + y + " = " + (x + y));
        }

        System.out.println("-----------------------");

        // for loop with all declation expressions
        for (int i = 1; i <= 3; i++) {
            System.out.println("Value of i is " + i);
        }

        System.out.println("-----------------------");

        // Variable initialization within for statement
        for (int j = 1; j <= 2; j++) {
            System.out.println("vALUE OF J IS " + j);
        }

        System.out.println("-----------------------");

        // nested for loop
        for (int x1 = 0; x1 < 5; x1++) {
            for (int y1 = 0; y1 <= x1; y1++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-----------------------");

        // using boolean variable for condition
        boolean check = false;
        for (int num = 1; !check; num++) {
            System.out.println("Value of num is " + num);
            if (num == 2) {
                check = true;
                System.out.println("Check = true. Loop terminated.");
            }
        }
    }
}
