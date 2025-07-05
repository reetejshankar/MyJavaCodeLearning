package DSA.Conditions;

import java.util.Scanner;

public class Assignments06 {
    public static void main(String[] args) {

        // 6. Input currency in rupees and output in USD.

        Scanner s = new Scanner(System.in);
        double inr = s.nextDouble();

        // USD = INR / Exchange Rate

        double Exchange_Rate = 83.50;
        double USD = inr / Exchange_Rate;

        System.out.println("$" + USD);
    }
}
