package inheritance2;

import Inheritance.Appliance;

public class AirFryer extends Appliance {
	
	

	
	public AirFryer(String name, String modelNumber, double price) {
		super(name, modelNumber, price); //calls the parent or super class constructor
	}

	public void displaySpecifications() {
	  System.out.println("Display specification of " + name);
	  System.out.println("show airfryer details");
	  System.out.println("Display  airfryer memory");
	  
	  
	  
	  }

}
