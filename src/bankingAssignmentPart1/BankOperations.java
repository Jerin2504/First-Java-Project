package bankingAssignmentPart1;

import java.util.Scanner;

public class BankOperations {

	Scanner sc = new Scanner(System.in);

	public void chooseAction(Person customer) {

		System.out.println("Please select the required action: ");
		System.out.println("1. Withdraw  |  2. Deposit  |  3. View Balance |  4. Exit ");
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
			System.out.println("Thank You !!!");
			break;

		default:
			System.out.println("Please select a valid option..");
			chooseAction(customer);
			break;
		}

		sc.close();
	}

	public void withdrawAmount(Person customer) {
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
		System.out.println("Please enter the amount you would like to deposit: ");
		int depositAmount = sc.nextInt();
		
		if(depositAmount <= 0) {
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

}
