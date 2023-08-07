package binarySearch.problems;

public class SqrtRootFloor {
    public static void main(String[] args) {
        System.out.println(
                sqrtFloor(2)
        );
    }

    public static int sqrtFloor(int num) {
        int low = 0, high = num;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high)/2;
            int sqrt = mid * mid;

            if (sqrt == num) {
                return mid;
            } else if (sqrt < num) {
                low = mid+1;
            } else {
                high = mid-1;
                ans = mid;
            }
        }
        return ans-1;
    }
}
