// Given 2 positive int values, return the larger value that is in the range
// 10..20 inclusive, or return 0 if neither is in that range.
//
// max1020(11, 19) → 19
// max1020(19, 11) → 19
// max1020(11, 9) → 11

public class _27_max1020 {

	public int max1020(int a, int b) {
		boolean aInRange = (a >= 10 && a <= 20);
		boolean bInRange = (b >= 10 && b <= 20);

		if (aInRange && bInRange)
			return Math.max(a, b);
		if (aInRange)
			return a;
		if (bInRange)
			return b;
		return 0;
	}

	// Solution:

	/*
	public int max1020(int a, int b) {
		// First make it so the bigger value is in a
		if (b > a) {
			int temp = a;
			a = b;
			b = temp;
		}

		// Knowing a is bigger, just check a first
		if (a >= 10 && a <= 20)
			return a;
		if (b >= 10 && b <= 20)
			return b;
		return 0;
	}
	*/
}
