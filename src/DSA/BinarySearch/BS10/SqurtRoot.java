package DSA.BinarySearch.BS10;

public class SqurtRoot {
    public static void main(String[] args) {
        System.out.println(squrtRoot(1000));

    }

    static long squrtRoot(long n){
        long low = 1;
        long high = n;
        long ans = 1;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if ((mid * mid) <= n) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }
}
