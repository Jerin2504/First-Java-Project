package banquetHallAssignment;

import java.util.Scanner;

public class BanquetMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Banquet bq = new Banquet();

		int numberOfGuests;
		double totalCess;

		// Receive the inputs from the console
		System.out.println("Enter the base booking cost: ");
		bq.baseBookingCost = sc.nextDouble();
		System.out.println("Enter the cost of food: ");
		bq.costOfFood = sc.nextDouble();
		System.out.println("Enter the cost of beverages: ");
		bq.costOfBeverages = sc.nextDouble();
		System.out.println("Enter the total tip received: ");
		bq.tipAmount = sc.nextDouble();
		System.out.println("Enter the number of guests: ");
		numberOfGuests = sc.nextInt();

		if ((bq.baseBookingCost >= 0) && (bq.costOfFood >= 0) && (bq.costOfBeverages >= 0) && (bq.tipAmount >= 0)) {
			// Calculate base cost using parameterized constructor
			Banquet baseCost = new Banquet(bq.baseBookingCost, bq.costOfFood, bq.costOfBeverages, bq.tipAmount);
			baseCost.calculateBaseCost();
			System.out.println("Base cost of the Banquet Hall: " + baseCost.baseCost);

			bq.calculateTax();
			System.out.println("Total Tax: " + bq.calculateTax());

			totalCess = bq.calculateCess(numberOfGuests);
			System.out.println("Total Cess: " + totalCess);

			bq.calculateTheTotalCost(numberOfGuests);
			System.out.println("Total cost of the Banquet Hall: " + bq.getTotalCost());

		} else {
			System.out.println(
					"All the input values should be greater than or equal to zero. Please provide valid inputs");
		}

		sc.close();
	}

}
