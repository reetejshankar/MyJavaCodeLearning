package JavaReferenceType;

public class OneDimensionArray {

    int score[]; // declarung the array

    public OneDimensionArray() {
        score = new int[5]; // instantiating the array
        // instantiating the array
        score[0] = 40;
        score[1] = 56;
        score[2] = 76;
        score[3] = 60;
        score[4] = 85;
        System.out.println("Scores Added");
    }

    public void viewScores() {
        System.out.println("Scores are listed bellow: ");
        System.out.println(score[0] + "\n" + score[1] + "\n" + score[2] + "\n" + score[3] + "\n" + score[4]);
    }

    public static void main(String[] args) {

        OneDimensionArray obj1 = new OneDimensionArray();
        obj1.viewScores();

    }
}
