package arrays.problems;

import java.util.Scanner;
import java.util.Arrays;

public class SpiralMatrix {
	
	public static void main( String[] args ) {
		Scanner inp = new Scanner( System.in );
		System.out.print( "Enter order: " );

		int n = inp.nextInt();
		int[][] spMtr = spiralMatrix( n );

		for (int[] arr : spMtr) {
			System.out.println(
				Arrays.toString(arr)
			);
		}
	}
	public static int[][] spiralMatrix(int n) {
		return spiralMatrix( new int[n][n], new int[] {0, 0}, new int[] {0, n - 1}, new int[] {n - 1, n - 1}, new int[] {n - 1, 0}, 1 );
	}

	public static int[][] spiralMatrix( int[][] matrix, int[] leftTop, int[] rightTop, int[] rightBottom, int[] leftBottom, int count ) {
		if (leftTop[0] > leftBottom[0]) 
			return matrix;

//		System.out.print(Arrays.toString(leftTop));
//		System.out.print(" | " + Arrays.toString(rightTop) + "\n");
//		System.out.print(Arrays.toString(rightBottom));
//		System.out.print(" | " + Arrays.toString(leftBottom) + "\n");
//		System.out.println();

		for (int[] arr : matrix) {
			System.out.println(
				Arrays.toString(arr)
			);
		} System.out.println();


		for (int o = leftTop[1]; o <= rightTop[1]; o++) {
			matrix[ leftTop[0] ][ o ] = count;
			count++;
		}

		for (int o = rightTop[0] + 1; o <= rightBottom[1]; o++) {
			matrix[ o ][ rightTop[1] ] = count;
 			count++;
        }

		for (int o = rightBottom[1] - 1; o >= leftBottom[1]; o--) {
			matrix[ leftBottom[0] ][ o ] = count;
			count++;
		}

		for (int o = leftBottom[0]; o > leftTop[0] ; o--) {
			matrix[ o ][ leftTop[1] ] = count - 1;
			count++;
		}

		// commands to shrink the size of the matrix in each and every recursive call.
		leftTop[0]++; leftTop[1]++;
		leftBottom[0]--; leftBottom[1]++;

		rightTop[0]++; rightTop[1]--;
		rightBottom[0]--; rightBottom[1]--;

		return spiralMatrix( matrix, leftTop, rightTop, rightBottom, leftBottom , count - 1);
	}
}


