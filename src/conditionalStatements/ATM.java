package conditionalStatements;

public class ATM {

	double balance;
	double overdraftAmount;
	int withdrawalAmount;
	int enteredPin;
	int actualPin;
	boolean isPinValid;

	// balance > amount entered (OR) overdraft amount > amount enterd : Customer can
	// withdraw the amount

	void withdrawMoneyFromATM() {
		// boolean isBalanceEnough = (balance > amountEntered) || (overdraftAmount >
		// amountEntered)

		if ((balance > withdrawalAmount) || (overdraftAmount > withdrawalAmount)) {
			System.out.println("Customer can withdraw the amount");
		} else {
			System.out.println("Customer does not have enough balance");
		}

	}

	void validatePinAndWithdrawMoney() {

		isPinValid = enteredPin == actualPin;

		// condition to validate if PIN is valid
		if (isPinValid) {
			System.out.println("PIN is correct");

			// condition to validate the withdrawal amount
			if ((balance > withdrawalAmount) || (overdraftAmount > withdrawalAmount)) {
				System.out.println("Customer can withdraw the amount");
			} else {
				System.out.println("Customer does not have enough balance");
			}

		} else {
			System.out.println("PIN is incorrect");

		}
	}

}
