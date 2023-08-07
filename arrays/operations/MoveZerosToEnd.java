package arrays.operations;
import java.util.Arrays;

public class MoveZerosToEnd {

    // Naive Approach
    // Time Comp: O(N^2)
    // Space Comp: O(1)
    public static void moveZeros (int[] arr) {
        for (int i=0; i<arr.length-1; i++)
            for (int j=i; j<arr.length-1; j++)
                if (arr[j] == 0) {
                    arr[j] ^= arr[j+1];
                    arr[j+1] ^= arr[j];
                    arr[j] ^= arr[j+1];
                }
    }

    // Efficient Approach
    // Time Comp: O(N)
    // Space Comp: O(1)
    public static void moveZerosToEnd (int[] arr) {
        int index = 0;
        for (int i=0; i<arr.length; i++)
            if (arr[i] != 0) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;

                index++;
            }
    }

    public static void main(String[] args) {
        int[] arr = {8, 0, 0, 0, 100, 0, 0, 0, 10, 0, 20};
        System.out.println(Arrays.toString(arr));
        moveZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}
