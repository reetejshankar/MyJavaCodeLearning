package DSA.BinarySearch.ProblemSolving.PrintingDuplicate;

public class Problem01 {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 3, 9, 1, 30};
        printingDuplicate(arr);
    }

    private static void printingDuplicate(int[] arr) {

        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
        System.out.println();
    }
}
