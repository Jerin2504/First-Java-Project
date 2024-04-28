package stringAssignment;

public class NumberOfSyllables {

	private String wordEntered;
	private char[] wordArray;

	public NumberOfSyllables(String wordEntered) {
		super();
		this.wordEntered = wordEntered;
	}

	public String getWordEntered() {
		return wordEntered;
	}

	public int numberSyllables() {

		wordArray = wordEntered.toCharArray();
		int numberOfSyllables = 1;
		int numberOfSpaces = 0;

		for (int i = 0; i < wordArray.length; i++) {
			if (wordArray[i] == '-') {
				numberOfSyllables++;
			} else if (wordArray[i] == ' ') {
				numberOfSpaces++;
			}
		}
		// Check if the entered word is blank
		if (wordArray.length != numberOfSpaces) {
			return numberOfSyllables;
		}
		return 0;

	}

}
