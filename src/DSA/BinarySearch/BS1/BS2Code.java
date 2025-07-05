package DSA.BinarySearch.BS1;

import java.util.Arrays;

public class BS2Code {
    public static void main(String[] args) {

        int[] arr = { 3, 4, 6, 7, 9, 12, 16, 17 };

        int target = 6;
        System.out.println("Index is: " + Arrays.toString(BS2(arr, target)));

    }

    static int[] BS2(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return new int[]{mid};
            }

            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return new int[]{-1};
    }
}
