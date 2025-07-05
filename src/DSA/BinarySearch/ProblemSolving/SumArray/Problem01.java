package DSA.BinarySearch.ProblemSolving.SumArray;

public class Problem01 {
    public static void main(String[] args) {

        // arr = 1,2,3,4,5,6,7,8,9

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int ans = sumArray(arr);
        System.out.println(ans);

    }

    static int sumArray(int[] arr) {
        int sum = 0;
        int i = 0;
        while (i < arr.length) {
            sum += arr[i];
            i++;
        }
        return sum;
    }
}
