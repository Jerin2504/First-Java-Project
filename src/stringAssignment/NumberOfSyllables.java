package stringAssignment;

public class NumberOfSyllables {
	/*
	 * Create a function that counts the number of syllables a word has. Each
	 * syllable is separated with a dash Examples numberSyllables("buf-fet") ➞ 2
	 * numberSyllables("beau-ti-ful") ➞ 3 numberSyllables("mon-u-men-tal") ➞ 4
	 * numberSyllables("on-o-mat-o-poe-ia") ➞ 6
	 */

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
