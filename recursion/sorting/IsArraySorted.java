package recursion.sorting;

public class IsArraySorted {

    public static boolean isArraySorted(int[] array, int lower, int upper) {

        if (upper == 1)
            return true;
        else if (lower == upper-1)
            return array[lower] <= array[upper];

        int mid = (lower + upper)/2;
        return isArraySorted(array, lower, mid) && isArraySorted(array, mid, upper);
    }

    public static void main(String[] args) {
        int[] array = {10, 11, 23, 32, 45, 66, 77, 88, 100};
        isArraySorted(array, 0, array.length-1);
    }
}
