package recursion.sorting;

import java.util.Arrays;

public class QuickSort {

    public static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static int partition(int[] arr, int start, int end) {
        int count = 0;

        for(int o = start; o <= end; o++) {
            if (arr[o] < arr[start]) {
                count++;
            }
        }

        int pivotIndex = start + count;
        int pivot = arr[start];
        swap(arr, start, pivotIndex);

        int start_pointer = start;
        int end_pointer = end;

        while (start_pointer < pivotIndex && pivotIndex < end_pointer) {

            if (arr[start_pointer] <= pivot) {
                start_pointer++;
            }
            else if (pivot <= arr[end_pointer]) {
                end_pointer--;
            }
            else if (arr[start_pointer] > arr[pivotIndex]) {
                swap(arr, start_pointer++, end_pointer--);
            }
        }
        return pivotIndex;
    }

    // TC : O(N logN)
    // TC : O(N logN)
    public static void quickSort (int[] arr, int start, int end) {
        if (start >= end)
            return;

        // part the array in two parts.
        int pivotIndex = partition(arr, start, end);

        quickSort(arr, start, pivotIndex-1);
        quickSort(arr, pivotIndex+1, end);
    }

    public static void main(String[] args) {
        int[] arr = { -100, 12, 1, 4, 100, 87, 121, 0, -12, 0, 1, 1, 4 };
        quickSort(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
}
