package DSA.ConditionalsAndLoops.IntermediateJavaProg;

public class Assignments04 {
    public static void main(String[] args) {
        // 4. Calculate Discount of a Product
        double originalPrice = 100.0; // Example original price
        double discountPercentage = 20.0; // Example discount percentage
        double discountAmount = (discountPercentage / 100) * originalPrice; // Calculate discount amount
        double finalPrice = originalPrice - discountAmount; // Calculate final price after discount
        System.out.println("Original Price: $" + originalPrice);
    }
}
