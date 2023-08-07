package arrays.problems;

public class LeadersInArray {

    // Naive implementation.
    // Time Complexity: O(N square).
    // Space Complexity: O(1).
    public static void leaders (int[] nums) {
        for (int i=0; i<nums.length; i++) {
            int currentVal = nums[i];
            boolean isLeader = true;

            for (int j=i+1; j<nums.length; j++)
                if (currentVal <= nums[j]) {
                    isLeader = false;
                    break;
                }
            if (isLeader)
                System.out.print(currentVal + " ");
        }
    }

    // Efficient implementation
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    /** Traverse the array from right and update the variable
    maxVal every time when arr[i] is the new greatest element
    */
    public static void leadersEfficient (int[] nums) {
        int maxVal = Integer.MIN_VALUE;

        for (int i=nums.length - 1; i >= 0; i--) {
            if (maxVal < nums[i]) {
                maxVal = nums[i];
                System.out.print(maxVal + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {40, 30, 20, 10, 0};
        leadersEfficient(nums);
    }
}