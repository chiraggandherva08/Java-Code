package recursion;

public class RopeCutting {

    public static int cutRope(int n, int a, int b, int c, int count) {
        if (n < 0)
            return -1;

        if (n == 0)
            return count;

        int max1 = Math.max(cutRope(n-a, a, b, c, count+1), cutRope(n-b, a, b, c, count+1));
        return  Math.max(max1, cutRope(n-c, a, b, c, count+1));
    }

    public static void main(String[] args) {
        System.out.println(
                cutRope(9, 2, 2, 2, 0)
        );
    }
}
