package abstractionConcept;

public class BankMain {

	public static void main(String[] args) {
		
		NationalBank cibc = new CIBC();
		cibc.interestOnSaving();
		cibc.provideLoan();
		

	}

}
