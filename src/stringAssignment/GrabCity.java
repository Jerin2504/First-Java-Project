package stringAssignment;

public class GrabCity {
	
	/*
	 * Write a function to return the city from each of these vacation spots. As
	 * shown in example below index of search word ‘Pineapple’ is 0 Examples
	 * grabCity("[Last Day!] Beer Festival [Munich]") ➞ "Munich"
	 * grabCity("Cheese Factory Tour [Portland]") ➞ "Portland"
	 * grabCity("[50% Off!][Group Tours Included] 5-Day Trip to Onsen [Kyoto]") ➞
	 * "Kyoto"
	 */


	private String vacationSpot;

	public GrabCity(String vacationSpot) {
		super();
		this.vacationSpot = vacationSpot;
	}

	public String grabCity() {

		if (vacationSpot.contains("[") && vacationSpot.contains("]")) {
			return (vacationSpot.substring((vacationSpot.lastIndexOf('[') + 1), vacationSpot.lastIndexOf(']')));
		}
		return " ";

	}
}
