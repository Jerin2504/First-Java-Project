package arrayConcepts;

public class CountEvenNumbers {

	int[] numbers = { 4, 5, 7, 23, 46, 34, 56, 3, 45, 68 };
	int counter = 0;

	public void checkAndCountEvenNumbers() {

		for (int i = 0; i < 10; i++) {
			if ((numbers[i] % 2) == 0) {
				counter++;
			}
		}

		System.out.println("Total count of numbers divisible by 2 is : " + counter);
	}

}
