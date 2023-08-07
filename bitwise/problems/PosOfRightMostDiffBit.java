package bitwise.problems;

public class PosOfRightMostDiffBit {

    public static int posOfRightMostDiffBit(int m, int n) {
        int index = 1;

        while (index < 32) {
            if ((m&1) != (n&1)) {
                return index;
            }
            index++;
            m = m >> 1;
            n = n >> 1;
        }
        return 32;
    }

    public static void main(String[] args) {
        System.out.println(
                posOfRightMostDiffBit(11, 9)
        );
        System.out.println(
                posOfRightMostDiffBit(52, 4)
        );
    }
}
