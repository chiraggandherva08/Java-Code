package complexity;

public class TimeComplexity {

    // constant time complexity.
    // constant order of growth.
    public static int sum1 (int num) {
        return num*(num+1)/2;
    }

    // n time complexity.
    // linear order of growth.
    public static int sum2 (int num) {
        int sum = 0;
        for (int i=1; i<=num; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        // function 1 to compute the sum have O(c) time complexity.
        System.out.println(sum1(100));
        // function 2 to compute the sum have O(n) time complexity.
        System.out.println(sum2(100));
    }
}