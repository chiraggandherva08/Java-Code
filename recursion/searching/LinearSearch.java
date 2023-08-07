package recursion.searching;

public class LinearSearch {

    // linear search.
    public static int lSearch(int[] tArr, int tNum, int index, int size) {
        if (index >= size) {
            return -1;
        }
        else if (tArr[index] == tNum) {
            return index;
        }

        return lSearch(tArr, tNum, index+1, size);
    }

    public static void main(String[] args) {
        int[] tArr = {10, 11, 23, 32, 45, 66, 77, 88, 100};
        System.out.println(
                lSearch(tArr, 45, 0, tArr.length)
        );
    }
}
