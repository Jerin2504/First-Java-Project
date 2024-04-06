package practiceSession;

public class AccountHolderDetails {
	// Customer and account details
	String customerName;
	String accountType;
	double accountBalance;
	int minimumBalance;
	boolean result = false;

	// To check whether the account balance is greater than or equal to the required
	// minimum balance
	public void isAcctBalanceGreaterThanOrEqualtToMinBalance() {

		result = accountBalance >= minimumBalance;
		System.out
				.println("Account Balance of " + customerName + " is greater than minimum required balance: " + result);
	}

	// To check whether the account balance is greater than zero
	public void isAcctBalanceGreaterThanZero() {

		result = accountBalance > 0;
		System.out.println("Account Balance of " + customerName + " is greater than zero: " + result);
	}

	public void validateAccountHasMinBalance() {

		// Check minimum balance criteria is fulfilled
		if (accountBalance >= minimumBalance) {
			System.out.println(customerName + " has met the required minimum balance criteria");
		} else {
			System.out.println("Account Balance of " + customerName + " is insufficinet");

			// Check account balance is not zero
			if (accountBalance > 0) {
				System.out.println("Account Balance of " + customerName + " is greater than zero");
			} else {
				System.out.println(
						"Please maintain an account balance of greater than zero or the account may be suspended");
			}
		}
	}

}
