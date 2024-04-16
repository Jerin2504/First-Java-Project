package tankFillerAssignment;

public class TankFiller {

	/*
	 * There is a water tank of capacity 100 litres. Water is filled into it using
	 * bucket which have capacity of 10 litres. Write a program which fills the tank
	 * to its capacity using these buckets. Also include a mechanism in your program
	 * to stop the tank from over flowing.
	 */

	double tankCapacity = 30;
	double tankFilled = 5;
	double tankRemaining;
	boolean requireMoreBuckets = true;
	boolean useTenLitreBucket = false;

	public void fillTank() {
		if ((tankCapacity - tankFilled) >= 10) {
			tankFilled += 10;
			tankRemaining = tankCapacity - tankFilled;

			if (tankRemaining == 0) {
				System.out.println("The tank is full");
				requireMoreBuckets = false;
			} else if (tankRemaining < 10) {
				System.out.println("No more buckets of 10l water required. It requires only " + tankRemaining + " to fill the tank");
				requireMoreBuckets = false;
			}
		}

	}

}
