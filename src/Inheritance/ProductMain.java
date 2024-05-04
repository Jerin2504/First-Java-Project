package Inheritance;

public class ProductMain {

	public static void main(String[] args) {

	//	Appliance laptop = new Appliance("Asus Lap", "ABC1234", 10000);

		Appliance airfryer = new Appliance("Airfryer", "XYZ3456", 200);

		// laptop.displaySpecifications();

		/*
		 * Laptop hpLaptop = new Laptop(); hpLaptop.name = "HP Laptop";
		 * hpLaptop.modelNumber = "CDF987"; hpLaptop.price = 500;
		 * 
		 * System.out.println("Display price" + hpLaptop.price);
		 * 
		 * hpLaptop.displayCustomerReviews();
		 * 
		 * hpLaptop.displaySpecifications(); System.out.println("********");
		 */

		airfryer.name = "Airyfer 400";
		airfryer.modelNumber = " cccc 324";
		airfryer.price = 78;

		airfryer.displaySpecifications();
		
		
		WashingMacine washingMachine = new WashingMacine();
		washingMachine.name = "LG";
		washingMachine.modelNumber = "lkjd234";
		
		washingMachine.customerReview = new Reviews();
		washingMachine.customerReview.rating = 4.5;
		String[] comments = {"this is good","not up to mark"};
		washingMachine.customerReview.setComments(comments);

	}

}
