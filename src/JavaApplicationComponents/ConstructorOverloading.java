package JavaApplicationComponents;

public class ConstructorOverloading {

    public static class Customer {
        String custId, address;
        float orderAmt;
        int itemCount;

        public Customer() {
            custId = "C000";
            address = "Undefined";
            orderAmt = 0.0f;
            itemCount = 0;
        }

        // overloaded costructor method 1
        public Customer(String id, String addr) {
            custId = id;
            address = addr;
        }

        // overloaded costructor method 2
        public Customer(String id, float amount, int quantity) {
            custId = id;
            orderAmt = amount;
            itemCount = quantity;
        }

        public void displayDetails() {
            System.out.println("Customer Id: " + custId);
            System.out.println("Address: " + address);
            System.out.println("Order Amount $: " + orderAmt);
            System.out.println("Item count: " + itemCount);
        }
    }

    public static void main(String[] args) {

        Customer c1 = new Customer();
        c1.displayDetails();
        System.out.println("-----------------------");
        Customer c2 = new Customer("C001", "Sandra Park");
        c2.displayDetails();
        System.out.println("------------------------");
        Customer c3 = new Customer("C002", 456.50f, 30);
        c3.displayDetails();
    }
}
