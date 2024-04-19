package methodConcepts;

public class FidoPlans {

	String planName;
	String validity;

	double baseAmount;
	double tax = 5;
	double finalAmount;
	double internetUsage;

	int freeMins;

	public FidoPlans(String plan, String validityDays, double baseAmt, int freeMinutes, double internet) {
		planName = plan;
		validity = validityDays;
		baseAmount = baseAmt;
		freeMins = freeMinutes;
		internetUsage = internet;
	}

	public FidoPlans() {

	}

	public String getPlanName() {
		return planName;
	}

	public String getValidity() {
		return validity;
	}

	public double getBaseAmount() {
		return baseAmount;
	}

	public double getTax() {
		return tax;
	}

	public double getInternetUsage() {
		return internetUsage;
	}

	public int getFreeMinutes() {
		return freeMins;
	}

	public double calculateFinalAmount() {
		finalAmount = baseAmount + ((tax * baseAmount) / 100);
		return finalAmount;
	}

	public FidoPlans getPlanDetails(String currentPlan, FidoPlans[] fidoPlans) {
		for (int i = 0; i < fidoPlans.length; i++) {
			if (fidoPlans[i].getPlanName().equals(currentPlan)) {
				return fidoPlans[i];
			}

		}
		return null;

	}

	public void displayPlanDetails() {
		System.out.println("*** Existing Plan Details***");
		System.out.println("Plan Name: " + getPlanName());
		System.out.println("Validity: " + getValidity());
		System.out.println("Internet: " + getInternetUsage() + "GB");
		System.out.println("Free Mins: " + getFreeMinutes());
		System.out.println("Amount: $" + calculateFinalAmount());
	}

}
