package bankingAssignmentPart1;

import java.util.Scanner;

public class BankOperations {

	Person customer = new Person();
	Scanner sc = new Scanner(System.in);

	public void chooseAction() {

		System.out.println("Please select the required action: ");
		System.out.println("1. Withdraw  |  2. Deposit  |  3. View Balance |  4. Exit ");
		int enteredOption = sc.nextInt();

		switch (enteredOption) {
		case 1:
			withdrawAmount();
			break;

		case 2:
			depositAmount();
			break;

		case 3:
			viewBalance();
			break;

		case 4:
			System.out.println("Thank You !!!");
			break;

		default:
			System.out.println("Please select a valid option..");
			chooseAction();
			break;
		}

		sc.close();
	}

	public void withdrawAmount() {
		System.out.println("Please enter the amount you would like to withdraw: ");
		int withdrawAmount = sc.nextInt();

		if (withdrawAmount < customer.getBalance()) {
			customer.setBalance(customer.getBalance() - withdrawAmount);
			System.out.println("Your current balance : " + customer.getBalance());
		} else {
			System.out.println("Please enter an amount less than your current balance..");
		}
		chooseAction();
	}

	public void depositAmount() {
		System.out.println("Please enter the amount you would like to deposit: ");
		int depositAmount = sc.nextInt();

		customer.setBalance(customer.getBalance() + depositAmount);
		System.out.println("Your current balance : " + customer.getBalance());

		chooseAction();

	}

	public void viewBalance() {

		System.out.println("Your current balance : " + customer.getBalance());

		chooseAction();
	}

	public boolean validateAccount(String enterePassword) {
		if ((customer.getSavedPassword()).equals(enterePassword)) {
			chooseAction();
			return true;
		}
		return false;
	}

	public boolean validateAccount(int enteredPin) {
		if ((customer.getSavedPin()) == enteredPin) {
			chooseAction();
			return true;
		}
		return false;
	}

}
