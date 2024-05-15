package bankingAssignmentPart1;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Person customer = new Person("Tom", "123456789", 1000.25);
		customer.setSavedPin(1234);
		customer.setSavedPassword("abc123");
		BankOperations bo;
		

		System.out.println("Enter the corresponding option to avail the services:  ");
		System.out.println("1. ATM   |  2. Online Banking");

		int enteredOption = sc.nextInt();

		switch (enteredOption) {
		case 1:
			System.out.println("Please enter your PIN ");
			int enteredPin = sc.nextInt();
			bo = new ATM();

			if (!((ATM)bo).validateAccount(enteredPin, customer)) {
				System.out.println("Incorrect Pin ");
			}
			break;

		case 2:
			System.out.println("Please enter your password ");
			String enteredPassword = sc.next();
			bo = new OnlineBanking();
			
			if (!((OnlineBanking)bo).validateAccount(enteredPassword, customer)) {
				System.out.println("Incorrect Password ");
			}
			break;

		default:
			System.out.println("Please enter a valid option..");
			break;
		}

		sc.close();
	}

}
