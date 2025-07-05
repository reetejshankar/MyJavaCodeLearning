package DSA.LinearSearch;

public class Assignments03 {
    public static void main(String[] args) {

        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };

        maxValue(arr);

        minValue(arr);


    }

    static void maxValue(int[][] arr) {

        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        System.out.println(max);
    }

    static void minValue(int[][] arr) {

        int min = Integer.MAX_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt < min) {
                    min = anInt;
                }
            }
        }
        System.out.println(min);
    }
}
