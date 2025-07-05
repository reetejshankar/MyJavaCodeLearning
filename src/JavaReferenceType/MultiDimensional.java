package JavaReferenceType;

public class MultiDimensional {
    public static void main(String[] args) {

        // int[][] score = { { 40, 60 }, { 56, 45 }, { 76, 65 }, { 60, 74 }, { 85, 90 }
        // };
        int[][] scores1 = new int[5][2];
        int row = 5;
        int cols = 2;
        scores1[0][0] = 40;
        scores1[1][0] = 56;
        scores1[2][0] = 76;
        scores1[3][0] = 60;
        scores1[4][0] = 85;
        scores1[0][1] = 60;
        scores1[1][1] = 45;
        scores1[2][1] = 65;
        scores1[3][1] = 74;
        scores1[4][1] = 90;

        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= cols; j++) {
                System.out.print(scores1[i][j] + " ");
            }
        }
        System.out.println();

    }
}
