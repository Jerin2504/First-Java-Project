package exceptionConcept;

import java.io.IOException;

public class MainClass {
	
	public static void main(String[] args) {
		
		try {
			ThrowsExample.readFile();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	

}
