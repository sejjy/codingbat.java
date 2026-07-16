// Return true if the given non-negative number is 1 or 2 less than a multiple
// of 20. So for example 38 and 39 return true, but 40 returns false. See also:
// Introduction to Mod
//
// less20(18) → true
// less20(19) → true
// less20(20) → false

public class _12_less20 {

	public boolean less20(int n) {
		int remLess20 = 20 - (n % 20);

		return (remLess20 == 1) ^ (remLess20 == 2);
	}
}
