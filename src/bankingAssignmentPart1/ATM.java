package bankingAssignmentPart1;

public class ATM extends BankOperations {

	public boolean validateAccount(int enteredPin) {
		if ((customer.getSavedPin()) == enteredPin) {
			chooseAction();
			return true;
		}
		return false;
	}
}
