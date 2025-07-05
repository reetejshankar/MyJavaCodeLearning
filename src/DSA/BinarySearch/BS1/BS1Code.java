package DSA.BinarySearch.BS1;

public class BS1Code {
    public static void main(String[] args) {

        int[] arr = { 3, 4, 6, 7, 9, 12, 16, 17 };

        int target = 6;
        System.out.println(BS(arr, target));

    }

    static int BS(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
