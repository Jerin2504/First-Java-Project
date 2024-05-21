package missionMarsProject;

public class R2 extends Rocket {

	private double costOfR2;
	private double weightOfR2;
	public final double maximumWeight = 29000;

	public R2(double costOfR1, double weightOfR1) {
		super();
		this.costOfR2 = costOfR1;
		this.weightOfR2 = weightOfR1;
	}

	public double getCostOfR1() {
		return costOfR2;
	}

	public void setCostOfR1(double costOfR1) {
		this.costOfR2 = costOfR1;
	}

	public double getWeightOfR1() {
		return weightOfR2;
	}

	public void setWeightOfR1(double weightOfR1) {
		this.weightOfR2 = weightOfR1;
	}

	@Override
	public boolean launch() {
		double launchExplosionProbability = (RocketConstants.r2launchExplosionPercentage * (cargoWeight / calculateMaxCargoWeight()));
		double threshold = R1.generateRandomNumber() / 1000;
		System.out.println("Launching R2....");
		System.out.format("Launch Explosion Probability: " + "%.3f", launchExplosionProbability);
		System.out.format("   Threshold: " + "%.3f %n", threshold);
		if (launchExplosionProbability < threshold) {
			System.out.println("Launch successful!");
			return true;
		}
		System.out.println("Launch failed........");
		return false;
	}

	@Override
	public boolean land() {
		double landingCrashProbability = (RocketConstants.r2LandingCrashPercentage * (cargoWeight / calculateMaxCargoWeight()));
		double threshold = R1.generateRandomNumber() / 1000;
		System.out.println("Landing R2....");
		System.out.format("Landing Explosion Probability: " + "%.3f", landingCrashProbability);
		System.out.format("   Threshold: " + "%.3f %n", threshold);
		if (landingCrashProbability < R1.generateRandomNumber()) {
			System.out.println("Landing successful!!!  ....R2 on Mars....");
			return true;
		}
		System.out.println("Landing Failed........");
		return false;
	}

	public double calculateMaxCargoWeight() {
		return (maximumWeight - weightOfR2);
	}

}
