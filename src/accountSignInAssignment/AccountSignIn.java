package accountSignInAssignment;

public class AccountSignIn {
	/*
	 * Write a program which takes username and password from user via console and
	 * compares it with a user name and password saved in your class. Saved user id
	 * and password are as below If the username and password entered by user
	 * matches with the one saved in your class, then print “You are logged in to
	 * the application“ other wise print “Incorrect User id or password. Try again”.
	 * Also a user gets 3 chances enter the correct user name and password. If the
	 * user enters incorrect user name or password more than 3 times then print “
	 * Account locked”
	 */

	String savedUsername = "pivotAdmin";
	String savedPassword = "Admin123";
	String enteredUsername;
	String enteredPassword;
	int loginAttemptFailed = 0;
	int maxAttempt = 3;
	boolean isLoginSuccesful = false;

	public void checkCredentials() {

		if ((savedUsername.equals(enteredUsername)) && (savedPassword.equals(enteredPassword))) {
			isLoginSuccesful = true;
			System.out.println("Login successful..");
		} else {
			loginAttemptFailed++;
		}

	}

}
