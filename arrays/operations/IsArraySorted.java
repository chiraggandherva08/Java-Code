package arrays.operations;

public class IsArraySorted {

    // Time complexity: O(N)
    // Space complexity: O(1)
    public static boolean isArraySorted (int[] nums) {
        for (int i=0; i<nums.length-1; i++)
            if (nums[i+1] < nums[i])
                return false;
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(
                isArraySorted(nums)
        );
    }
}
