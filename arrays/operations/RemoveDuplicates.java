package arrays.operations;

import java.util.Arrays;

public class RemoveDuplicates {

    // Naive Approach.
    // Time comp: O(N).
    // Space comp: O(N).
    public static void removeDuplicates (int[] nums) {
        int len = nums.length;
        int[] newNums = new int[len];

        int prevElem = nums[0];
        newNums[0] = prevElem;

        int index = 1 ;

        for (int i=1; i<len; i++) {
            int currElem = nums[i];

            if (currElem != prevElem) {
                newNums[index] = nums[i];
                prevElem = nums[i];
                index++;
            }
        }
        System.arraycopy(newNums, 0, nums, 0, len);
    }

    // Naive Approach.
    // Time comp: O(N).
    // Space comp: O(1).
    public static int rmvDup (int[] arr) {

        int prevDistinctElem = arr[0];
        int index = 1;

        for (int i=1; i<arr.length; i++) {
            if (arr[i] != prevDistinctElem) {
                arr[index] = arr[i];
                prevDistinctElem = arr[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 2, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(nums));
        System.out.println(rmvDup(nums));
        System.out.println(Arrays.toString(nums));
    }
}
