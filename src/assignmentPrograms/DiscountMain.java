package assignmentPrograms;

public class DiscountMain {

	public static void main(String[] args) {

		DiscountCalculations dc = new DiscountCalculations();

		dc.markedProductPrice = 1000;
		dc.promoCode = "Promo20";

		dc.calcualteDiscounts();

	}

}
