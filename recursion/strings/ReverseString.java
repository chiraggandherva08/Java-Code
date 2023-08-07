package recursion.strings;

public class ReverseString {

    public static String reverse(String str, String newStr, int index) {
        if (str.length() == newStr.length())
            return newStr;

        return reverse(str, newStr + str.charAt(index), index-1);
    }

    public static void main(String[] args) {
        System.out.println(
                reverse("hello world", "", 0)
        );
    }
}
