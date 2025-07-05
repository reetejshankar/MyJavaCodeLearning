package JavaProgrammingConstructs;

public class ConstantAndEnum {

    // Enumeration Is a class type that contains collection of constant value it can also contain intense variable and constructor it is defined using the enum keyword.

    // define an enum of days of the week
    enum Days {
        Sun, Mon, Tue, Wed, Thu, Fri, Sat
    }

    public static void main(String[] args) {

        // syntax: final <variable name> = <value>;

        final float pi = 3.14f;  // constant and final value
        System.out.println(pi);

        // Enumerations
        // syntax: enum <enum-name> { const1, const2,........,constN}

        Days day;
        // Instantiating the enum days
        day = Days.Tue;
        // Printing The value of enum
        System.out.println("Today is: " + day);
    }
}
