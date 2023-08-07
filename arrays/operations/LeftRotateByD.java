package arrays.operations;

import java.util.Arrays;

public class LeftRotateByD {

    // Naive implementation.
    // Time complexity: O(N).
    // Space Complexity: O(d).
    public static void leftRotate (int[] arr, int d) {
        if (d == arr.length)
            return;
        else if (d > arr.length)
            d = d % arr.length;

        int[] tempArr = new int[d];
        // copying first 'd' element to new array.
        System.arraycopy(arr, 0, tempArr, 0, d);

        // shifting all the elements by 'd'.
        for (int i=0; i<arr.length-d; i++)
            arr[i] = arr[i + d];

        int ind = 0;
        // copying tempArr elements at the end of arr.
        for (int i=arr.length-(d); i<arr.length; i++) {
            arr[i] = tempArr[ind];
            ind++;
        }
    }

    // Efficient implementation.
    // Time complexity: O(N).
    // Space Complexity: O(1).
    public static void leftRotateEfficient (int[] arr, int d) {
        int n = arr.length;
        d = d%n;

        rotate(arr, 0, d-1);
        rotate(arr, d, n-1);
        rotate(arr, 0, n-1);
    }

    public static void rotate (int[] arr, int lower, int higher) {
        while (lower < higher) {
            arr[lower] ^= arr[higher];
            arr[higher] ^= arr[lower];
            arr[lower] ^= arr[higher];

            lower++;
            higher--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14,16,18,20};
        System.out.println(Arrays.toString(arr));
        leftRotateEfficient(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
}
