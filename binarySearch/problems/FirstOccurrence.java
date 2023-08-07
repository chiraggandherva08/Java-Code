package binarySearch.problems;

public class FirstOccurrence {
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 10, 10, 10, 10, 10, 14, 16, 91, 111};
        System.out.println(
                firstOccurrence(nums, 10) // index: 4
        );
    }

    // Iterative
    public static int firstOccurrence(int[] targetArr, int targetNum){
        int low = 0, high = targetArr.length-1;

        while (low <= high){
            int mid = (low + high)/2;

            if (targetNum == targetArr[mid]) {
                if (mid == 0 || targetNum != targetArr[mid-1]) {
                    return mid;
                }
                high = mid-1;
            } else if (targetNum < targetArr[mid]) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return -1;
    }

    // Recursive
//    public static int firstOccurrenceRec(int[] targetArr, int targetNum, int low, int high){
//        int mid = (low + high)/2;
//
//        if (targetNum == targetArr[mid]) {
//            if (targetNum != targetArr[mid-1]) {
//                return mid;
//            }
//        }
//    }
}
