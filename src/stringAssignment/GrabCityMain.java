package stringAssignment;

public class GrabCityMain {

	public static void main(String[] args) {

		GrabCity gc = new GrabCity("grabCity(\"[50% Off!][Group Tours Included] 5-Day Trip to Onsen [Kyoto]\")");
		// Check if the vacation spot does not have square brackets or does not have
		// value between them
		if ((gc.grabCity().equals(" ")) || (gc.grabCity().length() == 0)) {
			System.out.println(
					"Sorry! Could not retrieve the city name. Either the vacation spot foramt is wrong or the vacation spot is blank");
		} else {
			System.out.println("City : " + gc.grabCity());
		}

	}

}
