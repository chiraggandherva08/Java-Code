package recursion;

public class Josephus {

    public static int josephus(int N, int K) {
        if (N == 1)
            return 0;

        return (josephus(N-1, K) + K) % N;
    }

    public static void main(String[] args) {
        System.out.println(
                josephus(50, 3) + 1
        );
    }
}
