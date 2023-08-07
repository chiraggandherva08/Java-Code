package arrays.operations;

import java.util.Arrays;

public class RotateArray {


    // Time complexity: O(N)
    // Space complexity: O(1)
    public static void leftRotate (int[] arr) {
        int newLastElem = arr[0];
        for (int i=0; i<arr.length-1; i++)
            arr[i] = arr[i+1];
        arr[arr.length-1] = newLastElem;
    }

    // Time complexity: O(N)
    // Space complexity: O(1)
    public static void rightRotate (int[] arr) {
        int newFirstElem = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--)
            arr[i] = arr[i - 1];
        arr[0] = newFirstElem;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 31, 19, 61, 7, 39};
        System.out.println(Arrays.toString(arr));
        rightRotate(arr);
        System.out.println(Arrays.toString(arr));
    }
}
