package conditionalStatements;

public class RentAVehicle {

	String drivingLicenceClass;

	public void filterVehicleTypes() {

		if ((drivingLicenceClass.equals("A")) || (drivingLicenceClass.equals("B")) || (drivingLicenceClass.equals("C"))
				|| (drivingLicenceClass.equals("D")) || (drivingLicenceClass.equals("E"))
				|| (drivingLicenceClass.equals("F")) || (drivingLicenceClass.equals("G"))) {

			RentACar rc = new RentACar();
			rc.listAvailableCars();

		} else if (drivingLicenceClass.equals("M")) {

			RentABike rb = new RentABike();
			rb.listAvailableBikes();

		} else {
			System.out.println("Driving Licence Class is not valid!!!");
		}
	}

}
