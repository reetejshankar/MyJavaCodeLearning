package DSA.BinarySearch.QuestionsLeetcode;

public class SearchRangeQuestions04 {
    public static void main(String[] args) {

        // search Range

        int[] arr = { 5, 7, 7, 8, 8, 10 };

        int target = 7;
        searchRange(arr, target);
    }

    static void searchRange(int[] arr, int target) {
//        int start = 0;
//        int end = arr.length - 1;
//
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            if (target > arr[mid]) {
//                start = mid + 1;
//            } else if (target < arr[mid]) {
//                end = mid - 1;
//            } else {
//                return mid;
//            }
//        }
//        return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
