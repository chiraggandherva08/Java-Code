package arrays.problems;
import java.util.ArrayList;

public class ReverseArrayInGroups {

    public static void reverse (ArrayList<Integer> arr, int low, int high) {
        while (low < high) {
            int temp = arr.get(low);
            arr.set(low, arr.get(high));
            arr.set(high, temp);

            low++;
            high--;
        }
    }

    static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        int index = 0;

        for (int i = 0; i < n - k; i += k) {
            reverse(arr, index, index + (k-1));
            index += k;
        }

        System.out.println(index);
        reverse(arr, index, arr.size()-1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        arr.add(11);

        reverseInGroups(arr, arr.size(), 3);

        System.out.println(arr);
    }
}
