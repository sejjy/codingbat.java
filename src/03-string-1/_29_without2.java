// Given a string, if a length 2 substring appears at both its beginning and
// end, return a string without the substring at the beginning, so "HelloHe"
// yields "lloHe". The substring may overlap with itself, so "Hi" yields "".
// Otherwise, return the original string unchanged.
//
// without2("HelloHe") → "lloHe"
// without2("HelloHi") → "HelloHi"
// without2("Hi") → ""

public class _29_without2 {

	public String without2(String str) {
		int length = str.length();

		if (length < 2)
			return str;

		String start = str.substring(0, 2);
		String end = str.substring(length - 2);

		if (start.equals(end))
			return str.substring(2);
		return str;
	}
}
