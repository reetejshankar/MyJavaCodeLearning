package DSA.BinarySearch.BS5;

public class DuplicateSortedArray {
    public static void main(String[] args) {

        int[] arr = { 3, 3, 1, 3, 3, 3, 3 } ;

        int target = 3;  // return mid
        int ans = duplicateArray(arr, target);
        System.out.println(ans);


    }

    static int duplicateArray(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;
                continue;
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
        return -1;
    }
}
