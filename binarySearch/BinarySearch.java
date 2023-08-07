package binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1, 4, 4, 10, 11, 18, 20, 23, 38, 45, 45, 45, 67, 68, 92};
        System.out.println(binarySearch(nums, 45)); // index: 8
        System.out.println(binarySearch(nums, 450)); // index: -1
    }

    // Time Complexity: O(lon(N)).
    // Aux space: O(1).
    public static int binarySearch (int[] nums, int num) {
        int low = 0, high = nums.length-1;

        while (low <= high) {
            int mid = (low + high)/2;

	    if (nums[mid] == num)
                return mid;
            else if (nums[mid] < num)
                low = mid + 1;
            else
                high = mid-1;
        }
        return -1;
    }
}
