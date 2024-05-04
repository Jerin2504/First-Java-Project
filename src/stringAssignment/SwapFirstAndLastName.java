package stringAssignment;

public class SwapFirstAndLastName {

	/*
	 * Create a method that accepts a string (of a person's first and last name) and
	 * returns a string with the first and last name swapped. Examples
	 * nameShuffle("Donald Trump") ➞ "Trump Donald" nameShuffle("Seymour Butts") ➞
	 * "Butts Seymour"
	 */

	public String[] nameShuffle(String name) {
		String[] nameArray = name.split(" ");

		String holdName = nameArray[0];
		nameArray[0] = nameArray[nameArray.length - 1];
		nameArray[nameArray.length - 1] = holdName;

		return nameArray;
	}

}
