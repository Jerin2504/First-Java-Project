package comparisonOperators;

public class ComparisonOperators {

	int a = 10;
	int b = 5;
	boolean result = false;

	public void isAGreaterThanB() {
		result = a > b;
		System.out.println("Is A Greater Than B: " + result);
	}

	public void isAGreaterThanOrEqualToB() {
		result = a >= b;
		System.out.println("Is A Greater Than Or Equal To B: " + result);
	}

	public void isALesserThanB() {
		result = a < b;
		System.out.println("Is A Lesser Than B: " + result);
	}

	public void isALesserThanOrEqualToB() {
		result = a <= b;
		System.out.println("Is A Lesser Than Or Equal To B: " + result);
	}

	public void compareTwoNumbers() {
		result = a == b;
		System.out.println("Is A Equal To B: " + result);

	}

	public void isANotEqualToB() {
		result = a != b;
		System.out.println("Is A Not Equal To B: " + result);

	}
}
