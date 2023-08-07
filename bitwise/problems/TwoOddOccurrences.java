package bitwise.problems;

public class TwoOddOccurrences {

    public static void twoOddOccurrences (int[] nums) {
        int firstNUm = 0, secondNum = 0, ans = nums[0];

        for (int i = 1; i < nums.length; i++)
            ans ^= nums[i];

        int lastBit = (ans)&(-ans);

        for (int num : nums)
            if ((num & lastBit) != 0)
                firstNUm ^= num;
            else
                secondNum ^= num;

        System.out.println(firstNUm + ", " + secondNum);
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 4, 4, 4, 5, 5, 7};
        twoOddOccurrences(nums);
    }
}
