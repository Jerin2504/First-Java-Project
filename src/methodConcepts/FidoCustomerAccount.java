package methodConcepts;

public class FidoCustomerAccount {
	
	String customerName;
	String currentPlan;
	String assignedContactNumber;
	String customerId;
	String password;
	
	
	public String getCustomerName() {
		return customerName;
	}
	
	public String getCurrentPlan() {
		return currentPlan;
	}
	
	public String getCustomerId() {
		return customerId;
	}
	
	public String getAssignedContactNumber() {
		return assignedContactNumber;
	}
	
	public String getPassword() {
		return password;
	}
	
	//To check credentials
	public FidoCustomerAccount validateCredentials(String enteredContact, String enteredPassword, FidoCustomerAccount[] customers) {
		for(int i = 0; i < customers.length; i++) {
			
			if(customers[i].getAssignedContactNumber().equals(enteredContact)) {
				if(customers[i].getPassword().equals(enteredPassword)) {
					System.out.println("Login successful..");
					return customers[i];
					
				} else {
					System.out.println("Incorrect password");
					break;
				}
			}
		
		}
		System.out.println("Please enter a valid contact number");
		return null;
			
	}
	
	//To display customer details
	public void displayCustomerDetails() {
		System.out.println("***Customer Details***");
		System.out.println("Name :" + getCustomerName());
		System.out.println("Id :" + getCustomerId());
		System.out.println("Plan in use :" + getCurrentPlan());
	}
	
	
	

}
