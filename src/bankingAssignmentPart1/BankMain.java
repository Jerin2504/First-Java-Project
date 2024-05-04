package bankingAssignmentPart1;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the corresponding option to avail the services:  ");
		System.out.println("1. ATM   |  2. Online Banking");

		int enteredOption = sc.nextInt();

		switch (enteredOption) {
		case 1:
			System.out.println("Please enter your PIN ");
			int enteredPin = sc.nextInt();

			BankOperations atm = new ATM();
			if (!atm.validateAccount(enteredPin)) {
				System.out.println("Incorrect Pin ");
			}
			break;

		case 2:
			System.out.println("Please enter your password ");
			String enteredPassword = sc.next();

			BankOperations ob = new OnlineBanking();
			if (!ob.validateAccount(enteredPassword)) {
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
