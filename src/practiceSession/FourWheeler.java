package practiceSession;

public class FourWheeler extends Vehicle implements VehicleMandatoryIdentification{

	 double increasePriceBy = 1; // 1 times

	  void finalPrice() {
	    basePrice = basePrice + (basePrice * increasePriceBy);
	    System.out.println(
	      "After modification, The price of car is: Rs." + basePrice
	    );
	  }

	@Override
	public void showChasisNumber() {
		System.out.println("Display the four digit chasis number");
		
	}
	
}
