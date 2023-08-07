package arrays.problems;

public class SortedAndRotated {

    // Time complexity: O(N).
    // Space complexity: O(1).
    public static boolean checkRotatedAndSorted (int[] nums) {
        int n = nums.length;

        boolean ascending = true;
        if (nums[0] < nums[n-1]) {
            ascending = false;
        }
        else {
            int count = 0;

            for (int i=0; i < n-1; i++) {
                if (nums[i] > nums[i+1]) {
                    count++;
                } if (count > 1) {
                    ascending = false;
                    break;
                }
            }
        }

        boolean descending = true;
        if (nums[0] > nums[n-1]) {
            descending = false;
        }
        else {
            int count = 0;

            for (int i=0; i < n-1; i++) {
                if (nums[i] < nums[i+1]) {
                    count++;
                } if (count > 1) {
                    descending = false;
                    break;
                }
            }
        }
        return descending || ascending;
    }

    public static void main(String[] args) {
        int[] nums = {10, 25, 20, 14};
        System.out.println(
                checkRotatedAndSorted(nums)
        );
    }
}
