package bankingAssignmentPart3;

import java.util.Scanner;

public class ATM extends BankingRules implements BankOperations {

	Person customer;
	Scanner sc = new Scanner(System.in);

	private int maxNumberOfTransactions;
	private int dailyWithdrawalLimit;
	private int totalAmountWithdrawn;
	private int numberOfTransactions = 0;

	public void chooseAction() {

		if (!checkTransactionLimit()) {

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

		} else {
			System.out.println("You have reached the maximum limit of transactions");
		}
	}

	@Override
	public void withdrawAmount() {
		System.out.println("Please enter the amount you would like to withdraw: ");
		int withdrawAmount = sc.nextInt();

		if ((withdrawAmount + totalAmountWithdrawn) < dailyWithdrawalLimit) {
			if (withdrawAmount < customer.getBalance()) {
				customer.setBalance(customer.getBalance() - withdrawAmount);
				totalAmountWithdrawn = totalAmountWithdrawn + withdrawAmount;
				numberOfTransactions++;
				System.out.println("Your current balance : " + customer.getBalance());
			} else {
				System.out.println("Please enter an amount less than your current balance..");
			}
		} else {
			System.out.println("Your daily withdrawal limit is : " + dailyWithdrawalLimit + " . You can withdraw only "
					+ (dailyWithdrawalLimit - totalAmountWithdrawn) + " today.");
		}
		chooseAction();
	}

	@Override
	public void depositAmount() {
		System.out.println("Please enter the amount you would like to deposit: ");
		int depositAmount = sc.nextInt();

		customer.setBalance(customer.getBalance() + depositAmount);
		System.out.println("Your current balance : " + customer.getBalance());

		numberOfTransactions++;
		chooseAction();

	}

	@Override
	public void viewBalance() {

		System.out.println("Your current balance : " + customer.getBalance());

		numberOfTransactions++;
		chooseAction();
	}

	public boolean validateAccount(int enteredPin) {
		if ((customer.getSavedPin()) == enteredPin) {
			chooseAction();
			return true;
		}
		return false;
	}

	@Override
	public void bankingLimits() {
		maxNumberOfTransactions = 3;
		dailyWithdrawalLimit = 1000;

	}

	public boolean checkTransactionLimit() {
		bankingLimits();
		if (numberOfTransactions >= maxNumberOfTransactions) {
			return true;
		}
		return false;
	}

}
