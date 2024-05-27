package guessTheStudent;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StudentProcess {
	private ArrayList<String> nameList = null;
	Scanner sc = null;
	private String randomStudent;
	private char[] guessName;
	private int numberOfWrongAttempts = 0;

	private static final int maxNumberOfWrongAttempts = 3;
	public static final char hyphen = '_';

	public void getStudent() {
		nameList = new ArrayList<String>();
		try {
			sc = new Scanner(Paths.get("/Users/jerinraj/Downloads/nameList.txt"));

			while (sc.hasNext()) {
				nameList.add(sc.nextLine());
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}

	}

	public void getRandomStudent() {
		Random random = new Random();
		randomStudent = nameList.get(random.nextInt(nameList.size()));
		System.out.println(randomStudent);
		guessName = randomStudent.trim().toCharArray();
		for (int i = 0; i < randomStudent.length(); i++) {
			guessName[i] = hyphen;
		}
	}

	public void checkAndMatchStudent() {
		sc = new Scanner(System.in);
		String letterEntered;
		boolean letterFound = false;
		boolean studentGuessed = false;

		System.out.print("You are guessing : ");
		for (char c : guessName) {
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.println("You have guessed (" + numberOfWrongAttempts + ") wrong letters");

		System.out.print("Guess a letter : ");
		letterEntered = String.valueOf(sc.nextLine()).trim();

		if (letterEntered.length() > 1) {
			System.out.println("Please enter a character only.");
			checkAndMatchStudent();
			return;

		}
		
		if (!Character.isLetter(letterEntered.charAt(0))) {
			System.out.println("Please enter an alphabet only");
			checkAndMatchStudent();
			return;
		}

		for (int i = 0; i < guessName.length; i++) {
			if (Character.toLowerCase(randomStudent.charAt(i)) == Character.toLowerCase(letterEntered.charAt(0))) {
				guessName[i] = letterEntered.charAt(0);
				letterFound = true;
			}

		}

		if (!(String.valueOf(guessName).contains(String.valueOf(hyphen)))) {
			System.out.println("You Win !!!");
			System.out.println("You have guessed " + randomStudent + " correctly..");
			studentGuessed = true;
		}

		if (!studentGuessed) {
			if (!letterFound) {
				numberOfWrongAttempts++;
			}

			if (numberOfWrongAttempts < maxNumberOfWrongAttempts) {
				checkAndMatchStudent();
				return;
			} else {
				System.out.println("You have reached maximum wrong attempts. Better luck next time..");
			}
		}

	}

}
