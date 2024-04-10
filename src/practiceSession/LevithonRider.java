package practiceSession;

public class LevithonRider {
	
	double height;
	double weight;

	public void checkEligibilityForLevithon() {
			
		if (height >= 110 && weight >= 40) {
			System.out.println("You are eligible for Levithon Rider");
		} else {
			System.out.println("The minimum heigh and weight of the rider for Levithon should be 110cm and 40 kg respectivley.");
		}

	}
}