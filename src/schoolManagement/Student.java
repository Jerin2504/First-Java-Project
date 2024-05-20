package schoolManagement;

import java.util.HashMap;

public class Student extends Person {

	private String studentID;
	private double percentage;
	public final HashMap<String, String> streamMessage = new HashMap<String, String>();

	public Student(String name, int age, String gender, String studentID, double percentage) {
		super(name, age, gender);
		this.studentID = studentID;
		this.percentage = percentage;
	}

	public String getStudentID() {
		return studentID;
	}

	public double getPercentage() {
		return percentage;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Academic Percentage: " + percentage ;
	}

	@Override
	public String describeRole() {
		return SchoolConstants.studentRole;
	}

	public String determineStream() {
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

	public boolean rateTeacher(Teacher teacher, int rating) {
		if(!((rating >= 1) && (rating <= 5))){
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
		createStreamMessage();
		return (streamMessage.get(stream));
	}

}
