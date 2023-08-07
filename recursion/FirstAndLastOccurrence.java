package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastOccurrence {

    // Time complexity: O(N)
    public static void occurrences(String str, char ch, int index, int[] indices) {
        if (str.length() == 0){
            return;
        }
        else if (indices[0] == -1 && str.charAt(0) == ch) {
            indices[0] = index;
        }
        if (str.charAt(0) == ch) {
            indices[1] = index;
        }
        occurrences(str.substring(1), ch, index+1, indices);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.nextLine().charAt(0);

        int[] indices = {-1, -1};
        occurrences(str, ch, 0, indices);

        System.out.println(
                Arrays.toString(indices)
        );
    }
}
