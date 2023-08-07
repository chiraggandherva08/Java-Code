package mathsForDSA;

public class IsPrime {

    // Time complexity: O(N^1/2)
    // Space complexity: O(1)
    public static boolean isPrime (int num) {
        if (num == 1)
            return false;

        for (int i = 2; i <= Math.sqrt(num); i += 1)
            if (num%i == 0) return false;
        return true;
    }

    // Time complexity: O(N)
    // Space complexity: O(1)
//    public static boolean isPrime (int num) {
//        if (num == 1)
//            return false;
//        if (num == 2 || num == 3)
//            return true;
//        if (num%2 == 0 || num%3 == 0)
//            return false;
//
//        for (int i = 5; i <= Math.sqrt(num); i = i + 6)
//            if (num%i == 0 || num%(i+2) == 0) return false;
//        return true;
//    }

    public static void main(String[] args) {
        System.out.println(
                isPrime(25)
        );
    }
}