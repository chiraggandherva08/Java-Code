package arrays.problems;

public class FrequenciesInSortedArray {

    public static void frequencies (int[] arr) {

        int count = 1;
        int currentElement;
        for (int i = 0; i < arr.length-1; i++) {
            currentElement = arr[i];

            if (currentElement == arr[i+1]) {
                count++;
            } else {
                System.out.println("item : " + currentElement + ", freq : " + count);
                count = 1;
            }
        }
        currentElement = arr[arr.length-1];
        System.out.println("item : " + currentElement + ", freq : " + count);
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1, 1, 1, 10, 20, 30, 30, 40, 40, 40};
        frequencies(nums);
    }
}
