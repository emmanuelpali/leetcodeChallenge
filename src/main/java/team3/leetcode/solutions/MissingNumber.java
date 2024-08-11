package team3.leetcode.solutions;

public class MissingNumber {
	public int missingNumber(int[] nums) {
		int sum = 0; // Initialize the sum to 0

		// Loop through the array and calculate the sum of all numbers
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}

		int num = nums.length; // Get the length of the nums array

		// Calculate the expected sum of the first num using the formula n*(n+1)/2
		// Subtract the actual sum from the expected sum to find the missing number
		return ((num * (num + 1)) / 2) - sum;
	}
}
