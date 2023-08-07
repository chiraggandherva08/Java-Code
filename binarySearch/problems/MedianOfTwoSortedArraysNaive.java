package binarySearch.problems;

import java.util.Arrays;

public class MedianOfTwoSortedArraysNaive {
	
	public static void main(String[] args) {
		int[] arg1 = { 10, 20, 30 };
		int[] arg2 = { 5, 15, 25 };
		// int[] newArr = { 5, 10, 15, 20, 25, 30 };

		int[] nums1 = { 1, 2, 3, 5, 6, 8, 10, 14, 21, 22 };
		int[] nums2 = { 10, 11, 23, 81, 119, 200, 220, 230, 253, 270 };

		System.out.println(
				median(nums1, nums2)
		);
	}

	// Time Complexity: O(N).
	// Aux. Space: O(1).
	public static float median(int[] arg1, int[] arg2) {
		int low1 = 0, low2 = 0;
		int high1 = arg1.length, high2 = arg2.length;

		int[] medianArr = new int[high1 + high2];
		int medianPointer = 0;

		while(low1 < high1 && low2 < high2) {
			if (arg1[low1] < arg2[low2]) {
				medianArr[medianPointer] = arg1[low1];
				low1++;
			} else if (arg2[low2] < arg1[low1]) {
				medianArr[medianPointer] = arg2[low2];
				low2++;
			} else {
				medianArr[medianPointer] = arg1[low1];
				medianPointer++;
				medianArr[medianPointer] = arg2[low2];

				low1++;
				low2++;
			}
			medianPointer++;
		}

		if (high1 < high2) {
			return copyRemaining(medianArr, arg2, medianPointer, low2);
		} else {
			return copyRemaining(medianArr, arg1, medianPointer, low1);
		}
	}

	public static float copyRemaining(int[] medianArr, int[] arg, int medianPtr, int argLow) {
		while (medianPtr < medianArr.length) {
			medianArr[medianPtr] = arg[argLow];
			medianPtr++;
			argLow++;
		}

		int midIndex = medianArr.length / 2;

		if (medianArr.length % 2 == 0) {
			return (float)(medianArr[midIndex-1] + medianArr[midIndex]) / 2;
		} else {
			return (float)medianArr[midIndex];
		}
	}
}
