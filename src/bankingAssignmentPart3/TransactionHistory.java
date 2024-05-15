package bankingAssignmentPart3;

public class TransactionHistory {

	private static String[] previousTransactionTypes = new String[BankingConstants.numberOfPreviousTransactions];
	private static double[] previousTransactionAmounts = new double[BankingConstants.numberOfPreviousTransactions];
	private static double[] previousBalanceAmounts = new double[BankingConstants.numberOfPreviousTransactions];

	public static String transactionType;
	public static double transactionAmount;
	public static double balanceAmount;

	public static void storeLastTransactions() {
		for (int i = 1; i < previousTransactionTypes.length; i++) {
			previousTransactionTypes[i - 1] = previousTransactionTypes[i];
			previousTransactionAmounts[i - 1] = previousTransactionAmounts[i];
			previousBalanceAmounts[i - 1] = previousBalanceAmounts[i];
		}
		previousTransactionTypes[previousTransactionTypes.length - 1] = transactionType;
		previousTransactionAmounts[previousTransactionAmounts.length - 1] = transactionAmount;
		previousBalanceAmounts[previousBalanceAmounts.length - 1] = balanceAmount;
	}

	public static void displayLastTransactions() {

		System.out.println("Transaction  |  Transaction Amount   |   Balance  ");
		System.out.println("--------------------------------------------------");

		String transactionSign;
		for (int i = 0; i < previousTransactionTypes.length; i++) {
			if (previousTransactionTypes[i] != null) {
				if (previousTransactionTypes[i].equals(BankingConstants.depositOperation)) {
					transactionSign = BankingConstants.positive;
				} else {
					transactionSign = BankingConstants.negative;
				}

				System.out.format("%-13s %-2s %-21.2f %-12.2f", previousTransactionTypes[i], transactionSign,
						previousTransactionAmounts[i], previousBalanceAmounts[i]);
				System.out.println();

			}
		}
		System.out.println("--------------------------------------------------");

	}
}
