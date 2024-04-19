package methodConcepts;

import java.util.Scanner;

public class FidoMain {

	public static void main(String[] args) {

		// Customer Details
		FidoCustomerAccount arjunAccount = new FidoCustomerAccount();
		arjunAccount.customerName = "Arjun Singh";
		arjunAccount.currentPlan = "Popular50";
		arjunAccount.customerId = "23456";
		arjunAccount.assignedContactNumber = "5193457659";
		arjunAccount.password = "abc@123";

		FidoCustomerAccount rahulAccount = new FidoCustomerAccount();
		rahulAccount.customerName = "Rahul Kumar";
		rahulAccount.currentPlan = "Data45";
		rahulAccount.customerId = "87609";
		rahulAccount.assignedContactNumber = "6178790465";
		rahulAccount.password = "test123";

		// Plan Details
		FidoPlans popularFifty = new FidoPlans("Popular30","30 days",26,100,50);
		/*
		 * popularFifty.planName = "Popular30"; 
		 * popularFifty.validity = "30 days";
		 * popularFifty.baseAmount = 26; 
		 * popularFifty.freeMins = 100;
		 * popularFifty.internetUsage = 50;
		 */

		FidoPlans dataTwenty = new FidoPlans("Data45","45 days",30,0,100);
		/*
		 * dataTwenty.planName = "Data45"; 
		 * dataTwenty.validity = "45 days";
		 * dataTwenty.baseAmount = 30; 
		 * dataTwenty.freeMins = 0; 
		 * dataTwenty.internetUsage = 100;
		 * 
		 */

		FidoCustomerAccount[] fidoCustomers = { arjunAccount, rahulAccount };
		FidoPlans[] fidoPlans = { popularFifty, dataTwenty };
		Scanner sc = new Scanner(System.in);

		// Receive contact number and password
		System.out.println("To login, please enter your Fido contact number");
		String enteredContactNumber = sc.next();
		System.out.println("Enter your password");
		String enteredPassword = sc.next();

		// Store a customer's details after validating the credentials and display
		FidoCustomerAccount customerAccount = new FidoCustomerAccount();
		customerAccount = customerAccount.validateCredentials(enteredContactNumber, enteredPassword, fidoCustomers);
		if (customerAccount != null) {
			customerAccount.displayCustomerDetails();

			// Display details of the plan used
			FidoPlans plan = new FidoPlans();
			plan = plan.getPlanDetails(customerAccount.getCurrentPlan(), fidoPlans);
			if (plan != null) {
				plan.displayPlanDetails();
			} else {
				System.out.println("You don't have an existing plan. Please reach out to nearest retailer");
			}

		}
		sc.close();
	}

}
