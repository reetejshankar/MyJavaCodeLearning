package DSA.BinarySearch.QuestionsLeetcode;

public class FloorQuestions02 {
    public static void main(String[] args) {

        int [] arr = { 2, 3, 5, 9, 14, 16, 18};
        int target = 13;
        int ans = Floor(arr, target);
        System.out.println(ans);
    }

    static int Floor(int[] arr, int target) {


        int start = 0;
        int end = arr.length - 1;

        if (target > arr[end]) {
            return -1;
        }

        int i = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]){
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
