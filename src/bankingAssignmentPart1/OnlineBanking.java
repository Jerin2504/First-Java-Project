package bankingAssignmentPart1;

public class OnlineBanking extends BankOperations{
	
	public boolean validateAccount(String enterePassword) {
		if ((customer.getSavedPassword()).equals(enterePassword)) {
			chooseAction();
			return true;
		}
		return false;
	}

}
