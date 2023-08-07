package binarySearch.twoPointerApproach;
import java.util.*;

public class TripletSum {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		int[] nums = { 2, 2, 3, 3, 4, 8, 9, 20, 40, 44, 48, 51, 55, 60, 63, 100, 101, 107, 120, 140, 200 };

		System.out.println(Arrays.toString(nums));
		System.out.print("Enter sum: ");
	
		int sum = inp.nextInt();
		System.out.println(tripletSum(nums, sum));
	}

	// Time Complexity: O(N^2)
	// Aux. Space: O(1)
	public static boolean tripletSum(int[] nums, int sum) {
		int low = 0, high = nums.length - 1;

		while (low <= high) {
			int sumAux = nums[low] + nums[high];

			if (sumAux > sum)
				high--;
			else {
				for ( int i = low + 1; i < high; i++ ) {
					if (sumAux + nums[i] == sum) {
						System.out.println("a: " + nums[low] + "\nb: " + nums[i] + "\nc: " + nums[high]);
						return true;
					} else if (sumAux + nums[i] > sum) {
						high--;
						break;
					}
				}
				low++;
			}
		}
		return false;
	}
}
