package team3.leetcode.solutions;

public class SortedSquares {
	public static int[] sortedSquares(int[] nums) {
		int[] sortedList = new int[nums.length]; //Create an array for the sorted squares
		int left = 0; //Pointer starting at the start of the nums array
		int right = nums.length - 1; //Pointer starting at the end of the nums array
		int index = nums.length - 1; //Index to place the largest square in the sortedList array

		//While the two pointers haven't met yet
		while (left <= right) {
		    int leftSquare = nums[left] * nums[left]; //Square the number at the left pointer
		    int rightSquare = nums[right] * nums[right]; //Square the number at the right pointer

		    //Sorting
		    //Place the larger square at the current index and move the corresponding pointer
		    if (leftSquare > rightSquare) {
		        sortedList[index--] = leftSquare; //Insert the left square and move the left pointer right
		        left++;
		    } else {
		        sortedList[index--] = rightSquare; //Insert the right square and move the right pointer left
		        right--;
		    }
		}

		return sortedList; //Return the sorted squares array

		//return Arrays.stream(nums).map(num -> num * num).sorted().toArray();
	}
}
