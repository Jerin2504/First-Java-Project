package stringAssignment;

public class RemoveFirstAndLastChar {

	/*
	 * Create a function that removes the first and last characters from a string.
	 * Example : removeFirstLast("hello") ➞ "ell" removeFirstLast("a") ➞ "a"
	 */

	private String wordEntered;

	public RemoveFirstAndLastChar(String wordEntered) {
		super();
		this.wordEntered = wordEntered;
	}

	public String removeFirstLast() {
		if (wordEntered.length() > 2) {
			return (wordEntered.substring(1, (wordEntered.length() - 1)));
		}
		return wordEntered;

	}

}
