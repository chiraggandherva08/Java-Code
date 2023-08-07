package mathsForDSA;

public class PrimeFactors {

    public static void primeFactors (int num) {
        if (IsPrime.isPrime(num) || num == 1) { // Time comp : O(1)
            System.out.println(num);
            return;
        }

        int count = 1;

        for (int i = 2; i <= Math.sqrt(num); i++) // Time comp : O(sqrt(N))
            if (IsPrime.isPrime(i)) // Time comp : O(sqrt(N))
                while (num%i == 0) { // Time comp : O(log(N))
                    System.out.print(i + " ");
                    num = num/i;
                    count++;
                }

        System.out.println("The num of factors is: " + count);
        System.out.print(num);
    }

    public static void main(String[] args) {
    }

}
