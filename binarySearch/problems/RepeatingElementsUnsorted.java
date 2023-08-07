package binarySearch.problems;

public class RepeatingElementsUnsorted {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 4, 6, 5, 7, 3};
        System.out.println(findRepeating(nums));
    }

    public static int findRepeating(int[] nums) {
        int slow_ptr = nums[0], fast_ptr;

        while (true) {
            slow_ptr = nums[slow_ptr];
            fast_ptr = nums[slow_ptr];

            if (slow_ptr == fast_ptr) {
                break;
            }

            System.out.println(
                    "Slow: " + nums[slow_ptr] + " Fast: " + nums[fast_ptr]
            );
        }

        return nums[slow_ptr];
    }
}
