package stringAssignment;

public class NumberOfSyllablesMain {

	public static void main(String[] args) {
		NumberOfSyllables ns = new NumberOfSyllables("beau-ti-ful");
		if (ns.numberSyllables() > 0) {
			System.out.println("Number of Syllables in " + ns.getWordEntered() + " : " + ns.numberSyllables());
		} else {
			System.out.println("Cannot determine the number of syllables as the entered word is blank.");
		}

	}

}
