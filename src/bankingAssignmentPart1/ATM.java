package bankingAssignmentPart1;

public class ATM extends BankOperations {

	public final boolean validateAccount(int enteredPin, Person customer) {
		if ((customer.getSavedPin()) == enteredPin) {
			chooseAction(customer);
			return true;
		}
		return false;
	}

}
