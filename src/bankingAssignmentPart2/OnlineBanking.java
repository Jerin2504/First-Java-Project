package bankingAssignmentPart2;

import java.util.Scanner;

public class OnlineBanking extends BankOperations {

	@Override
	public void changePinPassword() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your current password to continue or type Q to exit");
		String currentPassword = sc.next();

		if (!(currentPassword.equals("Q"))) {
			if (currentPassword.equals(customer.getSavedPassword())) {
				System.out.println("Enter the new password");
				String enteredPassword = sc.next();

				if (!enteredPassword.equals(currentPassword)) {
					if (validatePassword(enteredPassword)) {
						customer.setSavedPassword(enteredPassword);
						System.out.println("Your password has been changed successfully ");
					}
				} else {
					System.out.println("New password cannot be same as the old password");
					changePinPassword();
				}
			} else {
				System.out.println("Incorrect password entered ..");
				changePinPassword();
			}
		}
		sc.close();
	}

	public boolean validatePassword(String enteredPassword) {
		if (enteredPassword.length() >= 8) {
			if ((!enteredPassword.contains("&")) && (!enteredPassword.contains("$"))
					&& (!enteredPassword.contains("@"))) {
				return true;
			} else {
				System.out.println("Password should not contain : & , $ , and @ ");
				changePinPassword();
			}
		} else {
			System.out.println("Password should be of atleast eight characaters");
			changePinPassword();
		}
		return false;
	}

}
