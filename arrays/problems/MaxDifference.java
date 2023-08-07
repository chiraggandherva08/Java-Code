package arrays.problems;

public class MaxDifference {

    // Naive Solution.
    // Time Complexity: O(N square).
    // Space Complexity: O(1).
    public static int maxDiff (int[] arr) {
        int maxDiff = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++)
                if (arr[j] - arr[i] > maxDiff)
                    maxDiff = arr[j] - arr[i];
        }
        return maxDiff;
    }

    // Efficient solution.
    // Time Complexity: O(N).
    // Space Complexity: O(1).
    public static int maxDiff_Efficient (int[] arr) {
        int lower = 0, higher = 1;
        int maxDiff = arr[higher] - arr[lower];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > arr[higher]) {
                higher = i;
                maxDiff = arr[higher] - arr[lower];
            }
            lower = (arr[lower] > arr[i])
                    ? i : lower;
        }

        return maxDiff;
    }

    public static void main(String[] args) {
        int[] arr = {200, 3, 1001, 1, 10, 6, 4, 8};
        System.out.println(
                maxDiff_Efficient(arr)
        );
    }
}
