package collectionsConcepts;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class IterateOverMap {
	
	public static void main(String[] args) {
		
		HashMap <Integer, String> students = new HashMap<Integer, String>();
		
		students.put(1, "Arshdeep");
		students.put(2, "Jerin");
		students.put(3, "Raj");
		
		System.out.println(students.toString());
		
		Set<Entry<Integer, String>> studentSet = students.entrySet();
		System.out.println(studentSet.toString());
		
		for(Entry<Integer, String> s : studentSet) {
			System.out.println(s);
			if(s.getValue().equals("Jerin")) {
				System.out.println(s.getKey());
			}
		}
		
	}
}
