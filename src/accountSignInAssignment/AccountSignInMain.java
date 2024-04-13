package accountSignInAssignment;

import java.util.Scanner;

public class AccountSignInMain {

	public static void main(String[] args) {

		AccountSignIn as = new AccountSignIn();
		Scanner sc = new Scanner(System.in);

		for (int i = as.maxAttempt; i > 0; i--) {

			if (i != as.maxAttempt) {
				System.out.println("Incorrect username or password. You have " + i + " more attempts");
			}

			// Receive username and password
			System.out.println("Enter your username: ");
			as.enteredUsername = sc.next();
			System.out.println("Enter your password: ");
			as.enteredPassword = sc.next();

			as.checkCredentials();

			if (as.loginAttemptFailed == as.maxAttempt) {
				System.out.println("Account Locked");
			}

			// check the login is successful and break the loop
			if (as.isLoginSuccesful) {
				break;
			}

		}

		sc.close();

	}

}
