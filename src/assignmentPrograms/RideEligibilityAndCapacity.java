package assignmentPrograms;

import java.util.Scanner;

public class RideEligibilityAndCapacity {

	double[] height = { 0 };
	double checkHeight;
	int maximumCapacity;

	public void checkRiderHeight() {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < maximumCapacity; i++) {
			System.out.println("Enter the height of the Rider: ");
			checkHeight = sc.nextDouble();

			if ((checkHeight > 90) && (checkHeight < 200)) {
				height[i] = checkHeight;
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
