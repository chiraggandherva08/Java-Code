package complexity;
import java.util.Scanner;

public class RecursionAnalysis {

    public static void func (int n) {
        if (n <= 0) {
            return;
        }
        System.out.println("GFGs");
        func(n/2);
        func(n/2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        func(n);

        sc.close();
    }

    public static void main() {
        System.out.println("Name is Chirag Gandherva");
    }
}
