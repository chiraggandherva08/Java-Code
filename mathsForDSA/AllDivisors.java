package mathsForDSA;

public class AllDivisors {

    public static void main (String[] args) {
        allDiv(7);
    }

    // Time complexity - O(sqrt(N)).
    // Space complexity - O(1).
    public static void allDiv (int n) {
        for (int i=1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i + " ");

                if (i != n/i) { // basically 'i' is not equal to the square root of N.
                    System.out.print(n/i + " " );
                }
            }
        }
    }
}
