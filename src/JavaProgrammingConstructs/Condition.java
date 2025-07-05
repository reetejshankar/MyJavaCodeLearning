package JavaProgrammingConstructs;

public class Condition {
    public static void main(String[] args) {

        // if-else statement
        int age = 30;

        if (age >= 18) {
            System.out.println("Eligible for vote");
        } else {
            System.out.println("don't eligible for vote");
        }

        System.out.println("======================");

        // if-elseif-else statement
        int ageValue = 30;

        if (ageValue >= 25) {
            System.out.println("Eligible for Sadi");
        } else if (ageValue >= 18) {
            System.out.println("You are adult");
        } else if (ageValue >= 16) {
            System.out.println("You are teen");
        } else {
            System.out.println("Kya re budhe mrta kyu nhi");
        }

        System.out.println("===============================");

        // Nested-if statement
        int agePerson = 43;
        char gender = 'M';

        if (agePerson >= 60) {
            System.out.println("Eligible for membership.");
            System.out.println("Discount 50%");
        } else if (agePerson >= 18) {
            System.out.println("Elgible for membership.");
            if (gender == 'F') {
                System.out.println("Discount 10%");
            } else {
                System.out.println("Discount 5%");
            }
        } else {
            System.out.println("Not elligible for membership.");
        }
    }
}
