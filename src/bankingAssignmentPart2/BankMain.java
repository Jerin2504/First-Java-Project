package bankingAssignmentPart2;

import java.util.Scanner;
import bankingAssignmentPart1.Person;

public class BankMain {

	public static void main(String[] args) {

		System.out.println("Enter the corresponding option to avail the services:  ");
		System.out.println("1. ATM   |  2. Online Banking");
		Scanner sc = new Scanner(System.in);
		int enteredOption = sc.nextInt();

		Person customer = new Person("Tom", "12345", 1000.25);
		customer.setSavedPin(1234);
		customer.setSavedPassword("abc123");

		switch (enteredOption) {
		case 1:
			System.out.println("Please enter your PIN ");
			int enteredPin = sc.nextInt();
			ATM atm = new ATM();

			if (!(atm.validateAccount(enteredPin, customer))) {
				System.out.println("Incorrect Pin ");
			}

			break;

		case 2:
			System.out.println("Please enter your password ");
			String enteredPassword = sc.next();
			OnlineBanking ob = new OnlineBanking();

			if (!(ob.validateAccount(enteredPassword, customer))) {
				System.out.println("Incorrect Password ");
			}

			break;
		default:
			System.out.println("Please enter valid options..");
			break;
		}

		sc.close();

	}

}
