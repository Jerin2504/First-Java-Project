package missionMarsProject;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

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

}
