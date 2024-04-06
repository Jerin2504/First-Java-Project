package studentInfo;

public class StudentGradeCalculations {

	void calcPercentage() {

		StudentDetails sd = new StudentDetails();
		int mGrade = sd.mathsGrade;
		int cGrade = sd.computerGrade;
		int eGrade = sd.englishGrade;
		int sGrade = sd.scienceGrade;

		String sName = sd.studentName;

		double studentPercent = ((mGrade + cGrade + eGrade + sGrade) * 100) / 400;
		System.out.println("Percentage of grades of " + sName + " is: " + studentPercent);

	}

}
