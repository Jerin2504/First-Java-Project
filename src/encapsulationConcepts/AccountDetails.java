package encapsulationConcepts;

public class AccountDetails {

	private String accountNumber;
	private int pinNumber;
	private double balance;

	public AccountDetails(String accountNumber, int pinNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.pinNumber = pinNumber;
		this.balance = balance;
	}

	public String getAccountNumber(int pinNumber) {
		if (validatePin(pinNumber)) {
			return accountNumber;
		}
		return " ";
	}

	public double getBalance(int pinNumber) {
		if (validatePin(pinNumber)) {
			return balance;
		}
		return 0;
	}

	public void setPinNumber(int pinNumber, int pinEntered) {
		if (validatePin(pinEntered)) {
			this.pinNumber = pinNumber;
		} else {
			System.out.println("Pin is not correct");
		}
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public boolean validatePin(int pinNumber) {
		if (this.pinNumber == pinNumber) {
			return true;
		}
		return false;
	}

}
