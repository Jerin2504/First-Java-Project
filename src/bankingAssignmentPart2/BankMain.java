package bankingAssignmentPart2;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {

		System.out.println("Select the required option: ");
		System.out.println("1. Change PIN  |  2. Change password");

		Scanner sc = new Scanner(System.in);
		int enteredOption = sc.nextInt();

		switch (enteredOption) {
		case 1:
			ATM atm = new ATM();
			atm.customer = new Person("Tom", "3425", 1000);
			atm.changePinPassword();
			break;

		case 2:
			OnlineBanking ob = new OnlineBanking();
			ob.customer = new Person("Tom", "3425", 1000);
			ob.changePinPassword();
			break;

		default:
			System.out.println("Please enter valid options..");
			break;
		}

		sc.close();

	}

}
