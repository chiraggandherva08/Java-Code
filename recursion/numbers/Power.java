package recursion.numbers;

public class Power {
    // TC: O(N)
    public static int power_withN(int exponent, int power) {
        if (exponent == 0)
            return 0;
        else if (power == 0)
            return 1;

        return exponent * power_withN(exponent, power - 1);
    }

    // TC: O(log N)
    public static int power_withLogN(int exponent, int power) {
        if (power == 0)
            return 1;

        int pow = power_withLogN(exponent, power / 2);

        if (power % 2 == 0)
            return pow * pow;
        else
            return exponent * pow * pow;
    }

    public static void main(String[] args){
        System.out.println(
                power_withN(3, 11)  + ", " + power_withLogN(3, 11)
        );
    }
}
