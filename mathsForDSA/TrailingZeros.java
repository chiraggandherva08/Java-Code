package mathsForDSA;

public class TrailingZeros {

    // Time complexity: O(D).
    // Space complexity//; O(1)

    public static int trailingZeros (int n) {
        if (n < 0) return -1; // Negative Number Edge Case

        int count = 0;

        // Keep dividing n by powers
        // of 5 and update count
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(
                trailingZeros(1000000)
        );
    }
}
