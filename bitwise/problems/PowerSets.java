package bitwise.problems;

import java.util.ArrayList;
import java.util.Scanner;

public class PowerSets {

    // Time complexity: O(n * 2^n)
    // Space complexity: O(1)
    public static ArrayList<String> powerSets (String str) {
        ArrayList<String> lstAns = new ArrayList<>();

        int n = str.length();
        int N = (int) Math.pow(2, n);

        for (int i = 0; i < N; i++) {

            String strNew = "";
            int temp = i;

            for (int j = 0; j < n; j++) {
                if ((temp&1) == 1) {
                    strNew = strNew.concat(Character.toString(str.charAt(j)));
                }
                temp >>= 1;
            }
            lstAns.add(strNew);
        }
        return lstAns;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");

        System.out.println(
                powerSets(sc.nextLine())
        );
    }
}
