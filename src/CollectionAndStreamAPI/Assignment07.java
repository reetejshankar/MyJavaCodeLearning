package CollectionAndStreamAPI;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Item {
    private final int id;
    private final String name;
    private final double price;

    public Item(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void displayItem() {
        System.out.println("Item ID: " + id);
        System.out.println("Item Name: " + name);
        System.out.println("Item Price: ₹" + price);
    }
}

public class Assignment07 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            Map<Integer, Item> itemMap = new HashMap<>();
            int choice;

            do {
                System.out.println("\nMenu:");
                System.out.println("1. Enter Item Details");
                System.out.println("2. View Item Details");
                System.out.println("3. View All Items");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {

                    case 1 -> {
                        System.out.print("Enter Item ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        System.out.print("Enter Item Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Item Price: ");
                        double price = scanner.nextDouble();
                        itemMap.put(id, new Item(id, name, price));
                        System.out.println("Item added successfully!");
                    }

                    case 2 -> {
                        if (itemMap.isEmpty()) {
                            System.out.println("No items in the collection.");
                            break;
                        }
                        System.out.print("Enter Item ID to view: ");
                        int searchId = scanner.nextInt();
                        if (itemMap.containsKey(searchId)) {
                            System.out.println("Item Details:");
                            itemMap.get(searchId).displayItem();
                        } else {
                            System.out.println("Item with ID " + searchId + " not found.");
                        }
                    }

                    case 3 -> {
                        if (itemMap.isEmpty()) {
                            System.out.println("No items in the collection.");
                        } else {
                            System.out.println("All Items:");
                            for (Item item : itemMap.values()) {
                                item.displayItem();
                                System.out.println("-------------------");
                            }
                        }
                    }

                    case 4 -> System.out.println("Exiting program. Goodbye!");

                    default -> System.out.println("Invalid choice. Please try again.");
                }

            } while (choice != 4);
        }
    }
}
