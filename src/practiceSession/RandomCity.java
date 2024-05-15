package practiceSession;

import java.util.Random;

public class RandomCity {
	
	private static String[] cities = {"Toronto", "Ottawa", "Windsor", "Niagra", "Hamilton", "Barrie"};
	
	public static void main(String[] args) {
		
		Random random = new Random();
		System.out.println(cities[random.nextInt(0, cities.length)]);
		
	}

}
