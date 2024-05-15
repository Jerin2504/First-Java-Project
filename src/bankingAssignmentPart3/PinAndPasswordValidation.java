package bankingAssignmentPart3;

import java.util.Scanner;

import bankingAssignmentPart1.Person;

public final class PinAndPasswordValidation {

	private int numberOfAttempts = BankingConstants.zero;
	private final int numberOfAttempsAllowed = BankingConstants.numberOfAttempts;
	Scanner sc = new Scanner(System.in);

	public void validatePinAndPassword(int enteredOption) {

		Person customer = new Person("Tom", "4567", 1000.50);
		customer.setSavedPin(1234);;
		customer.setSavedPassword("abc123");
		
		if (enteredOption == BankingConstants.one) {
			System.out.println("Please enter your PIN ");
			int enteredPin = sc.nextInt();

			ATM atm = new ATM();
			
			if (!atm.validateAccount(enteredPin, customer)) {
				System.out.println("Incorrect Pin ");
				numberOfAttempts++;
				checkNumberOfAttempts(enteredOption);
			}
		} else if (enteredOption == BankingConstants.two) {

			System.out.println("Please enter your password ");
			String enteredPassword = sc.next();

			OnlineBanking ob = new OnlineBanking();

			if (!ob.validateAccount(enteredPassword, customer)) {
				System.out.println("Incorrect Password ");
				numberOfAttempts++;
				checkNumberOfAttempts(enteredOption);
			}
		} else {

			System.out.println("Please enter a valid option..");
		}
	}

	public void checkNumberOfAttempts(int enteredOption) {

		if (numberOfAttempts == numberOfAttempsAllowed) {
			System.out.println("You have reached the maximum allowed attempts. Your account is locked ");
		} else {
			System.out.println("You have " + (numberOfAttempsAllowed - numberOfAttempts) + " more attemps remaining. ");
			validatePinAndPassword(enteredOption);
		}
	}
}
