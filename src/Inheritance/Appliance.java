package Inheritance;

public class Appliance {
	
	protected String name;
	protected String modelNumber;
	protected double price;
	
	Reviews customerReview;
	
	public Appliance() {
		
	}
	
	public Appliance(String name, String modelNumber, double price) {
		super();
		this.name = name;
		this.modelNumber = modelNumber;
		this.price = price;
	}

	public void displayCustomerReviews() {
		System.out.println("Display customer ratings");
		System.out.println("Display customer comments");
		
	}
	
	public void checkOffer() {
		System.out.println("Check for offers");
		
	}
	
	
	public void displaySpecifications() {
		System.out.println("Display specification of " + name);
		
	}
}
