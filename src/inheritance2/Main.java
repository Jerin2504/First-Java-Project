package inheritance2;

import Inheritance.Appliance;

public class Main {

	public static void main(String[] args) {
		
	//	Appliance app = new Appliance();
		
		AirFryer airfryer = new AirFryer("AirFryer", "XTH32345", 230);
		
		airfryer.displaySpecifications();
		
		MacBook mac = new MacBook();
		mac.displayCustomerReviews();
		
		//Parent reference variable. Refer objecto of child class using parent
	//	Laptop laptop = new MacBook();
		Appliance appliance = new MacBook();
		
		appliance.displayCustomerReviews();
	
		

	}

}
