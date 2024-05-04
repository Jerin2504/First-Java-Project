package bankingAssignmentPart3;

public class Person {

	private String nameOfAccountHolder;
	private String accountNumber;
	private double balance = 1000.25;
	private int savedPin = 1234;
	private String savedPassword = "abc123";

	public int getSavedPin() {
		return savedPin;
	}

	public String getSavedPassword() {
		return savedPassword;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}

}
