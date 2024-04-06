package studentInfo;

public class StudentDetails {

	String studentName = "Tom Philips";

	int mathsGrade = 70;
	int scienceGrade = 75;
	int englishGrade = 80;
	int computerGrade = 85;

	void totalMarks() {

		int total = mathsGrade + scienceGrade + englishGrade + computerGrade;
		System.out.println("Total marks of " + studentName + "is : " + total);
	}

}
