package recursion.strings;

public class RemoveDuplicate {

    // Time complexity: O(N)
    // Space complexity: O(N)

    public static String removeDuplicate(String str, String rStr, int index) {
        if (index == str.length()) {
            return rStr;
        }
        if (!rStr.contains(Character.toString(str.charAt(index)))){
            rStr += str.charAt(index);
        }
        return removeDuplicate(str, rStr, index+1);
    }

    public static void main(String[] args) {
        String str = "hello";

        System.out.println(
            removeDuplicate(str, "", 0)
        );
    }
}