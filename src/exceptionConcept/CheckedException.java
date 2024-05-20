package exceptionConcept;

import java.io.IOException;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.Scanner;

public class CheckedException {
	
	public static void main(String[] args) {
		
		Scanner sc = null;
		try {
			sc = new Scanner(Paths.get("/Users/jerinraj/Downloads/WES.pdf"));
			
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch(InvalidPathException inve){
			inve.printStackTrace();
			
		} catch(IOException ioe) {
			ioe.printStackTrace();
		} finally {
			sc.close();
			System.out.println("finallyy");
		}
	}

}
