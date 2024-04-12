package pizzaShopBillAssignment;

public class pizzaShopBillMain {

	public static void main(String[] args) {

		PizzaShopBill pb = new PizzaShopBill();
		pb.prepareBill();

		System.out.println("Your final bill is " + pb.finalPrice);

	}

}
