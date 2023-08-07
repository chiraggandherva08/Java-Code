package mathsForDSA;

import java.util.Arrays;

public class SieveOfEratosthenes {

    // Time complexity: O(Nlog-log(N)) --> nearly linear.
    // Space complexity: O(1).
    public static void sieveOfEratosthenes (int num) {
        boolean[] nos = new boolean[num + 1];
        Arrays.fill(nos, true);

        nos[0] = false;
        nos[1] = false;

        for (int i=2; i< Math.sqrt(nos.length); i++)
            if (nos[i])
                for (int j=2*i; j<nos.length; j+=i)
                    nos[j] = false;


        for (int i = 0; i < nos.length; i++)
            if (nos[i])
                System.out.print(i + " ");

    }

    public static void main(String[] args) {
        sieveOfEratosthenes(100);
    }
}
