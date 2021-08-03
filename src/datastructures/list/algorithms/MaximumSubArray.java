package datastructures.list.algorithms;

public class MaximumSubArray {

	/*
	 * Given an integer array nums, find the contiguous subarray (containing at
	 * least one number) which has the largest sum and return its sum.
	 * 
	 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4] Output: 6 Explanation: [4,-1,2,1] has
	 * the largest sum = 6
	 */

	// Both solutions are same in complexity and almost similar

	public static int maxSubArraySolution1(int[] nums) {
		int sum = 0;
		int largeSum = nums[0];
		for (int num : nums) {
			sum = sum + num;
			if (sum < num) {
				sum = num;
			}
			if (sum > largeSum) {
				largeSum = sum;
			}
		}
		return largeSum;
	}

	public static int maxSubArraySolution2(int[] nums) {
		int sum = 0;
		int largeSum = nums[0];
		for (int num : nums) {
			sum = sum + num;
			if (sum > largeSum) {
				largeSum = sum;
			}
			if (sum < 0) {
				sum = 0;
			}

		}
		return largeSum;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 6, 8, -9, 4 };
		int op = maxSubArraySolution2(arr);
		System.out.println(op);
	}

}
