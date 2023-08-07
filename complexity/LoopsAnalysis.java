package complexity;

public class LoopsAnalysis {
    public static void loops (int n, int c) {
        // loops 1 will execute with a time complexity of n/c times.
        for (int i = 1; i < n; i += c) {
            System.out.println(i);
        }
        // loops 2 will execute with a time complexity of log c(n) times.
        for (int i = 1; i < n; i *= c) {
            System.out.println(i);
        }
        // loops 3 will execute with a time complexity of log(log(n)) times
        for (int i = 2; i < n; i = (int) Math.pow(i, c)) {
            System.out.println(i);
        }
    }

    public static void main (String[] args) {
        loops(100, 2);
    }
}