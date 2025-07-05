package DSA.Functions;

public class Assignments03 {
    public static void main(String[] args) {

        // 3. A person is eligible to vote if his/her
        // age is greater than or equal to 18. Define
        // a method to find out if he/she is eligible to vote.

        vote(30);
        vote(17);
    }

    static void vote(int age) {
        if (age >= 18) {
            System.out.println(age + " is eligible for vote");
            System.out.println("Congratulations!!!!!!");
        } else {
            System.out.println(age + " is not eligible for vote");
            System.out.println("Sorry For your age.");
        }
    }
}
