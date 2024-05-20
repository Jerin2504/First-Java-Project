package collectionsConcepts;

import java.util.HashMap;

public class MapExample {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> students = new HashMap<Integer, String>();
		
		students.put(1,  "Abhinav");
		students.put(2,  "Jerin");
		students.put(3, "Raj");
		students.put(2, "Ram"); //will override
		
		System.out.println(students.toString());
		
		System.out.println(students.get(2));
		
		HashMap<String, Transaction> transactionDetails = new HashMap<String, Transaction>();
		
		transactionDetails.put("123456", new Transaction("Deposit", 1000, 3500));
		
		System.out.println(transactionDetails.get("123456").toString());
	}
	

}
