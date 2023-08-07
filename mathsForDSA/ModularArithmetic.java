package mathsForDSA;

public class ModularArithmetic {

    public static void modular (int a, int b, int m) {
        System.out.println((a + b)%m );
        System.out.println((a%m + b%m)%m);
    }

    public static void main(String[] args) {
        modular(3, 5, 2);
    }
}
