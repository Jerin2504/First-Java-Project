package methodConcepts;

public class Account {
	
	String nameOfAccountHolder;
	String accountType;
	String accountNumber;
	
	double balance;
	int pin;
	
	public String getNameOfAccountHolder() {
		return nameOfAccountHolder;
	}

	public String getAccountType() {
		return accountType;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public int getPin() {
		return pin;
	}
	
	public boolean validatePin(int pinEntered) {
		if(pin == pinEntered) {
			return true;
		}
			return false;
	}
	
	public boolean validateCredentials(String accountNumberEntered, int pinEntered) {
		
		if(accountNumber.equals(accountNumberEntered)) {
			if(validatePin(pinEntered)) {
				return true;
			}
			
		}
		return false;
	}
	
}
