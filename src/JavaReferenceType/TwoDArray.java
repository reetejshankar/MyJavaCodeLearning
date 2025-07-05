package JavaReferenceType;

public class TwoDArray {

    int[][] score;

    public TwoDArray() {
        score = new int[5][2];
        score[0][0] = 40;
        score[1][0] = 56;
        score[2][0] = 76;
        score[3][0] = 60;
        score[4][0] = 85;
        score[0][1] = 60;
        score[1][1] = 45;
        score[2][1] = 65;
        score[3][1] = 74;
        score[4][1] = 90;
        System.out.println("Scores Added: ");

    }

    public void viewScores() {
        System.out.println("Scores are kisted below:");
        System.out.println("Player 1: " + score[0][0] + "," + score[0][1]);
        System.out.println("Player 2: " + score[1][0] + "," + score[1][1]);
        System.out.println("Player 3: " + score[2][0] + "," + score[2][1]);
        System.out.println("Player 4: " + score[3][0] + "," + score[3][1]);
        System.out.println("Player 5: " + score[4][0] + "," + score[4][1]);
    }
    public static void main(String[] args) {

        TwoDArray obj1 = new TwoDArray();
        obj1.viewScores();

    }
}
