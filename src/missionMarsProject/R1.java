package missionMarsProject;

public class R1 extends Rocket {
	
	private double costOfR1;
	private double weightOfR1;
	private static final double maximumWeight = 18;
	private double randomNumber = 0.5;
	
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
	public boolean launch(int rocketWeight) {
		double launchExplosionProbability = (0.05 * (rocketWeight / maximumWeight));
		if (launchExplosionProbability < randomNumber) {
			return true;
		}
		return false;
	}

	@Override
	public boolean land(int rocketWeight) {
		double landingCrashProbability = (0.01 * (rocketWeight / maximumWeight));
		if (landingCrashProbability < randomNumber) {
			return true;
		}
		return false;
	}
	
	public void calculateCargoWeight() {
		Rocket.cargoWeight = maximumWeight - weightOfR1;
	}

}
