package polymorphismConcept;

public class PolymorphismExample {
	
	public void addNumbers(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Sum: " + sum);
	}
	
	//Number of arguments
	
	public void addNumbers(int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		System.out.println("Sum: " + sum);
	}
	
	//Type of arguments

	public void addNumbers(double num1, double num2) {
		double sum = num1 + num2;
		System.out.println("sum: " + sum);
	}
	
	public void addNumbers(int num1, double num2){
		double sum = num1 + num2;
		System.out.println("sum: " + sum);
	}
	
	public void addNumbers(double num1, int num2) {
		double sum = num1 + num2;
		System.out.println("sum: " + sum);
	}
}
