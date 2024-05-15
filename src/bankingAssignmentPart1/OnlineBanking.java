package bankingAssignmentPart1;

public class OnlineBanking extends BankOperations {

	public final boolean validateAccount(String enterePassword, Person customer) {
		if ((customer.getSavedPassword()).equals(enterePassword)) {
			chooseAction(customer);
			return true;
		}
		return false;
	}

}
