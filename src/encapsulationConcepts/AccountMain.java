package encapsulationConcepts;

public class AccountMain {

	public static void main(String[] args) {
	
		
		AccountDetails ad = new AccountDetails("58462", 5842, 500);
		
		System.out.println("Account Number: "+ ad.getAccountNumber(5842));
		
		ad.setPinNumber(2451,5842);
		
		System.out.println("Balance : " + ad.getBalance(2451));

	}

}
