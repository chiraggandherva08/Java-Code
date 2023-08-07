package arrays.problems;

import java.util.Arrays;

public class Mean_Median {

    public static int median(int[] arr,int N) {
        Arrays.sort(arr);

        if (N%2 == 0) {
            return (arr[N/2 - 1] + arr[(N)/2]) / 2;
        }
        return arr[(N)/2];
    }

    public static int mean(int[] arr,int N) {
        int sum = 0;

        for (int i=0; i<N; i++)
            sum += arr[i];
        return sum/N;
    }

    public static void main(String[] args) {
        int[] arr = {2, 8, 3, 4};

        System.out.println(
                mean(arr, arr.length)
        );

        System.out.println(
                median(arr, arr.length)
        );
        System.out.println(Arrays.toString(arr));
    }
}
