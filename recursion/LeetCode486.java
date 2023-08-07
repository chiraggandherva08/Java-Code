package recursion;

public class LeetCode486 {

    public static int sum_arr(int[] arr) {
        int sum = 0;

        for (int i : arr)
            sum += i;

        return sum;
    }

    public static boolean PredictTheWinner(int[] arr) {
        int maxScore1 = PredictTheWinner(arr, 0, arr.length-1, true);
        return maxScore1 > sum_arr(arr) - maxScore1;
    }

    public static int PredictTheWinner(int[] arr, int low, int high, boolean turn_of_a) {
        if (low == high)
            return (turn_of_a) ? arr[low] : 0;

        if (turn_of_a) {
            int score1 = PredictTheWinner(arr, low+1, high, false) + arr[low];
            int score2 = PredictTheWinner(arr, low, high-1, false) + arr[high];

            return Math.max(score1, score2);
        }
        else {
            int score_1 = PredictTheWinner(arr, low+1, high, true);
            int score_2 = PredictTheWinner(arr, low, high-1, true);

            return Math.min(score_1, score_2);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,5,233,7};

        System.out.println(
                PredictTheWinner(arr)
        );
    }
}
