package DSA.BinarySearch.ProblemSolving.firstRepeatedArr;

public class Problem01 {
    public static void main(String[] args) {

        // arr = { 1, 3, 5, 3, 9, 1}

        int[] arr = {1, 3, 5, 9, 3, 9, 1, 30};
        int ans = FirstrepeatedArr(arr);
        System.out.println(ans);
    }

    static int FirstrepeatedArr(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
