package DSA.ConditionalsAndLoops.BasicJavaProg;

import java.util.Scanner;

class Solution {
    public void subtractProductAndSum(int n) {
        int sum = 0;
        int mul = 1;
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            mul *= digit;
            temp /= 10;
        }
        System.out.println("Sum of digit = " + sum);
        System.out.println("Product of digit = " + mul);
        System.out.println("Product - Sum = " + (mul - sum));

    }
}

public class Assignments21 {
    public static void main(String[] args) {

        // 20. Subtract the Product and Sum of Digits of an Integer

//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int n = s.nextInt();

        Solution s = new Solution();
        s.subtractProductAndSum(1234);
        s.subtractProductAndSum(4421);

//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum += i;
//        }
//        System.out.println(sum);
//
//        int mul = 1;
//        for (int i = 1; i <= n; i++) {
//            mul *= i;
//        }
//        System.out.println(mul);
//
//        System.out.println(mul - sum);

//        int sum = 0;
//        int mul = 1;
//        int temp = n;
//
//        while (temp > 0) {
//            int digit = temp % 10;
//            sum += digit;
//            mul *= digit;
//            temp /= 10;
//        }
//        System.out.println("Sum of digit = " + sum);
//        System.out.println("Product of digit = " + mul);
//        System.out.println("Product - Sum = " + (mul - sum));
    }
}
