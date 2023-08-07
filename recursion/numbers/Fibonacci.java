package recursion.numbers;

public class Fibonacci {
    public static long[] dp = new long[1000];

    public static long fibonacci(int N) {
        if (N == 1 || N == 2)
            return N - 1;

        if (dp[N - 1] != 0)
            return dp[N - 1];
        else {
            long OP = fibonacci(N - 1) + fibonacci(N - 2);
            dp[N - 1] = OP;
            return OP;
        }
    }
    public static void main (String[]args){
        System.out.println(
                fibonacci(1000)
        );
    }
}
