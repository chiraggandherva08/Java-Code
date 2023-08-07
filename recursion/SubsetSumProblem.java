package recursion;

import java.util.ArrayList;

public class SubsetSumProblem {

    public static int count = 0;

    public static
    int calc_sum(ArrayList<Integer> subset) {
        int sum = 0;

        for (Integer integer : subset) {
            sum += integer;
        }

        return sum;
    }

    public static
    void subset_With_Sum_N(int[] arr, ArrayList<Integer> subset, int index, int sum) {
        if (index == arr.length) {
            if (calc_sum(subset) == sum) count++;
            return;
        }

        subset_With_Sum_N(arr, new ArrayList<>(subset), index+1, sum);

        subset.add(arr[index]);
        subset_With_Sum_N(arr, new ArrayList<>(subset), index+1, sum);
    }

    public static
    void main(String[] args) {
        int[] arr = { 10, 5, 2, 3, 6 };

        subset_With_Sum_N(arr, new ArrayList<>(), 0, 8);
        System.out.println(count);
    }
}
