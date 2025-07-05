package JavaProgrammingConstructs;

public class EnhancedLoop {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int num;
        // simple loop
        for (int j : arr) {
            num = j;
            System.out.println(num);
        }

        System.out.println("-------------------");

        // for each loop
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };
        for (int i : arr1) {
            System.out.println(i);
        }
    }
}
