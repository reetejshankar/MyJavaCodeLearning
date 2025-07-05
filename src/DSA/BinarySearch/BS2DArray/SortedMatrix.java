package DSA.BinarySearch.BS2DArray;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(Arrays.toString(sortingMatrix(arr, 9)));
    }

    static int[] BinarySearch(int[][] arr, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (arr[row][mid] == target) {
                return new int[]{row, mid};
            } else if (target > arr[row][mid]) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] sortingMatrix(int[][] arr, int target) {
        int row = arr.length;
        int cols = arr[0].length;

        if (row == 1) {
            return BinarySearch(arr, 0, 0, cols - 1, target);
        }

        int rStart = 0;
        int rEnd = row - 1;
        int cMid = cols / 2;

        while (rStart < rEnd - 1) {
            int mid = rStart + (rEnd - rStart) / 2;

            if (arr[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }

            if (arr[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // Check in the 2 remaining rows: rStart and rStart + 1
        if (arr[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }

        if (rStart + 1 < row && arr[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        // 4 parts of remaining two rows
        // 1st quadrant
        if (target <= arr[rStart][cMid - 1]) {
            return BinarySearch(arr, rStart, 0, cMid - 1, target);
        }

        // 2nd quadrant
        if (target >= arr[rStart][cMid + 1] && target <= arr[rStart][cols - 1]) {
            return BinarySearch(arr, rStart, cMid + 1, cols - 1, target);
        }

        // 3rd quadrant
        if (rStart + 1 < row && target <= arr[rStart + 1][cMid - 1]) {
            return BinarySearch(arr, rStart + 1, 0, cMid - 1, target);
        }

        // 4th quadrant
        if (rStart + 1 < row) {
            return BinarySearch(arr, rStart + 1, cMid + 1, cols - 1, target);
        }

        return new int[]{-1, -1};
    }
}
