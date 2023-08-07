package bitwise.problems;

public class Nth_Bit_Is_Set {

    // right shifting n
    public static boolean nthBitIsSet (int n, int k) {
        n = n >> (k-1);
        return (n & 1) == 1;
    }

    // left shifting k
    public static boolean nthBitIsSet_ (int n, int k) {
        k = k << (k-1);
        return (n & k) == k;
    }

    public static void main(String[] args) {
        System.out.println(
                nthBitIsSet(7, 1)
        );
        System.out.println(
                nthBitIsSet_(7, 1)
        );
    }
}
