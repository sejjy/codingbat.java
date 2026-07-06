// Given a string, return a new string where the first and last chars have been
// exchanged.
//
// frontBack("code") → "eodc"
// frontBack("a") → "a"
// frontBack("ab") → "ba"

public class _11_frontBack {

	public String frontBack(String str) {
		if (str.length() < 2)
			return str;

		String first = str.substring(0, 1);
		String middle = str.substring(1, str.length() - 1);
		String last = str.substring(str.length() - 1);

		return last + middle + first;
	}

	// Solution:

	/*
	public String frontBack(String str) {
		if (str.length() <= 1)
			return str;

		String mid = str.substring(1, str.length() - 1);

		// last + mid + first
		return str.charAt(str.length() - 1) + mid + str.charAt(0);
	}
	*/
}
