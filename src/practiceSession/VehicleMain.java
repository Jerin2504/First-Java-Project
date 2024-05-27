package practiceSession;

public class VehicleMain {

	public static void main(String[] args) {
		
		Vehicle bike =  new TwoWheeler();
		Vehicle car = new FourWheeler();
		
		bike.showPrice();
		car.showPrice();
		
		TwoWheeler tw = new TwoWheeler();
		tw.showChasisNumber();
		
		tw.basePrice = 120000;
		System.out.println(tw.basePrice);
		tw.finalPrice();
		
		FourWheeler fw = (FourWheeler) bike;
		fw.showChasisNumber();
	

	}

}
