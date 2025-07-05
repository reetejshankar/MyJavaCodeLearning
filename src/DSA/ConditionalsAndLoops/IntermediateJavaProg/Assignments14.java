package DSA.ConditionalsAndLoops.IntermediateJavaProg;

import java.util.Scanner;

public class Assignments14 {
    public static void main(String[] args) {

        // 14. Find ncr and npr

        Scanner s = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = s.nextInt();

        System.out.print("Enter r: ");
        int r = s.nextInt();

        int nFact = 1, rFact = 1, nrFact = 1;

        for (int i = 1; i <= n; i++) {
            nFact *= i;
        }

        for (int i = 1; i <= r; i++) {
            rFact *= i;
        }

        for (int i = 1; i <= (n - r); i++) {
            nrFact *= i;
        }

        int nCr = nFact / (rFact * nrFact);
        int nPr = nFact / nrFact;

        System.out.println("nCr (Combination) = " + nCr);
        System.out.println("nPr (Permutation) = " + nPr);
    }
}
