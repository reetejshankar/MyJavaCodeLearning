package Demo;

enum LAPTOP {

    Macbook(2000), XPS(2200), Surface, ThinkPad(1800);

    private int price;

    private LAPTOP() {

        price = 500;
    }

    private LAPTOP(int price) {
        this.price = price;
        System.out.println("In LAPTOP " + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class enumClassDemo {
    public static void main(String[] args) {

        // LAPTOP lap = LAPTOP.Macbook;
        // System.out.println(lap + " : " + lap.getPrice());

        for (LAPTOP lap : LAPTOP.values()) {

            System.out.println(lap + " : " + lap.getPrice());
        }
    }

}
