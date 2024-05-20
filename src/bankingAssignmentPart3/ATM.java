package bankingAssignmentPart3;

import java.util.Scanner;

import bankingAssignmentPart1.Person;

public class ATM extends BankingRules implements BankOperations {

	Scanner sc = new Scanner(System.in);

	private int maxNumberOfTransactions;
	private int dailyWithdrawalLimit;
	private int totalAmountWithdrawn;
	private int numberOfTransactions = BankingConstants.zero;

	public void chooseAction(Person customer) {

		if (!checkTransactionLimit()) {

			System.out.println("Please select the required action: ");
			System.out.println(
					"1. Withdraw  |  2. Deposit  |  3. View Balance |  4. View Transactions History  | 5. Exit ");
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
				TransactionHistory.displayLastTransactions();
				chooseAction(customer);
				break;

			case 5:
				System.out.println("Thank You !!!");
				break;

			default:
				System.out.println("Please select a valid option..");
				chooseAction(customer);
				break;
			}

			sc.close();

		} else {
			System.out.println("You have reached the maximum limit of transactions");
		}
	}

	@Override
	public void withdrawAmount(Person customer) {
		System.out.println("Please enter the amount you would like to withdraw: ");
		int withdrawAmount = sc.nextInt();

		if (withdrawAmount <= BankingConstants.zero) {
			System.out.println("Amount should be greater than zero..");
			chooseAction(customer);
			return;
		}

		if ((customer.getBalance() - withdrawAmount) < BankingConstants.minimumBalance) {
			System.out.println("Minimum balance of $" + BankingConstants.minimumBalance + " should be maintained");
			chooseAction(customer);
			return;
		}

		if ((withdrawAmount + totalAmountWithdrawn) > dailyWithdrawalLimit) {
			System.out.println("Your daily withdrawal limit is : " + dailyWithdrawalLimit + " . You can withdraw only $"
					+ (dailyWithdrawalLimit - totalAmountWithdrawn) + " today.");
			chooseAction(customer);
			return;
		}

		customer.setBalance(customer.getBalance() - withdrawAmount);
		totalAmountWithdrawn = totalAmountWithdrawn + withdrawAmount;

		generateTransactionDetails(BankingConstants.withdrawalOperation, withdrawAmount, customer.getBalance());

		numberOfTransactions++;
		viewBalance(customer);

	}

	@Override
	public void depositAmount(Person customer) {
		System.out.println("Please enter the amount you would like to deposit: ");
		int depositAmount = sc.nextInt();

		if (depositAmount <= BankingConstants.zero) {
			System.out.println("Amount should be greater than zero..");
			chooseAction(customer);
			return;
		}
		customer.setBalance(customer.getBalance() + depositAmount);

		generateTransactionDetails(BankingConstants.depositOperation, depositAmount, customer.getBalance());

		numberOfTransactions++;
		viewBalance(customer);

	}

	@Override
	public void viewBalance(Person customer) {

		System.out.println("Your current balance : $" + customer.getBalance());
		chooseAction(customer);
	}

	public void generateTransactionDetails(String transactionType, double transactionAmount, double balanceAmount) {
		Transaction transactionDetails = new Transaction();

		transactionDetails.setTransactionType(transactionType);
		transactionDetails.setTransactionAmount(transactionAmount);
		transactionDetails.setBalanceAmount(balanceAmount);
		TransactionHistory.storeLastTransactions(transactionDetails);

	}

	public boolean validateAccount(int enteredPin, Person customer) {
		if ((customer.getSavedPin()) == enteredPin) {
			chooseAction(customer);
			return true;
		}
		return false;
	}

	@Override
	public void bankingLimits() {
		maxNumberOfTransactions = BankingConstants.maxNumberOfTransactions;
		dailyWithdrawalLimit = BankingConstants.dailyWithdrawalLimit;

	}

	public boolean checkTransactionLimit() {
		bankingLimits();
		if (numberOfTransactions >= maxNumberOfTransactions) {
			return true;
		}
		return false;
	}

}
