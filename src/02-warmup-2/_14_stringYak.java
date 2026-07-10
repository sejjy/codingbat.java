// Suppose the string "yak" is unlucky. Given a string, return a version where
// all the "yak" are removed, but the "a" can be any char. The "yak" strings
// will not overlap.
//
// stringYak("yakpak") → "pak"
// stringYak("pakyak") → "pak"
// stringYak("yak123ya") → "123ya"

public class _14_stringYak {

	public String stringYak(String str) {
		String result = "";
		int length = str.length();
		int end;

		for (int i = 0; i < length; i++) {
			end = i + 2;

			if (end < length) {
				if (str.charAt(i) == 'y' && str.charAt(end) == 'k') {
					i += 2;
					continue;
				}
			}

			result += str.charAt(i);
		}

		return result;
	}

	// Solution:

	/*
	public String stringYak(String str) {
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			// Look for i starting a "yak" -- advance i in that case
			if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
				i = i + 2;
			} else { // Otherwise do the normal append
				result = result + str.charAt(i);
			}
		}

		return result;
	}
	*/
}
