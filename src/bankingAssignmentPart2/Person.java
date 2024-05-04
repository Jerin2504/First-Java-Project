package bankingAssignmentPart2;

public class Person {

	private String nameOfAccountHolder;
	private String accountNumber;
	private double balance;
	private int savedPin = 1234;
	private String savedPassword = "abc123";

	public Person(String nameOfAccountHolder, String accountNumber, double balance) {
		super();
		this.nameOfAccountHolder = nameOfAccountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public int getSavedPin() {
		return savedPin;
	}

	public void setSavedPin(int savedPin) {
		this.savedPin = savedPin;
	}

	public String getSavedPassword() {
		return savedPassword;
	}

	public void setSavedPassword(String savedPassword) {
		this.savedPassword = savedPassword;
	}

}
