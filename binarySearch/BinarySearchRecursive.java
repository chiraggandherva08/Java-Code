package binarySearch;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] nums = {1, 4, 4, 10, 11, 18, 20, 23, 38, 45, 45, 45, 67, 68, 92};
        System.out.println(binarySearchRecur(nums, 45, 0, nums.length-1)); // index: 8
        System.out.println(binarySearchRecur(nums, 450, 0, nums.length-1)); // index: -1
    }

    // Time complexity: O(log(N)).
    // Aux space: O(log(N)).
    public static int binarySearchRecur (int[] nums, int num, int low, int high) {
        int mid = (low + high)/2;

        if (low > high)
            return -1;
        if (num == nums[mid])
            return mid;
        else if (num < nums[mid])
            return binarySearchRecur(nums, num, low, mid-1);
        else
            return binarySearchRecur(nums, num, mid+1, high);
    }
}
