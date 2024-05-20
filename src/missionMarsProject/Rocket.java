package missionMarsProject;

public class Rocket implements SpaceShip{
	public static double cargoWeight;
	
	@Override
	public boolean launch(int rocketWeight) {
		return true;
	}

	@Override
	public boolean land(int rocketWeight) {
		return true;
	}

	@Override
	public boolean canCarry(Item item) {
		if(item.getWeight() <= cargoWeight) {
			return true;
		}
		return false;
	}
	
	
	@Override
	public void carry(Item item) {
		if(canCarry(item)) {
			cargoWeight -= item.getWeight();
		}
		
	}

}
