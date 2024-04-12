package pizzaShopBillAssignment;

import java.util.Scanner;

public class PizzaShopBill {

	/*
	 * Write a program to prepare the bill for a pizza shop. Assume an order and
	 * work out the final bill. Take the Cheese Pizza prices as: Small Pizza: $15,
	 * Medium Pizza: $20, Large Pizza: $25 For additional pepperoni topping:
	 * Pepperoni for Small Pizza: +$2, Pepperoni for Medium or Large Pizza: +$3
	 * Extra cheese for any size pizza: + $1 For eg: If the Pizza is medium,
	 * pepperoni with extra cheese the program should calculate the final bill as
	 * 20+3+1 = $24 and print as “Your final bill is $24”
	 */

	String pizzaSize;
	boolean pepperoniTopping = false;
	boolean extraCheese = false;
	double basePrice;
	double finalPrice;

	Scanner sc = new Scanner(System.in);

	public void prepareBill() {

		System.out.println("Enter one of the following pizza size: ");
		System.out.println("  Small  |  Medium  |  Large  ");

		// Receive the pizza size
		pizzaSize = sc.next();

		switch (pizzaSize) {
		case "Small":

			// Receive input for the topping if required
			System.out.println("Would you like to have pepperoni topping (True/False) ");
			pepperoniTopping = sc.nextBoolean();

			// Receive input for the extra cheese if required
			System.out.println("Would you like to have extra cheese (True/False) ");
			extraCheese = sc.nextBoolean();

			basePrice = 15;
			if (pepperoniTopping) {
				finalPrice = basePrice + 2;
			}
			if (extraCheese) {
				finalPrice = finalPrice + 1;
			}
			break;
		case "Medium":

			// Receive input for the topping if required
			System.out.println("Would you like to have pepperoni topping (True/False) ");
			pepperoniTopping = sc.nextBoolean();

			// Receive input for the extra cheese if required
			System.out.println("Would you like to have extra cheese (True/False) ");
			extraCheese = sc.nextBoolean();

			basePrice = 20;
			if (pepperoniTopping) {
				finalPrice = basePrice + 3;
			}
			if (extraCheese) {
				finalPrice = finalPrice + 1;
			}
			break;
		case "Large":

			// Receive input for the topping if required
			System.out.println("Would you like to have pepperoni topping (True/False) ");
			pepperoniTopping = sc.nextBoolean();

			// Receive input for the extra cheese if required
			System.out.println("Would you like to have extra cheese (True/False) ");
			extraCheese = sc.nextBoolean();

			basePrice = 25;
			if (pepperoniTopping) {
				finalPrice = basePrice + 3;
			}
			if (extraCheese) {
				finalPrice = finalPrice + 1;
			}
			break;
		default:
			System.out.println("Invalid Input. Please enter a valid size.");
			break;
		}

		sc.close();
	}

}
