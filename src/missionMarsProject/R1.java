package missionMarsProject;

import java.util.Random;

public class R1 extends Rocket {

	private double costOfR1;
	private double weightOfR1;
	public final double maximumWeight = 18000;

	public R1(double costOfR1, double weightOfR1) {
		super();
		this.costOfR1 = costOfR1;
		this.weightOfR1 = weightOfR1;
	}

	public double getCostOfR1() {
		return costOfR1;
	}

	public void setCostOfR1(double costOfR1) {
		this.costOfR1 = costOfR1;
	}

	public double getWeightOfR1() {
		return weightOfR1;
	}

	public void setWeightOfR1(double weightOfR1) {
		this.weightOfR1 = weightOfR1;
	}

	@Override
	public boolean launch() {
		double launchExplosionProbability = (RocketConstants.r1LaunchExplosionPercentage * (cargoWeight / calculateMaxCargoWeight()));
		double threshold = generateRandomNumber() / 1000;
		System.out.println("Launching R1....");
		System.out.format("Launch Explosion Probability: " + "%.3f",launchExplosionProbability);
		System.out.format("   Threshold: " + "%.3f %n",threshold);
		if (launchExplosionProbability < threshold) {
			System.out.println("Launch successful!");
			return true;
		}
		System.out.println("Launch failed........");
		return false;
	}

	@Override
	public boolean land() {
		double landingCrashProbability = (RocketConstants.r1LandingCrashPercentage * (cargoWeight / calculateMaxCargoWeight()));
		double threshold = generateRandomNumber() / 2000;
		System.out.println("Landing R1....");
		System.out.format("Landing Explosion Probability: " + "%.3f",landingCrashProbability);
		System.out.format("   Threshold: " + "%.3f %n",threshold);
		if (landingCrashProbability < threshold) {
			System.out.println("Landing successful!!!  ....R1 on Mars....");
			return true;
		}
		System.out.println("Landing Failed........");
		return false;
	}

	public double calculateMaxCargoWeight() {
		return (maximumWeight - weightOfR1);
	}

	public static double generateRandomNumber() {
		Random randomNumber = new Random();
		return ((randomNumber.nextInt(90)) + 1);
	}

}
