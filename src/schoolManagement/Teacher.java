package schoolManagement;

import java.util.ArrayList;

public class Teacher extends Person {

	private String employeeID;
	private double salary;
	private ArrayList<String> courses = new ArrayList<String>();
	private ArrayList<Integer> ratings = new ArrayList<Integer>();

	public Teacher(String name, int age, String gender, String employeeID, double salary, ArrayList<String> courses,
			ArrayList<Integer> ratings) {
		super(name, age, gender);
		this.employeeID = employeeID;
		this.salary = salary;
		this.courses = courses;
		this.ratings = ratings;
	}

	public String getName() {
		return name;
	}

	public String getID() {
		return employeeID;
	}

	public void addRating(int rating) {
		ratings.add(rating);
	}

	public double calculateAverageRating() {
		double sum = 0;
		for (int eachRating : ratings) {
			sum += eachRating;
		}
		return (sum / ratings.size());
	}

	@Override
	public String describeRole() {
		return SchoolConstants.teacherRole;
	}

}
