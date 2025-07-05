package DSA.BinarySearch.BS2DArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchingBS02 {
    public static void main(String[] args) {

        int[][] arr = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 33, 34, 38, 50 }
        };

        int target = 37;
        System.out.println(Arrays.toString(search(arr, target)));


    }

    static int[] search(int[][] arr, int target) {
        int r = 0;  // start
        int c = arr.length - 1; // end

        while (r < arr.length && c >= 0) {
            if (arr[r][c] == target) {
                return new int[]{r, c};
            }

            if (arr[r][c] < target) {
                r++;
            } else {
                c--;
            }

        }
        return new int[]{-1, -1};
    }
}
