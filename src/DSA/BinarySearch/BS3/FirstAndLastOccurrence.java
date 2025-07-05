package DSA.BinarySearch.BS3;

public class FirstAndLastOccurrence {

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 8, 8, 9, 12 };
        int k = 8;

        int first = findFirstOccurrence(arr, k);
        int last = findLastOccurrence(arr, k);

        System.out.println(first + " " + last);
    }

    public static int findFirstOccurrence(int[] arr, int target) {
        int start = 0, end = arr.length - 1, result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                result = mid;
                end = mid - 1; // look on left side
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return result;
    }

    public static int findLastOccurrence(int[] arr, int target) {
        int start = 0, end = arr.length - 1, result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                result = mid;
                start = mid + 1; // look on right side
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return result;
    }
}
