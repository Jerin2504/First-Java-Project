package missionMarsProject;

public interface SpaceShip {
	
	public boolean launch();
	
	public boolean land();
	
	public boolean canCarry(Item item, double maxCargoWeight);
	
	public void carry(Item item, double maxCargoWeight);

}
