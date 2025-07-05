package DSA.LinearSearch;

public class Assignments04 {
    public static void main(String[] args) {

        // Give an array nums of integer return how many of them
        // contains an even number of digits.

        int[] nums = { 12, 345, 2, 6, 7896 };

        System.out.println(findNumber(nums));
    }

    static int findNumber(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }


        return count;
    }

    // function to check weather a number contains even or not
    static boolean even(int num) {
        int numberOfDigit = digit(num);

        return numberOfDigit % 2 == 0;
    }

    // count number of digit in a number
    static int digit(int num) {
        int count = 0;

        while (num > 0) {
            count++;
            num /= 10;  // num = num / 10

        }
        return count;
    }
}
