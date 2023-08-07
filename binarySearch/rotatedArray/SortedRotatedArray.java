package binarySearch.rotatedArray;

public class SortedRotatedArray {

    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(pivot(nums, 3));
    }

    public static int pivot(int[] nums, int num) {
        int low = 0;
        int high = nums.length-1;
        int pivot = -1;

        while (low <= high) {
            if (nums[high] > nums[low]) return high;
            else if (nums.length == 1) return 0;

            int mid = (low + high)/2;
            pivot = mid;

            if (nums[mid] > nums[mid+1]) break;
            else if (nums[mid] < nums[0]) high = mid - 1;
            else if (nums[mid] > nums[0]) low = mid + 1;
        }

        int index = binarySearch(nums, num, 0, pivot);
        if (index != -1) return index;
        else return binarySearch(nums, num, pivot+1, nums.length-1);
    }

    public static int binarySearch (int[] nums, int num, int low, int high) {
        while (low <= high) {
            int mid = (low + high)/2;


            if (nums[mid] == num) return mid;
            else if (nums[mid] < num) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }
}


