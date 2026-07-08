// Given an array of ints, return the number of 9's in the array.
//
// arrayCount9([1, 2, 9]) → 1
// arrayCount9([1, 9, 9]) → 2
// arrayCount9([1, 9, 9, 3, 9]) → 3

public class _08_arrayCount9 {

	public int arrayCount9(int[] nums) {
		int count = 0;

		for (int n : nums) {
			if (n == 9)
				count++;
		}

		return count;
	}

	// Solution:

	/*
	public int arrayCount9(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 9) {
				count++;
			}
		}
		return count;
	}
	*/
}
