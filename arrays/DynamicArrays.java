package arrays;

import java.util.ArrayList;

public class DynamicArrays {

    public static void main(String[] args) {
        ArrayList<Integer> lst1 = new ArrayList<>();

        ArrayList<Integer> lst2 = new ArrayList<>(lst1);

        lst1.add(133322);
        System.out.println(lst1 + " , " + lst2);
    }
}
