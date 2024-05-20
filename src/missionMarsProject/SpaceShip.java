package missionMarsProject;

public interface SpaceShip {
	
	public boolean launch(int cargoWeight);
	
	public boolean land(int cargoWeight);
	
	public boolean canCarry(Item item);
	
	public void carry(Item item);

}
