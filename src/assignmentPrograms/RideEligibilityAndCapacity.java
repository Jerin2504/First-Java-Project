package assignmentPrograms;

import java.util.Scanner;

public class RideEligibilityAndCapacity {

	/*
	 * In Amusement park, a ride can carry max 10 people. Write a code to help the
	 * operator from overfilling the ride i.e more than 10 people should not be
	 * allowed to get on the ride. Also ensure that the people getting on the ride
	 * meets the height criteria , Height of person should be greater than 90 cm but
	 * less than 200 cm.
	 */

	int maximumCapacity;
	double height;
	int numberOfRiders;

	public void checkRiderHeight() {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < maximumCapacity; i++) {
			System.out.println("Enter the height of the Rider: ");
			height = sc.nextDouble();

			if ((height > 90) && (height < 200)) {
				numberOfRiders++;
			} else {
				System.out.println(
						"The rider is not eligible for this ride. The rider's heigh must be between 90 and 200cm");
				i--;

			}
		}

		System.out.println("The ride is full..");

		sc.close();
	}

}
