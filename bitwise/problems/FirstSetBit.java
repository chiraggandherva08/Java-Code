package bitwise.problems;

public class FirstSetBit {

    public static int firstSetBit (int n) {
        int index = 1;

        while (index < 32) {
            if ((n & 1) == 1) {
                return index;
            }
            index++;
            n = n >> 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(
                firstSetBit(33140)
                // 1000000101110100
        );
    }
}
