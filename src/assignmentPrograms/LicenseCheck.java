package assignmentPrograms;

public class LicenseCheck {

	int age;
	int currentLicenceLevel;

	// Checks eligibility of the applicant and suggests next test
	public void checkEligibilityAndIssueLicence() {

		if (age < 16) {
			System.out.println("You are not eligible to apply. You should be atleast 16 years old to qualify.");

		} else {
			if (currentLicenceLevel == 0) {
				System.out.println(
						"You are eligible for Knowledge Test. On successful completion you will be awarded G1 licence.");
			} else if (currentLicenceLevel == 1) {
				System.out.println(
						"You are eligible for G2 road test. On successful completion you will be awarded G2 licence.");
			} else if (currentLicenceLevel == 2) {
				System.out.println(
						"You are eligble for G road test. On successful completion you will be awarded G licence.");
			}
		}
	}

}
