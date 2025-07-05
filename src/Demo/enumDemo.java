package Demo;

enum Status {

    Running, Failed, Pending, Success;
}

public class enumDemo {
    public static void main(String[] args) {

        Status s = Status.Running;

        System.out.println(s.getClass().getSuperclass());

        switch (s) {
            case Running -> System.out.println("All Good");
            case Failed -> System.out.println("Try Again");
            case Pending -> System.out.println("Please Wait");
            default -> System.out.println("Done");
        }

    }

}
