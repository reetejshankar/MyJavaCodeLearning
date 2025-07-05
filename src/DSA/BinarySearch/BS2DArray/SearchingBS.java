package DSA.BinarySearch.BS2DArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchingBS {
    public static void main(String[] args) {

        int[][] arr = {
                { 18, 9, 12 },
                { 36, -4, 91},
                { 44, 33, 16 }
        };

        int target = 91;
        int[] ans = searchingBS(arr, target);
        System.out.println(Arrays.toString(ans));

//        if (ans[0] != -1) {
//            System.out.println("Found at row: " + ans[0] + ", column: " + ans[1]);
//        } else {
//            System.out.println("Not Found");
//        }
    }

    private static int[] searchingBS(int[][] arr, int target) {

       int r = 0;
       int c = arr.length - 1;

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
