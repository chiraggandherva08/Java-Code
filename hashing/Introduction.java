package hashing;
import java.util.HashMap;

public class Introduction {
    /**
     * hash is used to implement Dictionary and Sets.
     * Search, Insert and Delete operations in O(1) time.
     */

    public static void main(String[] args) {
        HashMap<Integer, Integer> hmp = new HashMap<>();

        // adding => .put(key, value);
        hmp.put(10, 100);

        // getting value via key (if present returns value otherwise returns null);
        System.out.println(hmp.get(10));
    }

    public static void add(HashMap<Integer, Integer> hmp, int key, int value) {
        hmp.put(key, value);
    }
}