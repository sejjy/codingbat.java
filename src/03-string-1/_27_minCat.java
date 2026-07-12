// Given two strings, append them together (known as "concatenation") and return
// the result. However, if the strings are different lengths, omit chars from
// the longer string so it is the same length as the shorter string. So "Hello"
// and "Hi" yield "loHi". The strings may be any length.
//
// minCat("Hello", "Hi") → "loHi"
// minCat("Hello", "java") → "ellojava"
// minCat("java", "Hello") → "javaello"

public class _27_minCat {

	public String minCat(String a, String b) {
		int lengthA = a.length();
		int lengthB = b.length();

		if (lengthA < lengthB)
			return a + b.substring(lengthB - lengthA);
		if (lengthA > lengthB)
			return a.substring(lengthA - lengthB) + b;
		return a + b;
	}
}
