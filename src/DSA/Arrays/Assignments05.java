package DSA.Arrays;

public class Assignments05 {
    public static void main(String[] args) {

        // 5. count in the number of elements in given
        // array greater than a given number X

        int[] arr = { 3, 5, 6, 3, 8, 10 };

        int x = 4;
        int count = 0;

        for (int j : arr) {
            if (j > x) {
                count++;
                System.out.println(j);
            }
        }
    }
}
