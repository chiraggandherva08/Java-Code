package binarySearch.problems;

public class FloorSorted {

    public static void main(String[] args) {
        int[] nums = {1, 2, 8, 10, 11, 12, 19};
        System.out.println(
                floorSorted(nums, 5)
        );
    }

    public static int floorSorted (int[] nums, int num) {
        int low = 0, high = nums.length-1;

        while (low <= high) {
            int mid = (low + high)/2;

            if (num == nums[mid]) {
                return mid;
            } else if (num < nums[mid]) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return low-1;
    }
}
