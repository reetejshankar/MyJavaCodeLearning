package DSA.BinarySearch;

public class searchBinary {
    public static void main(String[] args) {

        int[] arr1 = { -1, 0, 3, 4, 5, 9, 12, 8};

//        int[] arr1 = {90, 74, 18, 12, 6, 4, 3, 1};

        int target = 3;
        int ans = searchBinaryArr(arr1, target);

        System.out.println(ans);


    }

    static int searchBinaryArr(int[] arr1, int target) {
        int start = 0;
        int end = arr1.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr1[mid]) {
                start = mid + 1;
            } else if (target < arr1[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
