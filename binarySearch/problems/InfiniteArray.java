package binarySearch.problems;
/*  It is also known as unbounded binary search.  */
public class InfiniteArray {

    public static void main(String[] args) {
        int[] nums = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};
        System.out.println(
                searchInInfiniteSortedArray(nums, 17)
        );
    }

    public static int searchInInfiniteSortedArray (int[] nums, int num) {
        int lower = 0;
        int higher = 1;

        while (lower <= higher) {
            int mid = (lower + higher)/2;

            if (num < nums[higher]) {
                if (num == nums[mid]) { return mid; }
                else if (num < nums[mid]) { higher = mid-1; }
                else { lower = mid+1; }
            } else { higher += higher; }
        }
        return -1;
    }
}
