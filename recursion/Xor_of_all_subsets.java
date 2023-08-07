package recursion;

import java.util.ArrayList;

public class Xor_of_all_subsets {
    public static int sum = 0;

    public static int subsetXORSum(int[] nums) {
        subsets(nums, new ArrayList<>(), 0);
        return sum;
    }

    public static void xor(ArrayList<Integer> subset) {
        int xor_sum = 0;
        for(Integer i: subset)
            xor_sum ^= i;

        sum += xor_sum;
    }

    public static void subsets(int[] nums, ArrayList<Integer> subset, int index) {
        if(index == nums.length) {
            System.out.println(subset);
            xor(subset);
            return;
        }
        subsets(nums, new ArrayList<>(subset), index+1);
        subset.add(nums[index]);
        subsets(nums, new ArrayList<>(subset), index+1);
    }

    public static void main(String[] args) {
        System.out.println(
                subsetXORSum(new int[] {5, 1, 6})
        );
    }
}
