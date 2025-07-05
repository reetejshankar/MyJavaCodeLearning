package DSA.BinarySearch.BS2;

import java.util.Arrays;

public class BS3Code {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 4, 7, 9, 10, 15 };
        int target = 3;  // insert into the array

        System.out.println(Arrays.toString(BS3(arr, target)));

    }

    static int[] BS3(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end--;
            } else {
                start++;
            }
        }
        return new int[]{start};
    }
}
