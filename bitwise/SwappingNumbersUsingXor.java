package bitwise;

public class SwappingNumbersUsingXor {

    public static void main(String[] args) {
        long num1 = 5122;
        long num2 = 2215;

        // These three steps can swap two numbers.
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;

        System.out.println(num1 + ", " + num2);
    }
}
