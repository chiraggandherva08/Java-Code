package binarySearch.problems;

public class Count_1s_Sorted_Binary_Array {
    public static void main(String[] args) {
        int[] binaryArr = {};
        System.out.println(
                countOnesDecreasingOrder(binaryArr) // 8
        );
    }

    public static int countOnes(int[] nums) {
        int low = 0, high = nums.length-1;

        while (low <= high) {
            int mid = (low + high)/2;

            if (nums[mid] == 1) {
                if (mid == 0) {
                    return nums.length;
                }
                else if (nums[mid-1] != 1) {
                    return nums.length - mid;
                }
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return -1;
    }

    public static int countOnesDecreasingOrder (int[] nums) {
        int low = 0;
        int high = nums.length-1;

        if (nums.length == 0 || nums[0] == 0) return 0;
        if (nums[high] == 1) return nums.length;

        while (low <= high) {
            int mid = (low + high)/2;

            if (nums[mid] == 0) {
                if (nums[mid-1] != 0) {
                    return mid;
                }
                high = mid-1;
            } else if (nums[mid] == 1) {
                low = mid + 1;
            }
        }
        return 0;
    }
}
