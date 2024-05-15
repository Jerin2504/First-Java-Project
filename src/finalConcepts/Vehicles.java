package finalConcepts;

public class Vehicles {
	final protected String brandName = "Hero";
	private int cinNumber = 54455577;
	
	public void displalyBrandName() {
	//	brandName = "Hero Honda";
		System.out.println("Brand Name : "+ brandName);
	}
	
	public final int getCIN() {
		return cinNumber;
	}

}
 