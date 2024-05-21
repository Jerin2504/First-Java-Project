package missionMarsProject;

public class Rocket implements SpaceShip{
	public double cargoWeight;
	
	@Override
	public boolean launch() {
		return true;
	}

	@Override
	public boolean land() {
		return true;
	}

	@Override
	public final boolean canCarry(Item item, double maxCargoWieght) {
		if(item.getWeight() <= (maxCargoWieght - cargoWeight)) {
			return true;
		}
		return false;
	}
	
	
	@Override
	public final void carry(Item item, double maxCargoWeight) {
		if(canCarry(item, maxCargoWeight)) {
			cargoWeight += item.getWeight();
		}
		
	}

}
