package binarySearch.twoPointerApproach;

import java.util.*;

public class TwoPointers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] nums = { 2, 5, 8, 12, 30 };
		System.out.println(Arrays.toString(nums));

	// Aux information.
		char z = 0xA;

		System.out.print("Enter sum: ");
		int sum = input.nextInt();

		System.out.println(pairOfSum(nums, sum));
	}

	// Find if there is a pair with sum x in a sorted array
	// if exists return true 
	// else return false
	
	// Time Complexity: O(N)
	public static boolean pairOfSum(int[] nums, int sum) {
		int low = 0;
		int high = nums.length - 1;

		while (low <= high) {
			int sumAux = nums[low] + nums[high];

			if (sumAux == sum)
				return true;
			else if (sumAux < sum)
				low++;
			else
				high--;
		}
		return false;
	}
}

