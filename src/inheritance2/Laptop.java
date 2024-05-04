package inheritance2;

import Inheritance.Appliance;

public class Laptop extends Appliance{
	
	
	/*
	 * public Laptop(String name, String modelNumber, double price) { super(name,
	 * modelNumber, price); }
	 */
	
	@Override
	public void displaySpecifications() {
	  System.out.println("Display specification of " + name);
	  System.out.println("Display processor");
	  System.out.println("Display memory");
	  
	  }
	 
	
}
