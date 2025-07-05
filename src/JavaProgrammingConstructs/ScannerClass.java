package JavaProgrammingConstructs;

import java.util.*;

public class ScannerClass {
    public static void main(String[] args) {

        // nextByte(): return a byte value
        // nextInt(): return a integer value
        // nextLong(): return a long value
        // nxtFloat(): return a float vaue
        // nextDouble(): return a double value

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int intValue = sc.nextInt();
        System.out.print("Enter an Decimal number: ");
        float floatValue = sc.nextFloat();
        System.out.print("Enter an String value: ");
        String strValue = sc.next();
        System.out.print("Values you entered are: ");
        System.out.println(intValue + " " + floatValue + " " + strValue);
    }
}
