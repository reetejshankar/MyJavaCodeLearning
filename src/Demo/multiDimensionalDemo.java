package Demo;

public class multiDimensionalDemo {
    public static void main(String[] args) {

        int[][] arr1 = new int[3][4];

        for (int[] arr11 : arr1) {
            for (int col = 0; col < arr1.length + 1; col++) {
                arr11[col] = (int) (Math.random() * 10);

            }
        }

        System.out.println("-----------------");

        for (int[] arr11 : arr1) {
            for (int col = 0; col < arr1.length + 1; col++) {
                System.out.print(arr11[col] + " ");
            }
            System.out.println();
        }
    }

}
