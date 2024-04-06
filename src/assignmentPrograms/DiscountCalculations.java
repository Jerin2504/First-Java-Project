package assignmentPrograms;

public class DiscountCalculations {

	String promoCode;
	double discountPercent;
	double markedProductPrice;
	double finalProductPrice;

	public void calcualteDiscounts() {

		// Calculate price after first discount of 50 percent
		double firstDiscountedProductPrice = markedProductPrice - (0.50 * markedProductPrice);

		if (promoCode.equals("Promo5")) {
			discountPercent = 5;
		} else if (promoCode.equals("Promo10")) {
			discountPercent = 10;
		} else if (promoCode.equals("Promo20")) {
			discountPercent = 20;
		}

		// Calculate final price after applying promo code
		finalProductPrice = firstDiscountedProductPrice - ((discountPercent * firstDiscountedProductPrice) / 100);

		System.out.println("The final price of the product after applying " + promoCode + " :" + finalProductPrice);
	}

}
