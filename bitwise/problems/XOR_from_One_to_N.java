package bitwise.problems;

public class XOR_from_One_to_N {

    public static int xorFromOne_N (int num) {
        int ans = 1;

        for (int i = 2; i <= num; i++) {
            ans = ans^i;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(
                xorFromOne_N(7)
        );
    }
}
