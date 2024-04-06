package studentInfo;

public class MainClass {

	public static void main(String[] args) {
		StudentDetails sd = new StudentDetails();
		StudentGradeCalculations sgc = new StudentGradeCalculations();

		sd.totalMarks();
		sgc.calcPercentage();

	}
}
