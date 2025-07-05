package JavaReferenceType;

public class StringArray {

    String[] itemId = new String[7];

    public StringArray() {
        System.out.println("Products Added");
        for (int count = 0; count < itemId.length; count++) {
            itemId[count] = "Item00" + (count + 1);
        }
    }

    public void displayProducts() {
        System.out.println("Products in the inventory are:");
        for (String item : itemId) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {

        StringArray obj = new StringArray();
        obj.displayProducts();
    }
}
