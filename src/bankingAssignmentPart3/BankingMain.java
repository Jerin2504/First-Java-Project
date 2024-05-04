package bankingAssignmentPart3;

import java.util.Scanner;

public class BankingMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the corresponding option to avail the services:  ");
		System.out.println("1. ATM   |  2. Online Banking");

		int enteredOption = sc.nextInt();

		PinAndPasswordValidation pv = new PinAndPasswordValidation();
		pv.validatePinAndPassword(enteredOption);

		sc.close();

	}


}
