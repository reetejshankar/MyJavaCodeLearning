package JavaReferenceType;

public class ArrayWithLoops {

    int[] score;
    int[][] scores;

    public ArrayWithLoops() {
        score = new int[5];
        score[0] = 40;
        score[1] = 56;
        score[2] = 76;
        score[3] = 60;
        score[4] = 85;
        System.out.println("Scores Added to One-Dimensional Array");

        scores = new int[5][2];
        scores[0][0] = 40;
        scores[1][0] = 56;
        scores[2][0] = 76;
        scores[3][0] = 60;
        scores[4][0] = 85;
        scores[0][1] = 60;
        scores[1][1] = 45;
        scores[2][1] = 65;
        scores[3][1] = 74;
        scores[4][1] = 90;
        System.out.println("Scores Added to Two-Dimensional Array");
    }

    public void viewScores() {
        System.out.println("Scores of one-dimensional array are:");
        for (int j : score) {
            System.out.println(j);
        }

        System.out.println("Scores of two-dimensional array are:");
        for (int row = 0; row < scores.length; row++) {
            System.out.println("Player " + (row + 1));
            for (int col = 0; col < scores[row].length; col++) {
                System.out.println(scores[row][col]);
            }
        }
    }

    public static void main(String[] args) {

        ArrayWithLoops obj = new ArrayWithLoops();
        obj.viewScores();

    }
}
