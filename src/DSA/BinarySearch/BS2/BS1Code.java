package DSA.BinarySearch.BS2;

import java.util.Arrays;

public class BS1Code {
    public static void main(String[] args) {

        // low-bond : smallest index such that arr[i] >= n

        int[] arr = { 3, 5, 8, 15, 19 };
        int target = 16;

        System.out.println("Index is: " + Arrays.toString(BS1(arr, target)));

    }

    static int[] BS1(int[] arr, int target) {
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
        return new int[]{start};
    }
}
