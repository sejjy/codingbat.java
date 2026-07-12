// Given a string of any length, return a new string where the last 2 chars, if
// present, are swapped, so "coding" yields "codign".
//
// lastTwo("coding") → "codign"
// lastTwo("cat") → "cta"
// lastTwo("ab") → "ba"

public class _24_lastTwo {

	public String lastTwo(String str) {
		int length = str.length();

		if (length < 2)
			return str;

		// @formatter:off
		return str.substring(0, length - 2)
			 + str.charAt(length - 1)
			 + str.charAt(length - 2);
		// @formatter:on
	}
}
