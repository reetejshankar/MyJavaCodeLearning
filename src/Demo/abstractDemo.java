package Demo;

abstract class Car {

    public abstract void drive();

    public abstract void fly();

    public void playMusic() {

        System.out.println("play music");
    }
}

abstract class Wagaon extends Car {

    @Override
    public void drive() {

        System.out.println("driving...");
    }

}

class UpdateWagon extends Wagaon { // concrete class

    @Override
    public void fly() {

        System.out.println("flyinh....");
    }
}

public class abstractDemo {
    public static void main(String[] args) {

        Car obj = new UpdateWagon();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
