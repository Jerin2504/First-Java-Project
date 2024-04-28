package banquetHallAssignment;

import java.util.Scanner;

public class BanquetMain {

	public static void main(String[] args) {

		double baseBookingCost;
		double costOfFood;
		double costOfBeverages;
		double tipAmount;
		int numberOfGuests;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the base booking cost: ");
		baseBookingCost = sc.nextDouble();
		System.out.println("Enter total cost of food: ");
		costOfFood = sc.nextDouble();
		System.out.println("Enter total cost of beverages");
		costOfBeverages = sc.nextDouble();
		System.out.println("Enter total tip recieved: ");
		tipAmount = sc.nextDouble();
		System.out.println("Enter the number of guests: ");
		numberOfGuests = sc.nextInt();

		if (baseBookingCost >= 0 && costOfFood >= 0 && costOfBeverages >= 0 && tipAmount >= 0 && numberOfGuests >= 0) {

			Banquet bq = new Banquet(baseBookingCost, costOfFood, costOfBeverages, tipAmount);
			
			System.out.println("The total amount for the Banquet Hall: " + bq.calculateTotalCost(numberOfGuests));
		} else {
			System.out.println(
					"Values for all the inputs should be greater than or equal to zero. Please provide valid inputs..");
		}
		sc.close();
	}

}
