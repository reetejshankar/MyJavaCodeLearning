package JavaProgrammingConstructs;

public class Operators {
    public static void main(String[] args) {

        // Assignment operators : =
        /*int a,b,c;
        a = 10;
        b = c = 20;
        */

        //arithmatic operator :  +,-,*,/,%
        int a = 20;
        int b = 30;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        System.out.println("==========================");

        // Unary operators : +, -, ++, --
        int x = 3;
        int y = x++; // 4
        int z = ++x; // 5
        System.out.println(y);
        System.out.println(z);

        System.out.println("============================");

        // Relational operators : ==, >, <, >=, <=
        int num1 = 20;
        int num2 = 10;
        System.out.println(num1 == num2); // F
        System.out.println(num1 > num2); // T
        System.out.println(num1 < num2); // F
        System.out.println(num1 >= num2); // T
        System.out.println(num1 <= num2); // F

        System.out.println("===========================");

        //Logical operators : &&, || , !
        int numI = 30;
        // F
        System.out.println("The result of logical AND is "+((numI > num2) && (numI == num2)));
        // T
        System.out.println("The result of logical OR is "+((numI > num2) || (numI == num2)));

        System.out.println("============================");

        // Bitwise operators : &, |, ^(Exclusive OR), ~(Complement), >>(Right-Sift), <<(Left-Shift)
        int x1 = 12; // 00001100
        int y1 = 20; // 00010100
        System.out.println("x1 & y1: " + (x1 & y1)); // 00000100 = 4
        System.out.println("x1 & y1: " + (x1 | y1)); // 00011100 = 28
        System.out.println("x1 & y1: " + (x1 ^ y1)); // 00011000 = 24
        System.out.println("Logical complement of x1 is: " + (~x1)); // 00001101 = -13
        System.out.println("Right shift of x1 by 2 is: " + (x1 >> 2)); // 00000011 = 3
        System.out.println("Left shift of x1 by 2 is: " + (x1 << 2)); // 00110000 = 48

        // example
        int a1 = 12; // 00001100
        int b1 = ~a1;
        System.out.println(b1); // -13

        System.out.println("===============================");

        // Ternary operator : <expr1> ? <exp2> : <expr3>;
        int e = 10, f = 20;
        String result;
        result = (e > f) ? "e is greater" : "f is greater";
        // result = (a>b) ? 1 : 2;
        System.out.println(result);
    }
}
