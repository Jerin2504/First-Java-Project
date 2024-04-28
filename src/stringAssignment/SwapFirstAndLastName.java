package stringAssignment;

public class SwapFirstAndLastName {

	public String[] nameShuffle(String name) {
		String[] nameArray = name.split(" ");

		String holdName = nameArray[0];
		nameArray[0] = nameArray[nameArray.length - 1];
		nameArray[nameArray.length - 1] = holdName;

		return nameArray;
	}

}
