package DSA.LinearSearch;

public class Assignments02 {
    public static void main(String[] args) {

        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };

        search(arr, 34);


    }

    static void search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int cols = 0; cols < arr[row].length; cols++) {
                if (arr[row][cols] == target) {
                    System.out.println("[ " + row + ", " + cols + " ]");
                }
            }
        }
    }
}
