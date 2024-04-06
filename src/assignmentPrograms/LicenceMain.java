package assignmentPrograms;

import java.util.Scanner;

public class LicenceMain {

	public static void main(String[] args) {

		LicenseCheck lc = new LicenseCheck();

		// To get input values from the console
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your age");
		lc.age = scanner.nextInt();

		System.out.println("Enter the corresponding option for current licence level : ");
		System.out.println("0 : New applicant | 1 : G1 | 2 : G2 ");
		lc.currentLicenceLevel = scanner.nextInt();

		lc.checkEligibilityAndIssueLicence();

		scanner.close();
	}

}
