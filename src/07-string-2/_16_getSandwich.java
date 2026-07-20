// A sandwich is two pieces of bread with something in between. Return the
// string that is between the first and last appearance of "bread" in the given
// string, or return the empty string "" if there are not two pieces of bread.
//
// getSandwich("breadjambread") → "jam"
// getSandwich("xxbreadjambreadyy") → "jam"
// getSandwich("xxbreadyy") → ""

public class _16_getSandwich {

	public String getSandwich(String str) {
		int first = str.indexOf("bread");
		int last = str.lastIndexOf("bread");

		if (first == -1 || last == -1 || first == last)
			return "";

		return str.substring(first + 5, last);
	}
}

// Just learned about indexOf() and lastIndexOf()
