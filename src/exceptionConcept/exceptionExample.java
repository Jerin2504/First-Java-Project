package exceptionConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import collectionsConcepts.Transaction;

public class exceptionExample {

	public static void main(String[] args) {

	//	String str = null;

	//	System.out.println(str.charAt(0));

		List<Transaction> finTransactions = new ArrayList<Transaction>();

		Scanner sc = new Scanner(System.in);
		int i = 0;

		while (i < 3) {

			Transaction transaction = null;

			System.out.println("Enter the transaction type");
			String transactionType = sc.next();

			System.out.println("Enter the transaction amount");
			double amount = sc.nextDouble();

			if (!transactionType.equalsIgnoreCase("viewBalance")) {
				transaction = new Transaction(transactionType, amount, 1000);
			}

			finTransactions.add(transaction);
			i++;

		}

		for (Transaction trans : finTransactions) {
			System.out.println(trans.toString());
		}
		sc.close();
	}

}
