// Given a string, return true if the first 2 chars in the string also appear at
// the end of the string, such as with "edited".
//
// frontAgain("edited") → true
// frontAgain("edit") → false
// frontAgain("ed") → true

public class _26_frontAgain {

	public boolean frontAgain(String str) {
		if (str.length() < 2)
			return false;
		return (str.substring(0, 2).equals(str.substring(str.length() - 2)));
	}

	// Solution:

	/*
	public boolean frontAgain(String str) {
		if (str.length() < 2) {
			return false; // screen out the short-length case
		}

		String front = str.substring(0, 2);
		String back = str.substring(str.length() - 2);
		return (front.equals(back));

		// Solution notes: First screen out the length < 2 case to avoid index
		// problems with the later code.
		// Grab the two strings with substring() and compare them
		// with equals(). Return the result of equals() directly -- don't need
		// check if it's true or false. Here the two strings are stored in local
		// variables which makes the code simpler but longer.
	}
	*/
}
