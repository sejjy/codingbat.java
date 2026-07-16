// Given 2 ints, a and b, return their sum. However, sums in the range 10..19
// inclusive, are forbidden, so in that case just return 20.
//
// sortaSum(3, 4) → 7
// sortaSum(9, 4) → 20
// sortaSum(10, 11) → 21

public class _05_sortaSum {

	public int sortaSum(int a, int b) {
		int sum = a + b;

		if (sum >= 10 && sum <= 19)
			return 20;
		return sum;
	}

	// Solution:

	/*
	public int sortaSum(int a, int b) {
		int sum = a + b;
		if (sum >= 10 && sum <= 19) {
			return 20;
		}
		return sum;

		// Solution notes: storing a + b in a local variable first cleans
		// the code up a bit.
	}
	*/
}
