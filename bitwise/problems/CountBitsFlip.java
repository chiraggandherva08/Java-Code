package bitwise.problems;

public class CountBitsFlip {
    public static int countBitsFlip(int a, int b){

        int count = 0;
        int index = 0;

        while (index < 32) {
            if ((a&1) != (b&1)) {
                count++;
            }
            a = a >> 1;
            b = b >> 1;
            index++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(
                countBitsFlip(20, 25)
        );
    }
}
