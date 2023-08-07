package recursion;

public class CountOnes {

    public static int countDigits(int num) {
        if (num == 0)
            return 0;

        int count = 0;
        while (num != 0) {
            count++;
            num -= num%10;
            num /= 10;
        }

        return count;
    }

    public static int countOnes(int num) {
        int digits = countDigits(num);

        if (digits == 1) {
            return 1;
        }

        int moduloNum = num % (int) Math.pow(10, digits-1);
        int newNum =  num - moduloNum;
        return countOnes(newNum) + countOnes(moduloNum);
    }

    public static void main(String[] args) {
        System.out.println(
                countOnes(91)
        );
    }
}
