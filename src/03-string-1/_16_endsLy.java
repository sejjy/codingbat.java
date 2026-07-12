// Given a string, return true if it ends in "ly".
//
// endsLy("oddly") → true
// endsLy("y") → false
// endsLy("oddy") → false

public class _16_endsLy {

	public boolean endsLy(String str) {
		int length = str.length();

		if (length < 2)
			return false;
		if (str.substring(length - 2).equals("ly"))
			return true;
		return false;
	}
}
