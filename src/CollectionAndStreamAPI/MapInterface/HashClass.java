package CollectionAndStreamAPI.MapInterface;

public class HashClass {
    public static void main(String[] args) {
        System.out.println((int) simpleHash("ABC"));
        System.out.println((int) simpleHash("CBA"));
    }

    public static int simpleHash(String key) {
        int sum = 0;
        for (char c : key.toCharArray()) {
            sum += (int) c;
        }
        return sum % 10;
    }
}

