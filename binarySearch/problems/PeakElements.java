package binarySearch.problems;

import java.util.ArrayList;
import java.util.Arrays;

public class PeakElements {

	public static void main(String[] args) {
		int[] nums = {1, 3, 4, 1, 2, 3, 4, 5, 10, 1, 5, 2, 1, 100};
		System.out.println(
			Arrays.toString(nums)
		);

		allPeaksBinarySearch(nums);
		allPeaks(nums);
		return;
	}

	// Naive Approach
	// Time Complexity: O(N)
	// Aux Space: O(1)
	public static void allPeaks(int[] nums) {
		if (nums.length == 0) 
			return;
		else if (nums.length == 1){
			System.out.println(nums[0]);
			return;
		}
		else {
			if (nums[0] >= nums[1])
				System.out.println(nums[0]);
		
			if ( nums[nums.length-1] >= nums[nums.length-2] )
				System.out.println(nums[nums.length-1]);

			for (int i = 1; i < nums.length-1; i++)
				if ( nums[i] >= nums[i-1] && nums[i] >= nums[i+1] )
					System.out.println(nums[i]);
		}
	}

	// Efficient Approach
	// Time Complexity: O(log N)
	// Aux Space: O(1)
	public static ArrayList<Integer> allPeaksBinarySearch(int[] nums) {
		ArrayList<Integer> allPeaks = new ArrayList<>();

		return allPeaks;
	}
}

