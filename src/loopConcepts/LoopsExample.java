package loopConcepts;

public class LoopsExample {

	int a = 5;
	String nameOfStudent = "jerin";
	String[] listOfStudents = { "Prabh", "Merin", "Arsh", "Manvir", "Gian" };
	int[] ageOfStudents = { 15, 16, 14, 12, 18, 21, 17, 11 };

	public void printStudentName() {
		System.out.println("Name of the Student " + nameOfStudent);
	}

	public void printStudentNameFromArray() {
		System.out.println("Name of the Student " + listOfStudents[2]);
	}

	public void incrementValue() {
		// a=a+1;
		System.out.println("A value intially " + a);
		a--;
		System.out.println("A value post decrement " + a);
		a++;
		System.out.println("A value post increment " + a);
		--a;
		System.out.println("A value pre decrement  " + a);
		++a;
		System.out.println("A value pre increment  " + a);
	}

	boolean isMerinPresentInList = false;

	public void findJerin() {
		for (int counter = 0; counter < listOfStudents.length; counter++) {
			if (listOfStudents[counter] == "Merin") {
				isMerinPresentInList = true;
				System.out.println("Merin name is in the list");
				break;
			}
		}

		if (!isMerinPresentInList) {
			System.out.println("Merin is not in the list");
		}
	}

	public void printAge() {
		for (int cnt = 5; cnt < 8; cnt++) {
			System.out.println(ageOfStudents[cnt]);
		}
	}

	public void attemptATM() {
		for (int i = 1; i <= 3; i++) {
			System.out.println("Wrong attempt");
		}
	}

	void sumOfEvenNumber() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("sum is: " + sum);

	}

}