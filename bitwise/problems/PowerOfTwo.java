package bitwise.problems;

import java.util.Scanner;

public class PowerOfTwo {

    // Time Complexity: O(1).
    // Space Complexity: O(1).
    public static boolean isPowerOfTwo (int num) {
        if (num == 0)
            return false;
        return ((num - 1) & num) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(
                isPowerOfTwo(num)
        );
    }
}
