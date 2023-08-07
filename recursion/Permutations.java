package recursion;

public class Permutations {

    public static void permutations(String input_string, int index, String temp_string) {
        System.out.println(input_string + index + temp_string);
    }

    public static void main(String[] args) {
        permutations("hello", 0, "");
    }
}
