package Demo;

class Computer {

    public void playMusic() {
        System.out.println("Music Playing.....");
    }

    public String getMePen(int cost) {
        if (cost >= 5)
            return "Pen";
        else
            return "Nothing";
    }
}

public class methodDemo {
    public static void main(String[] args) {
        Computer c1 = new Computer();
        c1.playMusic();
        String str = c1.getMePen(5);
        System.out.println(str);
    }
}
