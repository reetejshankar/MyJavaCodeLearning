package DSA.Arrays;

public class Assignments03 {
    public static void main(String[] args) {

        // 3. Find the maximum value out of all element array

        int[] maxArr = { 10, 3, 5, 6, 9, 7, 2 };

        int max = maxArr[0];

        for (int j : maxArr) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println(max);
    }
}
