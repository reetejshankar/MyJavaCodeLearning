package JavaProgrammingConstructs;

public class FormatinTheOutput {
    public static void main(String[] args) {

        // formate the output
        int a = 5;
        System.out.println("The value of a is " + a + ".");
        System.out.print("The value of a is ");
        System.out.print(a);
        System.out.print(".");
        System.out.println("Done");

        System.out.println("=======================");

        /*
        %d: Format the num as a decimal integer
        %f: Format the num as a real number
        %o: Format the num as a octal number
        %e: Format the num as a decimal number in scientific notation
        %n: Display output in a new line
        */
        int num = 78 / 33; // 2.36
        // using %d for decimal integer
        System.out.printf("Result of 78/33 is %d %n", num); // 2 conver an integer

        // using %f with extra zeros
        double val = 3.0 /2.0; // 1.5
        System.out.printf("Result of 3.0/2.0 is %f %n", val); // 1.500000

        // using %e for scientific notation
        val = 7000.0 / 2.0; // 3500
        System.out.printf("Result of 7000.0/2.0 is %e %n", val); // 3.500000e+03

        // using %e for negative infinity
//        val = -20.0 / 0.0;
//        System.out.printf("Result of -20.0 / 0.0 is %e %n", val); // -Infinity

        // using multiple format specifiners
        System.out.printf("Value of PI is %f and E is %e %n", Math.PI, Math.E); // PI = 3.14 AND E = 2.71 ONLY/-
    }
}
