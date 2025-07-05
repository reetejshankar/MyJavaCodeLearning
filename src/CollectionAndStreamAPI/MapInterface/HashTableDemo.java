package CollectionAndStreamAPI.MapInterface;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {

        @SuppressWarnings("")
        Hashtable<Integer, String> hashTable = new Hashtable<>();
        // hashtable is synchronized
        // no null key or value
        // legacy class, ConcurrentHashMap
        // Slowe than hashMap

        hashTable.put(1, "Apple");
        hashTable.put(2, "Banana");
        hashTable.put(3, "Cherry");
        System.out.println(hashTable);
        System.out.println("Value for key 2: " + hashTable.get(2));
        System.out.println("Does key 3 exits? " + hashTable.containsKey(3));
        hashTable.remove(1);
        System.out.println("After removing key 1: " + hashTable);

        // hashTable.put(null, "value"); // Throws exception
        // hashTable.put(4, null); // Throws exception

        System.out.println("----------------");

        HashMap<Integer, String> map = new HashMap<>();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map.put(i, "Thread1");
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                map.put(i, "Thread2");
            }
        });
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            // e.printStackTrace();
        }
        System.out.println("Final size of HashMap: " + map.size());

    }
}
