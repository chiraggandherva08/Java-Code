package recursion;

import java.util.ArrayList;

public class SubsetsArray {

    public static void
    subsets(ArrayList<Integer> input, ArrayList<ArrayList<Integer>> output, ArrayList<Integer> help, int index){
        if (index == input.size()) {
            output.add(help);
            return;
        }
        // subsets when arr[i] is not included.
        subsets(input, output, new ArrayList<>(help), index+1);

        help.add(input.get(index));
        // subsets when arr[i] is included.
        subsets(input, output, new ArrayList<>(help), index+1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();


        subsets(input, output, new ArrayList<>(), 0);
        System.out.println(output);
    }
}
