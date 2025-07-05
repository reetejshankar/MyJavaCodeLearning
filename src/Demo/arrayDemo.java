package Demo;

public class arrayDemo {
    public static void main(String[] args) {

        // int[] arr = { 1, 2, 3, 4 };

        int[] arr = new int[4];
        arr[0] = 4;
        arr[1] = 5;
        arr[2] = 3;
        arr[3] = 10;

        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);

        for (int j : arr) {
            System.out.println(j);
        }

        // or

        for (int i : arr) {
            System.out.println(i);
        }
    }

}
