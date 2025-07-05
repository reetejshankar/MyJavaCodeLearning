package DSA.ConditionalsAndLoops.IntermediateJavaProg;


public class Assignments20 {
    public static void main(String[] args) {

        // 20. Kunal is allowed to go out with his friends only
        // on the even days of a given month. Write a program to
        // count the number of days he can go out in the month of August.

        for (int i = 1; i <= 31; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " \n");
            }
        }
        System.out.println("Allow to frnd outside");
    }
}
