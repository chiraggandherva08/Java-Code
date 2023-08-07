package recursion;

public class ClimbStairs {

    public static int climbStairs(int n) {
        if (n == 1 || n == 2)
            return n;

        return climbStairs(n-1) + climbStairs(n-2);
    }

    public static void main(String[] args) {
        System.out.println(
                climbStairs(5)
        );
    }
}
