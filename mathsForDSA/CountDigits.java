package mathsForDSA;

import java.util.Scanner;

public class CountDigits {

    // using O(1) time complexity.
    public static int countDigits (int n) {
        n = Math.abs(n);
        if (n == 0) return 0;
        return (int)Math.log10(n) + 1;
    }

    // using O(D) or O(log10(N)) time complexity
    // Here D is the number of digits and N is the integer.
    public static int countDigits2 (int n) {
        int d = 0;
        while (n != 0) {
            n = n/10;
            d++;
        }
        return d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(
                countDigits(n)
        );

        System.out.println(
                countDigits2(n)
        );
    }
}
