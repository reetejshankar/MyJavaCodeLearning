package Demo;

public class jaggedArrayDemo {
    public static void main(String[] args) {

        int[][] nums = new int[3][]; // jagged array

        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];

        for (int[] num : nums) {
            for (int col = 0; col < num.length; col++) {
                num[col] = (int) (Math.random() * 10);
            }
        }

        for (int n[] : nums) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }

}
