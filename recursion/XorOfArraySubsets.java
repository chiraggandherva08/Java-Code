package recursion;

import java.util.ArrayList;

public class XorOfArraySubsets {

    public static int sum_ = 0;

    public static int subsetXORSum(int[] nums) {
        return subsets(nums, 0, new ArrayList<>());
    }

    public static int xor_(ArrayList<Integer> subset) {
        int sum = 0;

        for(Integer elm: subset)
            sum ^=  elm;

        return sum;
    }

    public static int subsets(int[] arr, int index, ArrayList<Integer> subset) {
        if (index == arr.length) {
            return sum_;
        }

        subsets(arr, index+1, new ArrayList<>(subset));
        subset.add(arr[index]);

        sum_ += xor_(subset);
        return subsets(arr, index+1, new ArrayList<>(subset));
    }

    public static void main(String[] args) {
        int[] array = {5, 1, 6};
        System.out.println(
                subsetXORSum(array)
        );
    }
}
