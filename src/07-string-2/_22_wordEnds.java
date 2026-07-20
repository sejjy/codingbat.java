// Given a string and a non-empty word string, return a string made of each char
// just before and just after every appearance of the word in the string. Ignore
// cases where there is no char before or after the word, and a char may be
// included twice if it is between two words.
//
// wordEnds("abcXY123XYijk", "XY") → "c13i"
// wordEnds("XY123XY", "XY") → "13"
// wordEnds("XY1XY", "XY") → "11"

public class _22_wordEnds {

	public String wordEnds(String str, String word) {
		String result = "";
		int strLength = str.length();
		int wordLength = word.length();

		for (int i = 0; i <= strLength - wordLength; i++) {
			if (!str.startsWith(word, i))
				continue;

			// get the char before the word
			if (i > 0)
				result += str.charAt(i - 1);

			// get the char after the word
			if (i + wordLength < strLength)
				result += str.charAt(i + wordLength);
		}

		return result;
	}
}
