package tankFillerAssignment;

import java.util.Scanner;

public class TankFillerMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		TankFiller tf = new TankFiller();

		tf.tankRemaining = tf.tankCapacity - tf.tankRemaining;

		for (int i = 0; i < (tf.tankCapacity/10); i++) {
			System.out.println("Do you like to fill the tank with 10l bucket");
			tf.useTenLitreBucket = sc.nextBoolean();

			if (tf.useTenLitreBucket) {
				tf.fillTank();
			}
			else {
				i--;
			}

			if (!tf.requireMoreBuckets) {
				break;
			}

		}

		sc.close();

	}

}
