package SubclassesAndInterfaces;

public class Interfaces {

    public interface Iproduct {

        static final String PRODUCTZONE = "CA-LA";

        public void addProductDetails();

        public void showProductDetails(String prodId);
    }

    public interface IDistributor {

        public void addDistributor(String detail);

        public void processOrder(String orderId);
    }

    public static class Tshirts implements Iproduct, IDistributor {
        String[] tshirts;

        @Override
        public void addProductDetails() {
            tshirts = new String[3];
            tshirts[0] = "T-shirt A, Red color, Brand A";
            tshirts[1] = "T-shirt B, Black color, Brand B";
            tshirts[2] = "T-shirt C, Blue color, Brand C";
            System.out.println("Product details added");
        }

        @Override
        public void showProductDetails(String prodId) {
            System.out.println("Tshirt Detals");
            for (String details : tshirts) {
                System.out.println(details);
            }
        }

        public void showShirtSizes() {
            System.out.println("T-shirt Sizes");
            System.out.println("Large");
            System.out.println("Medium");
            System.out.println("Small");
        }

        @Override
        public void addDistributor(String details) {
            System.out.println("Distributor Added: " + details);
        }

        @Override
        public void processOrder(String orderId) {
            System.out.println("Order Processed: " + orderId);
        }
    }

    public static void main(String[] args) {

        System.out.println(Iproduct.PRODUCTZONE + " Zone");
        Tshirts obj = new Tshirts();
        obj.addProductDetails();
        System.out.println("-----------------------");
        obj.showProductDetails("T001");
        System.out.println("-----------------------");
        obj.showShirtSizes();
        System.out.println("-----------------------");
        obj.addDistributor("Dress Smart");
        System.out.println("-----------------------");
        obj.processOrder("O001");

    }
}
