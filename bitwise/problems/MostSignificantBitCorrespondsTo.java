package bitwise.problems;

public class MostSignificantBitCorrespondsTo {

    public static int numCorr (int num) {
        int index = 0;
        int lastOne = 0;

        while (index < 32) {
            if ((num&1) == 1) {
                lastOne = index;
            }
            num = num >> 1;
            index++;
        }
        return (int) Math.pow(2, lastOne);
    }

    public static void main(String[] args) {
        System.out.println(
                numCorr(18)
        );
    }
}
