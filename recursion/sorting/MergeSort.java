package recursion.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void merge(int[] nums, int start, int end) {
        int mid = (start + end)/2;

        int len_1 = mid - start + 1;
        int len_2 = end - mid;

        int[] arr_1 = new int[len_1];
        int[] arr_2 = new int[len_2];

        int arr_pointer = start;

        // copying values of arr from low to mid+1 in first array.
        for(int o = 0; o < len_1; o++) {
            arr_1[o] = nums[arr_pointer++];
        }

        // copying values of arr from low to mid+1 in second array.
        arr_pointer = mid + 1;
        for(int o = 0; o < len_2; o++) {
            arr_2[o] = nums[arr_pointer++];
        }

        int pointer_1 = 0;
        int pointer_2 = 0;
        arr_pointer = start;

        while (pointer_1 < len_1 && pointer_2 < len_2) {
            if (arr_1[pointer_1] < arr_2[pointer_2]) {
                nums[arr_pointer++] = arr_1[pointer_1++];
            }
            else {
                nums[arr_pointer++] = arr_2[pointer_2++];
            }
        }

        // if first_arr is larger than second_arr
        while (pointer_1 < len_1) {
            nums[arr_pointer++] = arr_1[pointer_1++];
        }

        // if second_arr is larger than first_arr
        while (pointer_2 < len_2) {
            nums[arr_pointer++] = arr_2[pointer_2++];
        }
    }

    // Time complexity: O(N logN)
    // Space complexity: O(N)
    public static void mergeSort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end)/2;

        mergeSort(nums, start, mid); // sort left part.
        mergeSort(nums, mid+1, end); // sort right part.

        merge(nums, start, end); // merge sorted arrays.
    }

    public static void main(String[] args) {
        int[] nums = { 3111, 7, 0, 1, 5, 8, 3, 2, 34, 66, 87, 23, 12, 12, 12 };
        mergeSort(nums, 0, nums.length-1);

        System.out.println(
                Arrays.toString(nums)
        );
    }
}
