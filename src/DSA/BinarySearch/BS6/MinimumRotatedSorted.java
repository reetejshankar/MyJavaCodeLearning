package DSA.BinarySearch.BS6;

public class MinimumRotatedSorted {
    public static void main(String[] args) {
        int[] arr = {7, 8, 0, 1, 2, 3, 4, 5, 6};
        System.out.println("Minimum element is: " + minimumSortedArr(arr));
    }

    static int minimumSortedArr(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] < arr[high]) {
                high = mid;
            } else if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                // When arr[mid] == arr[high], we can't be sure — shrink search space
                high--;
            }
        }

        return arr[low];
    }
}
