// Given 2 int values, return true if they are both in the range 30..40
// inclusive, or they are both in the range 40..50 inclusive.
//
// in3050(30, 31) → true
// in3050(30, 41) → false
// in3050(40, 50) → true

public class _26_in3050 {

	public boolean in3050(int a, int b) {
		boolean a3040 = (a >= 30 && a <= 40);
		boolean b3040 = (b >= 30 && b <= 40);

		boolean a4050 = (a >= 40 && a <= 50);
		boolean b4050 = (b >= 40 && b <= 50);

		return (a3040 && b3040) || (a4050 && b4050);
	}

	// Solution:

	/*
	public boolean in3050(int a, int b) {
		if (a >= 30 && a <= 40 && b >= 30 && b <= 40) {
			return true;
		}
		if (a >= 40 && a <= 50 && b >= 40 && b <= 50) {
			return true;
		}
		return false;
		// This could be written as one very large expression,
		// connecting the two main parts with ||
	}
	*/
}
