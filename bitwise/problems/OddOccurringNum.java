package bitwise.problems;

public class OddOccurringNum {

    // Time Complexity; O(N)
    // Space Complexity; O(1)
    public static int OddOccurrences(int[] nums) {
        int ans = nums[0];

        for (int i=1; i<nums.length; i++)
            ans ^= nums[i];

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 4, 4, 4, 5, 5};
        System.out.println(
                OddOccurrences(nums)
        );
    }
}
