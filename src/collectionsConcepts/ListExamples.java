package collectionsConcepts;

import java.util.ArrayList;

public class ListExamples {

	public static void main(String[] args) {

		ArrayList<String> cities = new ArrayList<String>();

		cities.add("Toronto");
		cities.add("Markham");
		cities.add("London");
		cities.add("Brampton");

		System.out.println("Size of the list :" + cities.size());

		System.out.println("---------------------------");
		System.out.println("Add cities : ");
		for (int i = 0; i < cities.size(); i++) {
			System.out.println(cities.get(i));
		}

		System.out.println("---------------------------");
		cities.add(1, "Niagra");
		System.out.println("Add cities at a index : ");
		for (int i = 0; i < cities.size(); i++) {
			System.out.println(cities.get(i));
		}

		System.out.println("---------------------------");
		System.out.println("Contains");
		System.out.println(cities.contains("London"));

		System.out.println("---------------------------");
		System.out.println("hashcode");
		System.out.println(cities.hashCode());
		System.out.println(cities.get(1).hashCode());

		System.out.println("---------------------------");
		System.out.println("First index of");
		System.out.println(cities.indexOf("Markham"));

		System.out.println("---------------------------");
		System.out.println("Last index of");
		cities.add("Markham");
		System.out.println(cities.lastIndexOf("Markham"));

		System.out.println("---------------------------");
		System.out.println("Empty");
		System.out.println(cities.isEmpty());

		System.out.println("---------------------------");
		System.out.println("Remove object");
		// Removes only first object found
		System.out.println(cities.toString());
		cities.remove("Markham");
		System.out.println(cities.toString());

		System.out.println("---------------------------");
		System.out.println("Replace an object");
		cities.set(3, "Barrie");
		for (int i = 0; i < cities.size(); i++) {
			System.out.println(cities.get(i));
		}

		System.out.println("---------------------------");
		System.out.println("Convert to array");
		Object[] newCities = cities.toArray();
		for(Object s : newCities) {
			System.out.println(s);
		}
		
		/*
		 * String[] stringCities = new String[cities.size()]; stringCities =
		 * cities.toArray(); for(String s : stringCities) { System.out.println(s); }
		 */

	}
}
