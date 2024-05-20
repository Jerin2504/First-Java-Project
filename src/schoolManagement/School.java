package schoolManagement;

import java.util.ArrayList;

public class School {

	public static final String schoolName = "Springfield High School";
	private ArrayList<Student> studentsList = new ArrayList<Student>();
	private ArrayList<Teacher> teachersList = new ArrayList<Teacher>();
	private Teacher teacher;
	private Student student;
	private int countSimilarPersons;

	public ArrayList<Student> getStudentsList() {
		return studentsList;
	}

	public ArrayList<Teacher> getTeachersList() {
		return teachersList;
	}

	public void addStudents(Student student) {
		this.studentsList.add(student);
	}

	public void addTeachers(Teacher teacher) {
		this.teachersList.add(teacher);
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public Student getStudent() {
		return student;
	}

	public int validateTeacher(String enteredName) {
		countSimilarPersons = 0;
		for (Teacher teacherDetails : teachersList) {
			if (teacherDetails.getName().equalsIgnoreCase(enteredName)) {
				teacher = teacherDetails;
				countSimilarPersons++;
			}
		}
		return countSimilarPersons;
	}

	public boolean validateTeacherID(String employeeID) {
		for (Teacher teacherDetails : teachersList) {
			if (teacherDetails.getID().equals(employeeID)) {
				teacher = teacherDetails;
				return true;
			}
		}
		return false;
	}

	public int validateStudent(String studentName, int studentAge, String studentGender, double studentPercentage) {
		countSimilarPersons = 0;
		for (Student studentDetails : studentsList) {
			if ((studentDetails.getName().equalsIgnoreCase(studentName)) && (studentDetails.getAge() == studentAge)
					&& (studentDetails.getGender().equalsIgnoreCase(studentGender)
							&& (studentDetails.getPercentage() == studentPercentage))) {
				student = studentDetails;
				countSimilarPersons++;
			}
		}
		return countSimilarPersons;
	}

	public boolean validateStudent(String studentID) {
		for (Student studentDetails : studentsList) {
			if (studentDetails.getStudentID().equals(studentID)) {
				student = studentDetails;
				return true;
			}
		}
		return false;
	}

}
