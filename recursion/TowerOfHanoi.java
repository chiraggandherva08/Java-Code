package recursion;

public class TowerOfHanoi {

    public static void towerOfHanoi(int n, char a, char b, char c) {
        if (n == 0)
            return;


        // 1073741823
        towerOfHanoi(n-1, a, c, b);

        System.out.println("move disk " + n + " from " + a + " to " + c);
        towerOfHanoi(n-1, b, a, c);
    }

    public static void main(String[] args) {
        towerOfHanoi(10, 'a', 'b', 'c');
    }
}
