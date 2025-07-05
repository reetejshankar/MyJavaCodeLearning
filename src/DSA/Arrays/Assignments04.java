package DSA.Arrays;

public class Assignments04 {
    public static void main(String[] args) {
        // 4. Second largest element

        int[] arr = {1,23,4,5,6,78};

        int max = Integer.MIN_VALUE;

        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }

        int smax = Integer.MIN_VALUE;

        for (int j : arr) {
            if (j > smax && j != max) {
                smax = j;
            }
        }
        System.out.println(max);
        System.out.println(smax);
    }
}
