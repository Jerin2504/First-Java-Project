package methodConcepts;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {

		Account jerinAccount = new Account();
		jerinAccount.accountNumber = "123456789";
		jerinAccount.nameOfAccountHolder = "Jerin Raj";
		jerinAccount.accountType = "Chequing";
		jerinAccount.balance = 4567.89;
		jerinAccount.pin = 1234;

//		String accountNumber = JerinAccount.getAccountNumber();
		System.out.println("Jerin Account :" + jerinAccount.getAccountNumber());

		Account ravneetAccount = new Account();
		ravneetAccount.accountNumber = "987654321";
		ravneetAccount.nameOfAccountHolder = "Ravneet Kaur";
		ravneetAccount.accountType = "Savings";
		ravneetAccount.balance = 56789.89;
		ravneetAccount.pin = 4321;

		Account[] accounts = { jerinAccount, ravneetAccount };

		// balance of jerinAccount
		System.out.println(accounts[0].getBalance());

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your account number");
		String accountNumEntered = sc.next();
		System.out.println("Enter your pin");
		int pinEntered = sc.nextInt();

	//	for (int i = 0; i < accounts.length; i++) {
	//		if (accounts[i].getAccountNumber().equals(accountNumEntered)) {
	//			boolean isPinValid = accounts[i].validatePin(pinEntered);
	//			if (isPinValid) {
	//				System.out.println("Account Holder name: " + accounts[i].getNameOfAccountHolder());
	//				System.out.println("Type of account: " + accounts[i].getAccountType());
	//				System.out.println("Balance: " + accounts[i].getBalance());
	//
	//			} else {
	//				System.out.println("Pin is not correct");
	//			}
	//			break;
	//		}
	//	}

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].validateCredentials(accountNumEntered, pinEntered)) {
				System.out.println("Account Holder name: " + accounts[i].getNameOfAccountHolder());
				System.out.println("Type of account: " + accounts[i].getAccountType());
				System.out.println("Balance: " + accounts[i].getBalance());
				break;
			} else {
				System.out.println("Account details are not correct");
			}
		}
		
		sc.close();
	}

}
