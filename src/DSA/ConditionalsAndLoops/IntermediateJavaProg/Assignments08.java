package DSA.ConditionalsAndLoops.IntermediateJavaProg;

public class Assignments08 {
    public static void main(String[] args) {

        // 8. Calculate Depreciation of value

        // Cost of Asset = Original purchase price
        //Salvage Value = Value at end of useful life
        // Expected usage duration (in years)

        double costOfAsset = 50000.00;
        double salvageValue = 5000;
        int year = 5;

        double depreciationOfValue = (costOfAsset - salvageValue) / year;
        System.out.println("$" + depreciationOfValue);
    }
}
