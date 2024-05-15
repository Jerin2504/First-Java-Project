package bankingAssignmentPart3;

import bankingAssignmentPart1.Person;

public interface BankOperations {
	
	public void withdrawAmount(Person customer);
	
	public void depositAmount(Person customer);
	
	public void viewBalance(Person customer);

}
