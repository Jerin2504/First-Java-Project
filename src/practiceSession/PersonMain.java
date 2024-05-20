package practiceSession;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonMain {
	private static final int numberOfpeople = 3;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Person> personList = new ArrayList<Person>();

		for (int i = 0; i < numberOfpeople; i++) {
			Person person = new Person();
			System.out.println("Enter the name of perosn :" + (i + 1));
			person.setName(sc.next());

			System.out.println("Enter the age of person :" + (i + 1));
			person.setAge(sc.nextInt());

			personList.add(person);
		}

		System.out.println("Enter the name of the perosn to search :");
		String name = sc.next();

		for (Person personValidation : personList) {
			if (personValidation.getName().equals(name)) {
				System.out.println(name + " is found ");
			}  else {
				System.out.println("Not in the list");
			}
		}
		sc.close();
	}
}
