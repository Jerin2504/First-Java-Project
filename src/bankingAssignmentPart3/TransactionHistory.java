package bankingAssignmentPart3;

import java.util.ArrayList;

public class TransactionHistory {

	static ArrayList<Transaction> transactionsList = new ArrayList<Transaction>();

	public static void storeLastTransactions(Transaction transactionDetails) {

		transactionsList.add(transactionDetails);
	}

	public static void displayLastTransactions() {

		System.out.println("Transaction  |  Transaction Amount   |   Balance  ");
		System.out.println("--------------------------------------------------");

		String transactionSign;

		for (int i = 0; i < transactionsList.size(); i++) {
			if ((transactionsList.get(i).getTransactionType()).equals(BankingConstants.depositOperation)) {
				transactionSign = BankingConstants.positive;
			} else {
				transactionSign = BankingConstants.negative;
			}

			System.out.format("%-13s %-2s %-21.2f %-12.2f", transactionsList.get(i).getTransactionType(),
					transactionSign, transactionsList.get(i).getTransactionAmount(),
					transactionsList.get(i).getBalanceAmount());
			System.out.println();

		}

		System.out.println("--------------------------------------------------");

	}
}
