package arrays;

import java.util.Arrays;

public class OperationsOnArrays {

    // Insertion
    public static void insert (int[] arr, int value, int index) throws Exception {
        int cap = arr.length-2;

        if (cap > arr.length-1 || index >= arr.length-1) {
            throw new Exception("Cannot add beyond the last index!");
        }

        for (int i = cap; i >= index; i--) {
            arr[i+1] = arr[i];
        }
        arr[index] = value;
    }

    public static void main(String[] args) throws Exception {
        int[] arr = {1, 2, 3, 4, 0, 0, 0, 0, 0};

        System.out.println(Arrays.toString(arr));
        insert(arr, 10, 1);
        System.out.println(Arrays.toString(arr));
    }
}
