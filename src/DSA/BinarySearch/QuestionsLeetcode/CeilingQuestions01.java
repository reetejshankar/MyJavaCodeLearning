package DSA.BinarySearch.QuestionsLeetcode;

public class CeilingQuestions01 {
    public static void main(String[] args) {

        // ceiling number = smallest element in array is greater than or equal to target

        int [] arr = { 2, 3, 5, 9, 14, 16, 18};
        int target = 17; // 9
        int ans = ceilingBS(arr, target);
        System.out.println(ans);
    }

    static int ceilingBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (target > arr[start]) {
            return -1;
        }

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
        return start;
    }
}
