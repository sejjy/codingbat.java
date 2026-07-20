// Given two strings, word and a separator sep, return a big string made of
// count occurrences of the word, separated by the separator string.
//
// repeatSeparator("Word", "X", 3) → "WordXWordXWord"
// repeatSeparator("This", "And", 2) → "ThisAndThis"
// repeatSeparator("This", "And", 1) → "This"

public class _13_repeatSeparator {

	public String repeatSeparator(String word, String sep, int count) {
		String result = "";

		for (int i = 0; i < count; i++) {
			if (i > 0)
				result += sep;
			result += word;
		}

		return result;
	}
}
