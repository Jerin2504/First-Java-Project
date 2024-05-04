package bankingAssignmentPart2;

import java.util.Scanner;

public class ATM extends BankOperations {
	


	@Override
	public void changePinPassword() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your current PIN to continue or enter 0 to exit");
		int currentPin = sc.nextInt();

		if(currentPin != 0) {
		if (currentPin == customer.getSavedPin()) {
			System.out.println("Enter the new PIN");
			int enteredPin = sc.nextInt();
			
			if (enteredPin != currentPin) {
				if (enteredPin > 999) {
					customer.setSavedPin(enteredPin);
					System.out.println("Your PIN has been changed successfully ");
				} else {
					System.out.println("Pin should be atleast of 4 digits ");
					changePinPassword();
				}
			} else {
				System.out.println("New PIN should be different from the old PIN");
				changePinPassword();
			}
		} else {
			System.out.println("Incorrect Pin entered ..");
			changePinPassword();
		}
		}
		sc.close();
	}
	
}
