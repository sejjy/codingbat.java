// Given a string, does "xyz" appear in the middle of the string? To define
// middle, we'll say that the number of chars to the left and right of the "xyz"
// must differ by at most one. This problem is harder than it looks.
//
// xyzMiddle("AAxyzBB") → true
// xyzMiddle("AxyzBB") → true
// xyzMiddle("AxyzBBB") → false

public class _15_xyzMiddle {

	public boolean xyzMiddle(String str) {
		int left = 0;
		int right = 0;

		for (int i = 0; i <= str.length() - 3; i++) {
			if (str.startsWith("xyz", i)) {
				left = i;
				right = str.length() - (i + 3);

				if (Math.abs(left - right) <= 1)
					return true;
			}
		}

		return false;
	}
}
