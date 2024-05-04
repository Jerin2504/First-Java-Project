package bankingAssignmentPart3;

import java.util.Scanner;

public class PinAndPasswordValidation {

	private int numberOfAttempts = 0;
	private int numberOfAttempsAllowed = 3;
	Scanner sc = new Scanner(System.in);

	public void validatePinAndPassword(int enteredOption) {

		if (enteredOption == 1) {
			System.out.println("Please enter your PIN ");
			int enteredPin = sc.nextInt();

			ATM atm = new ATM();
			atm.customer = new Person();

			if (!atm.validateAccount(enteredPin)) {
				System.out.println("Incorrect Pin ");
				numberOfAttempts++;
				checkNumberOfAttempts(enteredOption);
			}
		} else if (enteredOption == 2) {

			System.out.println("Please enter your password ");
			String enteredPassword = sc.next();

			OnlineBanking ob = new OnlineBanking();
			ob.customer = new Person();

			if (!ob.validateAccount(enteredPassword)) {
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
			validatePinAndPassword(enteredOption);
		}
	}
}
