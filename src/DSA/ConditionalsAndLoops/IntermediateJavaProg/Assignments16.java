package DSA.ConditionalsAndLoops.IntermediateJavaProg;

public class Assignments16 {
    public static void main(String[] args) {

        // 16. Future Investment Value

        // P = Principal (initial amount)
        //R = Annual Interest Rate (in %)
        //n = Number of times interest is compounded per year (e.g., 1 for yearly, 4 for quarterly, 12 for monthly)
        //T = Time (in years)

        double P = 10000;
        double R = 8;
        double T = 5;
        double n = 1;

        double totalPeriods = n * T;
        double rPerPeriod = R / (n * 100);

        double amount = P;

        for (int i = 0; i <= totalPeriods; i++) {
            amount = amount + (amount * rPerPeriod);
        }
        System.out.printf("Future Investment Value = ₹%.2f\n", amount);
    }
}
