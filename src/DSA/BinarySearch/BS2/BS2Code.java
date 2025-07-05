package DSA.BinarySearch.BS2;

import java.util.Arrays;

public class BS2Code {
    public static void main(String[] args) {

        // Upper-bond: smallest index such that arr[i] > n

        int[] arr = { 2, 3, 6, 7, 8, 8, 11, 11, 11, 12 };
        int target = 13;

        System.out.println("Index is: " + Arrays.toString(BS2(arr, target)));

    }

    static int[] BS2(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
//
//        if (target > arr[end]) {
//            return new int[]{-1};
//        }
//
        while (start <= end) {
            int mid = start + (end - start) / 2;
//
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return new int[]{end};

    }
}
