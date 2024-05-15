package bankingAssignmentPart1;

public class Person {

	private String nameOfAccountHolder;
	private String accountNumber;
	private double balance;
	private int savedPin;
	private String savedPassword;
	
	
	public Person(String nameOfAccountHolder, String accountNumber, double balance) {
		super();
		this.nameOfAccountHolder = nameOfAccountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getNameOfAccountHolder() {
		return nameOfAccountHolder;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
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
	
	public void setSavedPin(int savedPin) {
		this.savedPin = savedPin;
	}
	
	public void setSavedPassword(String savedPassword) {
		this.savedPassword = savedPassword;
	}

}
