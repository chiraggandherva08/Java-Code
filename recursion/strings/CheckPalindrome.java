package recursion.strings;

public class CheckPalindrome {

    public static boolean isPalindrome(String str, int low) {
        int high = str.length() - (low + 1);

        if (low >= high)
            return true;

        else if (str.charAt(low) != str.charAt(high))
            return false;

        return isPalindrome(str, low + 1);
    }

    public static void main(String[] args) {
        System.out.println(
                isPalindrome("wow", 0)
        );
    }
}
