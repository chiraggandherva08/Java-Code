package arrays.operations;

public class LargestElement {

    // Time complexity: O(N).
    public static int indexLargest (int[] array) {
        int index = -1, valueMax = Integer.MIN_VALUE;

        for (int i=0; i<array.length; i++)
            if (array[i] > valueMax) {
                valueMax = array[i];
                index = i;
            }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {}; // ans: 2
//        int[] arr = {10, 5, 20, 8, 1000, 1, 2, 3, 4, 5, 1011}; // ans: 2
        System.out.println(
                indexLargest(arr)
        );
    }
}
