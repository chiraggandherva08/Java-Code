package arrays.operations;

import java.util.Arrays;

public class ReverseAnArray {

    // Time Complexity: O(N)
    // Aux space Complexity: O(1)
    public static void reverseAnArray(int[] nums) {
        int N = nums.length;

        for (int i=0; i<N/2; i++) {
            nums[i] ^= nums[N - (1+i)];
            nums[N - (1+i)] ^= nums[i];
            nums[i] ^= nums[N - (1+i)];
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 3};
        System.out.println(Arrays.toString(arr));
        reverseAnArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
