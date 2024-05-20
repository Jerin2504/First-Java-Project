package collectionsConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SetExample {

	public static void main(String[] args) {

		HashSet<String> cities = new HashSet<String>();

		cities.add("Toronto");
		cities.add("Markham");
		cities.add("London");
		cities.add("Brampton");

		for (String s : cities) {
			System.out.println(s);
		}
		
		String[] names = {"Jerin", "Aneena","Ravneet","Emil","Emil"};
		
		List<String> nameList = new ArrayList<String>();
		
		nameList.addAll(Arrays.asList(names));
		
		HashSet<String> nameset = new HashSet<String>();
		nameset.addAll(nameList);
		System.out.println("Names in set" + nameset.toString());
		
		

	}
}
