package stringAssignment;

public class PrefixSuffixCheck {

	/*
	 * Create two functions: isPrefix(word, prefix-) and isSuffix(word, -suffix).
	 * isPrefix should return true if it begins with the prefix argument.
	 * isSuffix should return true if it ends with the suffix argument. Otherwise
	 * return false.
	 * 
	 * Examples : isPrefix("automation", "auto-") ➞ true isSuffix("arachnophobia",
	 * "-phobia") ➞ true isPrefix("retrospect", "sub-") ➞ false isSuffix("vocation",
	 * "-logy") ➞ false
	 */

	public boolean isPrefix(String wordEntered, String prefix) {
		if (wordEntered.substring(0, (prefix.length())).equals(prefix)) {
			return true;
		}
		return false;
	}

	public boolean isSuffix(String wordEntered, String suffix) {
		if (wordEntered.substring((wordEntered.length() - suffix.length()), wordEntered.length()).equals(suffix)) {
			return true;
		}
		return false;
	}

}
