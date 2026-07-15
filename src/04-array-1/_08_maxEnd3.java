// Given an array of ints length 3, figure out which is larger, the first or
// last element in the array, and set all the other elements to be that value.
// Return the changed array.
//
// maxEnd3([1, 2, 3]) → [3, 3, 3]
// maxEnd3([11, 5, 9]) → [11, 11, 11]
// maxEnd3([2, 11, 3]) → [3, 3, 3]

public class _08_maxEnd3 {

	public int[] maxEnd3(int[] nums) {
		int larger = Math.max(nums[0], nums[2]);

		return new int[] { larger, larger, larger };
	}

	// Solution:

	/*
	public int[] maxEnd3(int[] nums) {
		int max = Math.max(nums[0], nums[2]);
		nums[0] = max;
		nums[1] = max;
		nums[2] = max;
		return nums;

		// Solution notes: you could write if-logic to figure out
		// which element is the biggest, but here we use Math.max()
		// to solve that part nicely.
	}
	*/
}
