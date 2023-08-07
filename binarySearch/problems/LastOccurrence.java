package binarySearch.problems;

public class LastOccurrence {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 10, 10, 10, 10, 10, 14, 16, 91, 111};
        System.out.println(
                lastOccurrence(nums, 10) // 8
        );
    }

    public static int lastOccurrence(int[] nums, int num) {
        int low = 0, high = nums.length-1;

        while (low <= high) {
            int mid = (low+high)/2;

            if (nums[mid] == num) {
                if (mid == nums.length-1 || nums[mid+1] != num)
                    return mid;
                low = mid+1;
            } else if (num < nums[mid])
                high = mid-1;
            else
                low = mid+1;
        }
        return -1;
    }
}