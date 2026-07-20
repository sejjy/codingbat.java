// Return a version of the given string, where for every star (*) in the string
// the star and the chars immediately to its left and right are gone. So "ab*cd"
// yields "ad" and "ab**cd" also yields "ad".
//
// starOut("ab*cd") → "ad"
// starOut("ab**cd") → "ad"
// starOut("sm*eilly") → "silly"

public class _20_starOut {

	public String starOut(String str) {
		String result = "";
		int length = str.length();

		for (int i = 0; i < length; i++) {
			// ignore the star
			if (str.charAt(i) == '*')
				continue;

			// ignore the left char
			if (i > 0 && str.charAt(i - 1) == '*')
				continue;

			// ignore the right char
			if (i < length - 1 && str.charAt(i + 1) == '*')
				continue;

			result += str.charAt(i);
		}

		return result;
	}
}
