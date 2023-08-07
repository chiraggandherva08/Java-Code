package mathsForDSA;

public class PalindromeNumber {

    // Time complexity: O(log10(N)).
    public static boolean isPalindromeNumber (int n) {
        int newN = 0;
        int N = n;

        while (n != 0) {
            int digit = n%10;
            newN = newN*10 + digit;
            n = n/10;
        }
        return newN == N;
    }

    public static void main(String[] args) {
        System.out.println(
                 isPalindromeNumber(10)
        );
    }
}