package binarySearch;

public class TernarySearch {
    /*  Ternary Search is a Divide and Conquer Algorithm used to perform search operation in a sorted array. This algorithm is similar to the Binary Search algorithm but rather than dividing the array into two parts, it divides the array into three equal parts.
        In this algorithm, the given array is divided into three parts and the key (element to be searched) is compared to find the part in which it lies and that part is further divided into three parts.
        We can divide the array into three parts by taking mid1 and mid2 which can be calculated as shown below. Initially, l and r will be equal to 0 and N-1 respectively, where N is the length of the array. */

    public static void main(String[] args) {
    }

    public static int ternarySearch(int num, int[] nums) {
        int l = 0;
        int r = nums.length-1;

        while (r >= l) {
            int mid1 = l + (r - l) / 3;
            int mid2 = r - (r - l) / 3;

            if (nums[mid1] == num) {
                return mid1;
            } if (nums[mid2] == num) {
                return mid2;
            }

            if (num < nums[mid1]) {
                r = mid1 - 1;
            } else if (num > nums[mid2]) {
                l = mid2 + 1;
            } else {
                l = mid1 + 1;
                r = mid2 - 1;
            }
        }
        return -1;
    }
}
