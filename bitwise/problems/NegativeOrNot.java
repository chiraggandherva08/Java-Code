package bitwise.problems;

public class NegativeOrNot {

    // Time Complexity: O(1).
    // Space Complexity: O(1).
    public static boolean negOrNot (int num) {
        return ((num >> 31)&1) == 1;
    }

    public static void main(String[] args) {
        System.out.println(
                negOrNot(-11110)
        );
    }
}
