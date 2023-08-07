package mathsForDSA;

public class LowestCommonMultiple {

    // Time Complexity : O(a*b - max(a, b))
    // Space Complexity : O(1)
    public static int lcm (int a, int b) {
        if (a % b == 0 || b % a == 0) {
            return Math.max(a, b);
        }
        int lcm_ = 0;
        for (int i = Math.max(a, b); i <= a*b; i++) {
            if (i%a == 0 && i%b == 0) {
                lcm_ = i;
                break;
            }
        } return lcm_;
    }

    // optimised solution
    // using formula - a*b = gcd(a,b) * lcm(a,b)
    // Time complexity - O(log(min(a,b)))
    // Space complexity - O(log(min(a,b)))
    public static int optimisedLCM (int a, int b) {
        int gcd = GreatestCommonDivisor.gcd(a, b);
        return a*b/(gcd);
    }

    public static void main(String[] args) {
        System.out.println(
                optimisedLCM(7, 3)
        );
    }
}
