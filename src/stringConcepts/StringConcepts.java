package stringConcepts;

import java.util.Arrays;

public class StringConcepts {

	public static void main(String[] args) {
		
		//charArray and print
		String name = "Jerin raj";
		char[] charArray = name.toCharArray();
		
		System.out.println(Arrays.toString(charArray));
		
		//split a string
		
		String[] splitNames = name.split(" ");
		System.out.println(splitNames[0]);
				
		//Replace a part of string
		System.out.println(name.replace('r', 'b'));
		System.out.println(name.replace("Raj", "Rajan"));
		
		// index of a char
		System.out.println("position of r: " + name.indexOf('r'));
		System.out.println("position of Raj: " + name.indexOf("Raj"));
		System.out.println("last positon of r: " + name.lastIndexOf('r'));
		
		// contains
		if(name.contains("raj")) {
			System.out.println("Name is correct");
		} else {
			System.out.println("Name is not correct");
		}
		
		//substring
		System.out.println("First name: " + name.substring(0, 5));
		System.out.println("Last name: " + name.substring(6));
		
		
		
	}

}
