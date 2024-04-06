package conditionalStatements;

public class ATMMain {

	public static void main(String[] args) {

		ATM atm = new ATM();

		atm.balance = 4567.89;
		atm.withdrawalAmount = 5000;
		atm.overdraftAmount = 6000;
		
		atm.actualPin = 4567;
		atm.enteredPin = 4576;

		atm.withdrawMoneyFromATM();
		atm.validatePinAndWithdrawMoney();

	}

}
