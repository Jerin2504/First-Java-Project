package abstractionConcept;

public class CIBC extends NationalBank implements Brokerage{

	@Override
	public void interestOnSaving() {
		System.out.println("Interest rate is 5.5%");
		
	}
	
	public void provideLoan() {
		System.out.println("Provide loans starting from prime rate 5.25%");
	}
	
	public void bankDetails() {
		System.out.println("Toronto Branch");
	}

	@Override
	public void buyStocks() {
		
		
	}

	@Override
	public void sellStocks() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void chargeForEachTransaction() {
		System.out.println("Charge 100 dollars");
		
	}

}
 