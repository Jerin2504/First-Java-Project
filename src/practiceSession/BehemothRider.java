package practiceSession;

public class BehemothRider {

	double height;
	double weight;

	public void checkEligibilityForBehemoth() {

		if (height >= 150 && weight >= 40) {
			System.out.println("You are eligible for Behemoth Rider");
		} else {
			System.out.println("The minimum heigh and weight of the rider for Behemoth should be 150cm and 40 kg respectively.");
		}

	}

}
