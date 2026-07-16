// Given two ints, each in the range 10..99, return true if there is a digit
// that appears in both numbers, such as the 2 in 12 and 23. (Note: division,
// e.g. n/10, gives the left digit while the % "mod" n%10 gives the right
// digit.)
//
// shareDigit(12, 23) → true
// shareDigit(12, 43) → false
// shareDigit(12, 44) → false

public class _29_shareDigit {

	public boolean shareDigit(int a, int b) {
		// @formatter:off
		return  (a / 10 == b / 10) ||
				(a / 10 == b % 10) ||
				(a % 10 == b / 10) ||
				(a % 10 == b % 10);
		// @formatter:on
	}

	// Solution:

	/*
	public boolean shareDigit(int a, int b) {
		int a1 = a / 10; // left digit of a
		int a2 = a % 10; // right digit of a
		int b1 = b / 10;
		int b2 = b % 10;
		return (a1 == b1 || a1 == b2 || a2 == b1 || a2 == b2);

		// Solution notes: here we first store the left and right digits
		// of a and b in local variables. Then the solution is just checks
		// == looking for a match. One could write it all as one long line,
		// but that can be error prone.
	}
	*/
}
