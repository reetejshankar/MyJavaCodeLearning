package CollectionAndStreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Order {
    enum Type {
        PREMIUM, NORMAL;
    }

    private String id = "";
    private int quantity = 0;
    private double price;
    private Type type = null;

    public Order(String id, int quantity, double price, Type type) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.type = type;
    }

    public double price() {
        return price;
    }

    public void price(double price) {
        this.price = price;
    }

    public String id() {
        return id;
    }

    public int quantity() {
        return quantity;
    }

    public Type type() {
        return type;
    }
}

public class JavaStreamAPIClass {
    public static void main(String[] args) {

        // Create an ArrayList of type Order
        List<Order> orders = new ArrayList<>();

        Order orderP1 = new Order("P001", 40, 80.50, Order.Type.PREMIUM);
        Order orderN1 = new Order("P001", 40, 80.50, Order.Type.PREMIUM);
        Order orderP2 = new Order("P001", 40, 80.50, Order.Type.PREMIUM);
        Order orderN2 = new Order("P001", 40, 80.50, Order.Type.PREMIUM);
        Order orderP3 = new Order("P001", 40, 80.50, Order.Type.PREMIUM);

        orders.add(orderP1);
        orders.add(orderN1);
        orders.add(orderP2);
        orders.add(orderN2);
        orders.add(orderP3);

        // Filtering ArrayList by type of order
        // by using filter() method Stream class
        Stream<Order> stream = orders.stream();
        Stream premium = stream.filter((Order o) -> o.type().equals(Order.Type.PREMIUM));
        System.out.println("Total Premium: " + premium.count());

        Stream<Order> normal = orders.stream().filter((Order o) -> o.type() == Order.Type.NORMAL);
        System.out.println("Total normal: " + normal.count());

        // Calculate total value of all orders
        double value = orders.stream().mapToDouble((Order o) -> o.price()).sum();
        System.out.println("Total amount of orders: " + value);

        long quantity = orders.stream().mapToLong((Order o) -> o.quantity()).sum();
        System.out.println("Total quantity of orders: " + quantity);

    }
}
