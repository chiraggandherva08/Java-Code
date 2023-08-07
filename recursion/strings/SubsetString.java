package recursion.strings;

public class SubsetString {

    public static void subsets(String inputString, String outputString, int index) {
        if (index >= inputString.length()) {
            System.out.println(outputString);
            return;
        }
        subsets(inputString, outputString, index+1);
        subsets(inputString, outputString + inputString.charAt(index), index+1);
    }

    public static void main(String[] args) {
        subsets("abc", "", 0);
    }
}
