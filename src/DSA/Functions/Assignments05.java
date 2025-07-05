package DSA.Functions;

import java.util.Scanner;

public class Assignments05 {
    public static void main(String[] args) {

        // 5. Write a program to print the circumference
        // and area of a circle of radius entered by user
        // by defining your own method.

        Scanner s = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = s.nextDouble();

        areaOfCircle(radius);
        circumferenceOfCircle(radius);

    }

    static void areaOfCircle(double radius) {
        double area = (double) (Math.PI * radius * radius);
        System.out.println("Area of circle is: " + area);
    }

    static void circumferenceOfCircle(double radius) {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of circle is: " + circumference);
    }
}
