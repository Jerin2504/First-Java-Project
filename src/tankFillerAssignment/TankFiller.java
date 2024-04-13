package tankFillerAssignment;

public class TankFiller {

	/*
	 * There is a water tank of capacity 100 litres. Water is filled into it using
	 * bucket which have capacity of 10 litres. Write a program which fills the tank
	 * to its capacity using these buckets. Also include a mechanism in your program
	 * to stop the tank from over flowing.
	 */

	double tankCapacity = 20;
	double bucketCapacity;
	double tankFilled;
	double tankRemaining;
	boolean isTankFull = false;

	public void fillTank() {

		if (bucketCapacity <= 10) {

			tankFilled = tankFilled + bucketCapacity;
			// check the water withdrawn is greater than the quantity of water in tank
			if (tankFilled < 0) {
				tankFilled = tankFilled - bucketCapacity;
				System.out.println("The tank does not have enough water to withdraw");
			}
			tankRemaining = tankCapacity - tankFilled;

			if (tankCapacity == tankFilled) {
				isTankFull = true;
			}
		} else {
			System.out.println("The maximum capacity of the bucket is 10l only.");
		}
	}

}
