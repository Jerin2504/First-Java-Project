package missionMarsProject;

public class missionMain {
	
	public static void main(String[] args) {
		
		Simulation sim = new Simulation();
		
		sim.loadItems();
		System.out.println("----------------------------------  R1 Rockets  --------------------------------");
		sim.runSimulationR1(sim.loadU1());
		System.out.println("----------------------------------  R2 Rockets  --------------------------------");
		sim.runSimulationR2(sim.loadU2());
		
		
		
	}
}
