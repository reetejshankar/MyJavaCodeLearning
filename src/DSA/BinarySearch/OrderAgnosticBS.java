package DSA.BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {

        int[] arr = { -18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89 };

        int target = 22;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);  // Expected Output: 10

    }

    private static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsce = arr[start] < arr[end];  // Check if ascending or descending

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsce) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1; // target not found
    }
}
