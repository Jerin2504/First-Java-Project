package practiceSession;

public class YukonStriker {

	double height;
	double weight;

	public void checkEligibilityForYukon() {

		if (height >= 120 && weight >= 30) {
			System.out.println("You are eligible for YukonStriker Rider");
		} else {
			System.out.println("The minimum heigh and weight of the rider for Yukon Striker should be 120cm and 30Kg respectively.");
		}

	}

}
