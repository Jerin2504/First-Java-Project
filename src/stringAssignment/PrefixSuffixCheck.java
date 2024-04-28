package stringAssignment;

public class PrefixSuffixCheck {

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
