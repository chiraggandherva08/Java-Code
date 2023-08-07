package binarySearch.mountainArray;

import java.util.Arrays;
import java.util.Scanner;

public class PeakMountainArray {
	
	public static void main( String[] args ) {
		Scanner input = new Scanner(System.in);

		int[] nums = { 0, 10, 99, 100, 0, -1, -2, -3, -4, -5, -6 };
		System.out.println(Arrays.toString(nums));
		System.out.print("Enter num: ");

		int num = input.nextInt();

		System.out.println(
			peakMountain(nums, num)
		);
	}

	public static int peakMountain( int[] nums, int num ) {
		int low = 0;
		int high = nums.length - 1;
		int peakIndex = -1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if ((mid == 0 ||  nums[mid] > nums[mid - 1]) && (mid == nums.length - 1 || nums[mid] > nums[mid + 1])) {
				peakIndex = mid;
				break;
			}
			else if ( nums[mid] > nums[mid - 1] )
				low = mid + 1;
			else if ( nums[mid] < nums[mid - 1] )
				high = mid - 1;
		}
		int index = bSearch(nums, num, 0, peakIndex, true);
		
		if (index != -1) 
			return index;
		else 
			return bSearch(nums, num, peakIndex+1, nums.length - 1, false);
	}

	public static int bSearch( int[] nums, int num, int low, int high, boolean order ) {
		while (low <= high) {
			int mid = (low + high) / 2;

			if (order) {
				// for ascending order sorted section.
				if (nums[mid] == num)
					return mid;
				else if (num < nums[mid])
					high = mid - 1;
				else 
					low = mid + 1;
			}
			else {
				// for descending order sorted section.
				if (nums[mid] == num) 
					return mid;
				else if (num < nums[mid])
					low = mid + 1;
				else 
					high = mid - 1;
			}
		}
		return -1;
	}
}
