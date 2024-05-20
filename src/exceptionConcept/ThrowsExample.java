package exceptionConcept;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class ThrowsExample {

	public static void readFile() throws IOException {

		Scanner sc = new Scanner(Paths.get("/Users/jerinraj/Downloads/WES.pd"));

		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());

		}
		sc.close();
	}

	public static void printValue(String s) throws Exception {

		if (s == null) {
			throw new Exception("We do not handle null values");
		} else {
			System.out.println(s);
		}
	}

}
