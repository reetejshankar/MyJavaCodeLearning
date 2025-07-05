package DSA.LinearSearch;

public class Assignments01 {
    public static void main(String[] args) {

        // search for 3 in the range index[1,4]

        int[] arr = { 18, 12, -7, 3, 14, 28, 99, 66, 22};

        int ans = range(arr, 1,4,96);
        System.out.println(ans);
    }

    static int range(int[] arr, int index1, int index2, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
