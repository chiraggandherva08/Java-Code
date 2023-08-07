package recursion.sorting;

public class BubbleSort {

    public static void
    bubbleSort(int[] array, int i, int j) {
        if (j == 0 || j == 1)
            return;

        if (i == j) {
            bubbleSort(array, 0, j-1);
            return;
        }

        if (array[i] > array[i+1]) {
            int temp = array[i];
            array[i] = array[i+1];
            array[i+1] = temp;
        }

        bubbleSort(array, i+1, j);
    }

    public static void main(String[] args) {
        int[] array = { 10, 0, 10, 8, 9, 3, 100, -100, 68 };
        bubbleSort(array, 0, array.length-1);
    }
}
