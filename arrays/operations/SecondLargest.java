package arrays.operations;
import java.util.Arrays;

public class SecondLargest {

    // Time Complexity: O(2*N) = O(N).
    // Aux space complexity: O(1).
    public static int secondLargest (int[] array) {
        if (array.length == 0)
            return -1;

        int maxVal = array[LargestElement.indexLargest(array)];
        int secMaxIndex = -1;
        int secMaxVal = Integer.MIN_VALUE;

        for (int i=0; i<array.length; i++) {
            if (array[i] == maxVal) {
                continue;
            }
            if (array[i] > secMaxVal) {
                secMaxIndex = i;
                secMaxVal = array[i];
            }
        }
        return secMaxIndex;
    }

    public static int efficientSol (int[] array) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int maxi1 = -1, maxi2 = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max1) {
                max1 = array[i];
                maxi1 = i;
            }
            if (max2 < array[i] && array[i] < max1) {
                max2 = array[i];
                maxi2 = i;
            }
        }
        return maxi2;
    }

    public static void main(String[] args) {
        int[] arr = {10, 10, 10, 9, 10, 8, 11, 100}; // ans: index: 4, val: 1000

        System.out.println(
                secondLargest(arr)
        );

        System.out.println(
                efficientSol(arr)
        );
    }
}
