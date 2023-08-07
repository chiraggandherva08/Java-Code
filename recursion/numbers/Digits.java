package recursion.numbers;

public class Digits {

    public static void digits(int num) {
        if (num == 0)
            return;

        digits(num/10);
        System.out.print(num%10 + " ");
    }

    public static void main(String[] args) {
        digits(5122);
    }
}
