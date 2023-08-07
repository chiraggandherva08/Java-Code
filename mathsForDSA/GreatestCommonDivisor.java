package mathsForDSA;

import java.util.ArrayList;

public class GreatestCommonDivisor {

    // naive solution.
    // Time complexity: O(min(a, b)).
    // Space complexity: O(1).
    public static int gcd (int num1, int num2) {
        int greatestCommonDivisor = Math.min(num1, num2);

        for (int i = greatestCommonDivisor; i > 0; i = i-1) {
            if (num1 % i == 0 && num2 % i == 0) {
                greatestCommonDivisor = i;
                break;
            }
        }
        return greatestCommonDivisor;
    }

    // TIme complexity: O(min(a,b)).
    // Space complexity: O(min(a,b)).
    public static int euclidAlgo (int num1, int num2) {
        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        } return num1;
    }

    // Optimised solution.
    // TIme complexity: O(log(min(a,b))).
    // Space complexity: O(log(min(a,b))).
    public static int optimisedEuclidAlgo (int num1, int num2) {
        if (num2 == 0) return num1;
        else return optimisedEuclidAlgo(num2, num1 % num2);
    }

    public static void main(String[] args) {
        System.out.println(optimisedEuclidAlgo(8, 200));
    }
}
