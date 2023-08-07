package recursion.searching;

public class BinarySearch {

    // binary search
    public static int bSearch(int num, int[] array, int lower, int upper) {
        if (lower > upper)
            return -1;

        int mid = lower + (upper - lower)/2;

        if (array[mid] == num)
            return mid;
        else if (array[mid] < num)
            return bSearch(num, array, mid + 1, upper);
        else
            return bSearch(num, array, lower, mid - 1);
    }

    public static void main(String[] args) {
        int[] tArr = {10, 11, 23, 32, 45, 66, 77, 88, 100};
        System.out.println(
                bSearch(45, tArr, 0, tArr.length)
        );
    }
}
