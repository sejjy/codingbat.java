// Given a string and a non-negative int n, we'll say that the front of the
// string is the first 3 chars, or whatever is there if the string is less than
// length 3. Return n copies of the front;
//
// frontTimes("Chocolate", 2) → "ChoCho"
// frontTimes("Chocolate", 3) → "ChoChoCho"
// frontTimes("Abc", 3) → "AbcAbcAbc"

public class _02_frontTimes {

	public String frontTimes(String str, int n) {
		String front = str;
		String result = "";

		if (front.length() >= 3)
			front = front.substring(0, 3);

		for (int i = 0; i < n; i++)
			result += front;

		return result;
	}

	// Solution:

	/*
	public String frontTimes(String str, int n) {
		int frontLen = 3;
		if (frontLen > str.length()) {
			frontLen = str.length();
		}
		String front = str.substring(0, frontLen);

		String result = "";
		for (int i = 0; i < n; i++) {
			result = result + front;
		}
		return result;
	}
	*/
}
