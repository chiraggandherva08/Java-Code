package recursion.strings;

import java.util.Scanner;

public class XToEnd {

    public static String moveAllX(String str, char ch) {
        return moveAllX(str, 0, 0, "", ch);
    }

    public static String moveAllX(String str, int index, int count, String newString, char ch) {
        if (index == str.length()){
            for (int i=0; i<count; i++){
                newString = newString.concat(ch + "");
            }
            return newString;
        }
        if (str.charAt(index) == ch) {
            count++;
        }
        if (str.charAt(index) != ch) {
            newString = newString.concat(str.charAt(index) + "");
        }
        return moveAllX(str, index+1, count, newString, ch);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = inp.nextLine();
        System.out.print("Enter the char: ");
        char ch = inp.nextLine().charAt(0);

        System.out.println(
                moveAllX(str, ch)
        );

        inp.close();
    }
}
