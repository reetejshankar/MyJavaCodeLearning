package JavaProgrammingConstructs;

public class LabeledJump {
    public static void main(String[] args) {

        outer: for (int i = 0; i < 5; i++) {
            for (int j = 1; j < 4; j++) {
                if (j == 2) {
                    System.out.println("Found 2. Jumping out.");
                    // Break out of inner loop
                    break outer;
                }
            }
        }
        System.out.println("Out of outer loop");

        System.out.println("----------------------------");

        outer: for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                if (j > i) {
                    System.out.println();
                    continue outer;
                }
                System.out.print(j + " ");
            }
            System.out.println("\nEnd of outer loop.");
        }
    }


}
