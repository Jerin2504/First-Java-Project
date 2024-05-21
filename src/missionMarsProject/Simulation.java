package missionMarsProject;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

	ArrayList<R1> r1List;
	ArrayList<R2> r2List;

	public ArrayList<Item> loadItems() {
		Scanner sc = null;
		ArrayList<Item> itemsList = null;
		try {
			sc = new Scanner(Paths.get("/Users/jerinraj/Downloads/phase-1.txt"));
			itemsList = new ArrayList<Item>();
			while (sc.hasNext()) {
				String itemDetails = sc.nextLine();
				String itemName = itemDetails.substring(0, itemDetails.indexOf("="));
				String itemWeight = itemDetails.substring((itemDetails.indexOf("=") + 1), (itemDetails.length()));
				itemsList.add(new Item(itemName, Double.parseDouble(itemWeight)));
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}

		return itemsList;
	}

	public ArrayList<R1> loadU1() {

		r1List = new ArrayList<R1>();
		int r1count = 0;
		r1List.add(new R1(RocketConstants.costOfR1, RocketConstants.weightOfR1));
		for (int i = 0; i < loadItems().size(); i++) {
			if (r1List.get(r1count).canCarry(loadItems().get(i), r1List.get(r1count).calculateMaxCargoWeight())) {
				r1List.get(r1count).carry(loadItems().get(i), r1List.get(r1count).calculateMaxCargoWeight());
			} else {
				displayLoadedRockets(r1count, r1List.get(r1count).cargoWeight, RocketConstants.rocket1);
				r1List.add(new R1(RocketConstants.costOfR1, RocketConstants.weightOfR1));
				r1count++;
				i--;
			}
		}
		displayLoadedRockets(r1count, r1List.get(r1count).cargoWeight, RocketConstants.rocket1);
		return r1List;
	}
	
	private void displayLoadedRockets(int rocketCount, double cargoWeight, String rocket) {
		System.out.println("---" + (rocketCount+1) + " : Rocket : " + rocket + "----");
		System.out.println("Cargo Weight : " + cargoWeight);
	}

	public ArrayList<R2> loadU2() {

		r2List = new ArrayList<R2>();
		int r2count = 0;
		r2List.add(new R2(RocketConstants.costOfR2, RocketConstants.weightOfR2));
		for (int i = 0; i < loadItems().size(); i++) {
			if (r2List.get(r2count).canCarry(loadItems().get(i), r2List.get(r2count).calculateMaxCargoWeight())) {
				r2List.get(r2count).carry(loadItems().get(i), r2List.get(r2count).calculateMaxCargoWeight());
			} else {
				displayLoadedRockets(r2count, r2List.get(r2count).cargoWeight, RocketConstants.rocket2);
				r2List.add(new R2(RocketConstants.costOfR2, RocketConstants.weightOfR2));
				r2count++;
				i--;
			}
		}

		displayLoadedRockets(r2count, r2List.get(r2count).cargoWeight, RocketConstants.rocket2);
		return r2List;
	}

	public void runSimulationR1(ArrayList<R1> rocketList) {
		double costOfRocket = 0;
		while (!rocketList.isEmpty()) {

			if (rocketList.get(0).launch()) {
				if (rocketList.get(0).land()) {
					rocketList.remove(0);
				}
			}
			costOfRocket += RocketConstants.costOfR1;
		}
		System.out.println("-----------------------------------------");
		System.out.println("Total cost of R1 fleet: " + costOfRocket);
		System.out.println("-----------------------------------------");

	}

	public void runSimulationR2(ArrayList<R2> rocketList) {
		double costOfRocket = 0;
		while (!rocketList.isEmpty()) {

			if (rocketList.get(0).launch() && rocketList.get(0).land()) {
				rocketList.remove(0);
			}
			costOfRocket += RocketConstants.costOfR2;
		}
		System.out.println("-----------------------------------------");
		System.out.println("Total cost of R2 fleet: " + costOfRocket);
		System.out.println("-----------------------------------------");

	}

}
