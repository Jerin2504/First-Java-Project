package stringAssignment;

public class GrabCity {

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
