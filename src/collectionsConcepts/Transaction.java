package collectionsConcepts;

public class Transaction {
	
	private String transactionType;
	private double transactionAmount;
	private double balanceAmount;
	
	public Transaction(String transactionType, double transactionAmount, double balanceAmount) {
		super();
		this.transactionType = transactionType;
		this.transactionAmount = transactionAmount;
		this.balanceAmount = balanceAmount;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public double getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public double getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	@Override
	public String toString() {
		return "Transaction [transactionType=" + transactionType + ", transactionAmount=" + transactionAmount
				+ ", balanceAmount=" + balanceAmount + "]";
	}
	
	
	

}
