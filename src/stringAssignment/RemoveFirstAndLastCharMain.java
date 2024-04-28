package stringAssignment;

import java.util.Scanner;

public class RemoveFirstAndLastCharMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word : ");
		String wordEntered = sc.next();

		RemoveFirstAndLastChar rc = new RemoveFirstAndLastChar(wordEntered);

		System.out.println("Modified String: " + rc.removeFirstLast());

		sc.close();
	}
}
