package tankFillerAssignment;

import java.util.Scanner;

public class TankFillerMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		TankFiller tf = new TankFiller();

		for (int i = 0; i < 100; i++) {
			System.out.println("Enter the quantiy of water in the bucket");
			tf.bucketCapacity = sc.nextDouble();

			tf.fillTank();

			if (tf.isTankFull) {
				System.out.println("The tank is full");
				break;
			} else {
				System.out.println("The tank requires " + tf.tankRemaining + "l more to reach full capacity");
			}

		}

		sc.close();

	}

}
