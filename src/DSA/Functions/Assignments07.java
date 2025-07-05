package DSA.Functions;

import java.util.*;

public class Assignments07 {
    public static void main(String[] args) {

        // 7. Write a program that will ask the user to enter his/her marks (out of 100).
        // Define a method that will display grades according to the marks entered as below:
        //
        //Marks        Grade
        //91-100         AA
        //81-90          AB
        //71-80          BB
        //61-70          BC
        //51-60          CD
        //41-50          DD
        //<=40          Fail

        Scanner s = new Scanner(System.in);

        double sub1 = s.nextDouble();
        double sub2 = s.nextDouble();
        double sub3 = s.nextDouble();
        double sub4 = s.nextDouble();

        int totalSub = 5;

        double avg = (sub1 + sub2 + sub3 + sub4) / totalSub;
        System.out.println(avg);

        StudentMarks(avg);

    }

    static void StudentMarks(double avg) {

        if (avg >= 91 && avg <= 100) {
            System.out.println("AA Grade");
        } else if (avg >= 81 && avg <= 90) {
            System.out.println("AB Grade");
        } else if (avg >= 71 && avg <= 80) {
            System.out.println("BB Grade");
        } else if (avg >= 61 && avg <= 70) {
            System.out.println("BC Grade");
        } else if (avg >= 51 && avg <= 60) {
            System.out.println("CD Grade");
        } else if (avg >= 41 && avg <= 50) {
            System.out.println("DD Grade");
        } else {
            System.out.println("Fail");
        }

    }
}
