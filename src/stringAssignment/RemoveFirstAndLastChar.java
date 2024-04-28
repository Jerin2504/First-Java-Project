package stringAssignment;

public class RemoveFirstAndLastChar {

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
