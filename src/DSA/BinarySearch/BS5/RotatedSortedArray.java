package DSA.BinarySearch.BS5;

import java.util.Arrays;

public class RotatedSortedArray {
    public static void main(String[] args) {

        int[] arr = { 7, 8, 9, 1, 2, 3, 4, 5, 6 };
        int target = 1;
        System.out.println(Arrays.toString(rotatedSorted(arr, target)));

    }

    static int[] rotatedSorted(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return new int[]{mid};
            }

            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }

            } else {
                if (arr[mid] <= target && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }

            }
        }
        return new int[]{-1};
    }
}
