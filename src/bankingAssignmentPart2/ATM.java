package bankingAssignmentPart2;

import java.util.Scanner;

import bankingAssignmentPart1.Person;

public class ATM extends BankOperations {
	private int numberOfAttempts;
	Scanner sc;

	public final boolean validateAccount(int enteredPin, Person customer) {
		if ((customer.getSavedPin()) == enteredPin) {
			chooseAction(customer);
			return true;
		}
		return false;
	}

	public void chooseAction(Person customer) {
		sc = new Scanner(System.in);
		System.out.println("Please select the required action: ");
		System.out.println("1. Withdraw  |  2. Deposit  |  3. View Balance |  4. Change Pin  |  5. Exit ");
		int enteredOption = sc.nextInt();

		switch (enteredOption) {
		case 1:
			withdrawAmount(customer);
			break;

		case 2:
			depositAmount(customer);
			break;

		case 3:
			viewBalance(customer);
			break;

		case 4:
			changePinPassword(customer);
			break;

		case 5:
			System.out.println("Thank You !!!");
			break;

		default:
			System.out.println("Please select a valid option..");
			chooseAction(customer);
			break;
		}
	}

	public void withdrawAmount(Person customer) {
		sc = new Scanner(System.in);
		System.out.println("Please enter the amount you would like to withdraw: ");
		int withdrawAmount = sc.nextInt();

		if (withdrawAmount <= 0) {
			System.out.println("The withdrawal amount should be greater than zero.");
			chooseAction(customer);
			return;
		}

		if (withdrawAmount > customer.getBalance()) {
			System.out.println("Please enter an amount less than your current balance..");
			chooseAction(customer);
			return;
		}

		customer.setBalance(customer.getBalance() - withdrawAmount);
		System.out.println("Your current balance : $" + customer.getBalance());

		chooseAction(customer);
		return;
	}

	public void depositAmount(Person customer) {
		sc = new Scanner(System.in);
		System.out.println("Please enter the amount you would like to deposit: ");
		int depositAmount = sc.nextInt();

		if (depositAmount <= 0) {
			System.out.println("Please enter an amount greater than zero");
			chooseAction(customer);
			return;
		}
		customer.setBalance(customer.getBalance() + depositAmount);
		System.out.println("Your current balance : $" + customer.getBalance());

		chooseAction(customer);
		return;

	}

	public void viewBalance(Person customer) {

		System.out.println("Your current balance : $" + customer.getBalance());

		chooseAction(customer);
		return;
	}

	@Override
	public void changePinPassword(Person customer) {
		sc = new Scanner(System.in);
		System.out.println("Please enter your current PIN to continue or enter 0 to exit");
		int currentPin = sc.nextInt();

		if (currentPin == 0) {
			chooseAction(customer);
			return;
		}

		if ((currentPin == customer.getSavedPin()) && (numberOfAttempts < 3)) {
			System.out.println("Enter the new PIN");
			int enteredPin = sc.nextInt();

			if (enteredPin == currentPin) {
				System.out.println("New PIN should be different from the old PIN");
				changePinPassword(customer);
				return;
			}

			if (enteredPin < 1000) {
				System.out.println("Pin should be atleast of 4 digits ");
				changePinPassword(customer);
				return;
			}
			customer.setSavedPin(enteredPin);
			System.out.println("Your PIN has been changed successfully ");
			chooseAction(customer);
			return;

		} else {
			if ((++numberOfAttempts) > 2) {
				System.out.println("You have reached the maximum attempts. Please try after 24 hrs");
				chooseAction(customer);
			} else {
				System.out.println("Incorrect Pin entered ..");
				changePinPassword(customer);
				return;
			}
		}

	}
}
