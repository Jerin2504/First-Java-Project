package schoolManagement;

import java.util.HashMap;
import java.util.Scanner;

public class Student extends Person {

	private String studentID;
	private double percentage;
	public final HashMap<String, String> streamMessage = new HashMap<String, String>();
	private boolean isValidRating = false;

	public Student(String name, int age, String gender, String studentID, double percentage) {
		super(name, age, gender);
		this.studentID = studentID;
		this.percentage = percentage;
		createStreamMessage();
	}

	public String getStudentID() {
		return studentID;
	}

	public double getPercentage() {
		return percentage;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Academic Percentage: " + percentage;
	}

	@Override
	public String describeRole() {
		return SchoolConstants.studentRole;
	}

	public String getStream() {
		if (percentage >= 85) {
			return SchoolConstants.nonMedicalStream;
		} else if (percentage >= 75 && percentage < 85) {
			return SchoolConstants.medicalStream;
		} else if (percentage >= 65 && percentage < 75) {
			return SchoolConstants.commerceStream;
		} else {
			return SchoolConstants.artsStream;
		}

	}

	public boolean rateTeacher(Scanner sc, School school) {

		System.out.println("Please select the appropriate option to give rating for a teacher: ");
		System.out.println("1: Search by name  |  2. Search by ID  |  3. Exit ");
		int enteredOption = Integer.parseInt(sc.nextLine());

		if (enteredOption == 1) {
			System.out.println("Enter the name of the teacher you wish to rate:");

			if ((school.validateTeacher(sc.nextLine())) == 1) {
				System.out.println("Enter the rating for " + school.getTeacher().getName() + "[1-5]");
				if (checkRating(school.getTeacher(), Integer.parseInt(sc.nextLine()))) {
					isValidRating = true;
				}
			} else {
				System.out.println(
						"Please search the teacher by ID as the teacher name does not exist or there are multiple teachers with the same name");
				rateTeacher(sc, school);
			}
		} else if (enteredOption == 2) {

			System.out.println("Enter the teacher's ID you wish to rate:");

			if (school.validateTeacherID(sc.nextLine())) {
				System.out.println("Enter the rating for " + school.getTeacher().getName() + "[1-5]");
				if (checkRating(school.getTeacher(), Integer.parseInt(sc.nextLine()))) {
					isValidRating = true;
				} else {
					rateTeacher(sc, school);
				}
			} else {
				System.out.println(" The Teacher's ID entered does not exist. Please try again.");
				rateTeacher(sc, school);
			}
		} else if (enteredOption == 3) {
			System.out.println("Thank You !!!");
			isValidRating = false;
		} else {
			System.out.println("Please enter a valid option");
			rateTeacher(sc, school);
		}
		return isValidRating;
	}

	private boolean checkRating(Teacher teacher, int rating) {
		if (!((rating >= 1) && (rating <= 5))) {
			System.out.println("Please enter rating in the specified valid range");
			return false;
		}
		teacher.addRating(rating);
		return true;
	}

	private void createStreamMessage() {
		streamMessage.put(SchoolConstants.nonMedicalStream, "Physics and Mathematics");
		streamMessage.put(SchoolConstants.medicalStream, "Biology and Chemistry");
		streamMessage.put(SchoolConstants.commerceStream, "Economics and Business Studies");
		streamMessage.put(SchoolConstants.artsStream, "History and Literature");
	}

	public String getStreamMessage(String stream) {
		return (streamMessage.get(stream));
	}

}
