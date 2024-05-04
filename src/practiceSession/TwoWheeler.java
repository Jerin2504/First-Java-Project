package practiceSession;

public class TwoWheeler extends Vehicle implements VehicleMandatoryIdentification{

	 protected double increasePriceBy = 0.20; // 0.2 times

	  void finalPrice() {
	    basePrice = basePrice + (basePrice * increasePriceBy);
	    System.out.println(
	      "After modification, The price of bike is: Rs." + basePrice
	    );
	  }

	@Override
	public void showChasisNumber() {
		System.out.println("Display the two digit chasis number");
		
	}
	
}
