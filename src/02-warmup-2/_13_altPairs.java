// Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9
// ... so "kittens" yields "kien".
//
// altPairs("kitten") → "kien"
// altPairs("Chocolate") → "Chole"
// altPairs("CodingHorror") → "Congrr"

public class _13_altPairs {

	public String altPairs(String str) {
		String result = "";
		int length = str.length();
		int end;

		for (int i = 0; i < length; i += 4) {
			end = i + 2;

			if (end > length)
				end = length;

			result += str.substring(i, end);
		}

		return result;
	}

	// Solution:

	/*
	public String altPairs(String str) {
		String result = "";

		// Run i by 4 to hit 0, 4, 8, ...
		for (int i = 0; i < str.length(); i += 4) {
			// Append the chars between i and i+2
			int end = i + 2;
			if (end > str.length()) {
				end = str.length();
			}
			result = result + str.substring(i, end);
		}

		return result;
	}
	*/
}
