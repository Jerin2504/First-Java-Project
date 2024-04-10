package practiceSession;

import java.util.Scanner;

public class RiderMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		LevithonRider lr = new LevithonRider();
		YukonStriker ys = new YukonStriker();
		BehemothRider br = new BehemothRider();

		// Height and weight are taken as input from the console
		System.out.println("Enter your height in cm:");
		lr.height = sc.nextDouble();
		System.out.println("Enter your weight in kg:");
		lr.weight = sc.nextDouble();

		ys.height = lr.height;
		ys.weight = lr.weight;

		br.height = lr.height;
		br.weight = lr.weight;

		lr.checkEligibilityForLevithon();
		ys.checkEligibilityForYukon();
		br.checkEligibilityForBehemoth();

		sc.close();
	}

}
