package stringAssignment;

import java.util.Scanner;

public class SwapFirstAndLastNameMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the name: ");
		String nameEntered = sc.nextLine();

		SwapFirstAndLastName sn = new SwapFirstAndLastName();
		System.out.println(sn.nameShuffle(nameEntered)[0] + " "
				+ sn.nameShuffle(nameEntered)[sn.nameShuffle(nameEntered).length - 1]);

		sc.close();
	}

}
