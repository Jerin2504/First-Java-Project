package bankingAssignmentPart2;

import java.util.Scanner;

import bankingAssignmentPart1.Person;

public class OnlineBanking extends BankOperations {
	private int numberOfAttempts;
	Scanner sc;

	public final boolean validateAccount(String enteredPassword, Person customer) {
		if ((customer.getSavedPassword()).equals(enteredPassword)) {
			chooseAction(customer);
			return true;
		}
		return false;
	}

	public void chooseAction(Person customer) {
		sc = new Scanner(System.in);
		System.out.println("Please select the required action: ");
		System.out.println("1. Withdraw  |  2. Deposit  |  3. View Balance |  4. Change Password  |  5. Exit ");
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
			System.out.println("Please enter an amount greater than zero ");
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
		System.out.println("Please enter your current password to continue or enter 'Q' to exit");
		String currentPassword = sc.next();

		if (currentPassword.equals("Q")) {
			System.out.println("Thank You !!!");
			chooseAction(customer);
			return;
		}

		if ((currentPassword.equals(customer.getSavedPassword())) && (numberOfAttempts < 3)) {
			System.out.println("Enter the new password");
			String enteredPassword = sc.next();

			if (enteredPassword.equals(currentPassword)) {
				System.out.println("New password should be different from the old password");
				changePinPassword(customer);
				return;
			}

			if (enteredPassword.length() < 8) {
				System.out.println("Password should be of minimum eight characters ");
				changePinPassword(customer);
				return;
			}

			if ((enteredPassword.contains("$")) || (enteredPassword.contains("@")) || (enteredPassword.contains("&"))) {
				System.out.println("Password should not contain '@' , '$', or '&' ");
				changePinPassword(customer);
				return;
			}
			customer.setSavedPassword(enteredPassword);
			System.out.println("Your password has been changed successfully ");
			chooseAction(customer);
			return;

		} else {
			if ((++numberOfAttempts) > 2) {
				System.out.println("You have reached the maximum attempts. Please try after 24 hrs");
				chooseAction(customer);
			} else {
				System.out.println("Incorrect password entered ..");
				changePinPassword(customer);
				return;
			}
		}

	}

}
