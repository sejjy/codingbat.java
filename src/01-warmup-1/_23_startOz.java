// Given a string, return a string made of the first 2 chars (if present),
// however include first char only if it is 'o' and include the second only if
// it is 'z', so "ozymandias" yields "oz".
//
// startOz("ozymandias") → "oz"
// startOz("bzoo") → "z"
// startOz("oxx") → "o"

public class _23_startOz {

	public String startOz(String str) {
		int len = str.length();
		String start = "";

		if (len >= 1) {
			String first = str.substring(0, 1);

			if (first.equals("o"))
				start += first;
		}
		if (len >= 2) {
			String second = str.substring(1, 2);

			if (second.equals("z"))
				start += second;
		}
		return start;
	}

	// Solution:

	/*
	public String startOz(String str) {
		String result = "";

		if (str.length() >= 1 && str.charAt(0) == 'o') {
			result = result + str.charAt(0);
		}

		if (str.length() >= 2 && str.charAt(1) == 'z') {
			result = result + str.charAt(1);
		}

		return result;
	}
	*/
}
