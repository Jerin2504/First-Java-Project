package stringAssignment;

import java.util.Scanner;

public class PrefixSuffixCheckMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PrefixSuffixCheck ps = new PrefixSuffixCheck();

		System.out.println("Would you like to check 'prefix' or 'suffix'");
		String enteredChoice = sc.next();
		String wordentered;

		switch (enteredChoice) {
		case "prefix":
			System.out.println("Enter the word to be validated: ");
			wordentered = sc.next();
			System.out.println("Enter the prefix: ");
			String prefix = sc.next();
			System.out.println(ps.isPrefix(wordentered, prefix));

			break;

		case "suffix":
			System.out.println("Enter the word to be validated: ");
			wordentered = sc.next();
			System.out.println("Enter the suffix: ");
			String suffix = sc.next();
			System.out.println(ps.isSuffix(wordentered, suffix));

			break;

		default:
			System.out.println("Please enter the correct option: prefix or suffix ");
			break;
		}

		sc.close();
	}

}
