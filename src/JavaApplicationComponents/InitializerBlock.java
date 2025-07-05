package JavaApplicationComponents;

public class InitializerBlock {

    public static class Cal {
        private String name;
        {
            name = "Unknown";
        }
    }

    public static void main(String[] args) {

        Cal valCal = new Cal();
        System.out.println("Your name is " + valCal.name);
        valCal.name = "Reetej";
        System.out.println("Your name is " + valCal.name);
    }
}
