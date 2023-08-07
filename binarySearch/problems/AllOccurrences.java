package binarySearch.problems;

public class AllOccurrences {
    public static void main(String[] args) {
        int[] nums = {10, 20, 20, 20, 30, 30, 40};
        System.out.println(
                occurrences(nums, 50) // 5
        );
    }

    public static int occurrences(int[] nums, int num){
        int start = FirstOccurrence.firstOccurrence(nums, num);

        if (start == -1) {
            return 0;
        } else {
            int end = LastOccurrence.lastOccurrence(nums, num);
            return end - start + 1;
        }
    }
}