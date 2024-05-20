package practiceSession;

import java.util.ArrayList;
import java.util.List;

public class ListUnique {

	public static void main(String[] args) {

		List<String> cities = new ArrayList<String>();

		cities.add("Toronto");
		cities.add("Brampton");
		cities.add("Toronto");
		cities.add("Brampton");
		cities.add("Toronto");

		System.out.println(cities.toString());

		for (int i = 0; i < cities.size(); i++) {
			for (int j = i + 1; j < cities.size(); j++) {
				if (cities.get(i).equals(cities.get(j))) {
					cities.remove(j);
				}

			}

		}

		System.out.println(cities.toString());

	}

}
