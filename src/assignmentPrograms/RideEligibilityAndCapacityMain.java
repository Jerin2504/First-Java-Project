package assignmentPrograms;

import java.util.Scanner;

public class RideEligibilityAndCapacityMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		RideEligibilityAndCapacity rc = new RideEligibilityAndCapacity();

		System.out.println("Enter the maximum capacity of the ride: ");
		rc.maximumCapacity = sc.nextInt();

		rc.checkRiderHeight();

		sc.close();

	}

}
