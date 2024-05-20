package schoolManagement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SchoolMain {

	public static void main(String[] args) {

		School school = new School();
		ArrayList<String> courseList = new ArrayList<String>();
		ArrayList<Integer> ratingList = new ArrayList<Integer>();

		// Add students and teachers
		school.addStudents(new Student("Charlie Brown", 15, "Male", "1123123", 65));
		school.addStudents(new Student("Jisha George", 16, "Female", "1458722", 82));
		school.addStudents(new Student("Francis Joseph", 16, "Male", "1425896", 45));
		school.addStudents(new Student("Charlie Brown", 15, "Male", "1123167", 65));

		String[] courses = { "Mathematics", "Statistics" };
		Integer[] ratings = { 4, 5, 3, 4 };
		courseList.addAll(Arrays.asList(courses));
		ratingList.addAll(Arrays.asList(ratings));
		school.addTeachers(new Teacher("Susan Mary", 40, "Female", "478956", 10000, courseList, ratingList));

		courses = new String[] { "Physics", "Chemistry" };
		ratings = new Integer[] { 2, 2 };
		courseList.clear();
		ratingList.clear();
		courseList.addAll(Arrays.asList(courses));
		ratingList.addAll(Arrays.asList(ratings));
		school.addTeachers(new Teacher("Susan Mary", 35, "Female", "478957", 10000, courseList, ratingList));

		// Validate and display details
		System.out.println("Welcome to " + School.schoolName + " Stream Allocation and Teacher Rating System!" + "");

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Please enter the student's name: ");
			String studentName = sc.nextLine();
			System.out.println("Please enter the student's age: ");
			int studentAge = sc.nextInt();
			System.out.println("Please enter the student's gender: ");
			String studentGender = sc.next();
			System.out.println("Please enter the student's academic percentage: ");
			double studentPercentage = sc.nextDouble();
			sc.nextLine();

			if (school.validateStudent(studentName, studentAge, studentGender, studentPercentage) == 0) {
				System.out.println("Please check the entered details..");
				return;
			}

			if (school.validateStudent(studentName, studentAge, studentGender, studentPercentage) > 1) {
				System.out.println("Please enter the students ID: ");
				if (!school.validateStudent(sc.next())) {
					System.out.println(" The student ID entered does not exist..");
					return;
				}
				sc.nextLine();
			}

			System.out.println();
			System.out.println("----Stream Allocation Result------");
			System.out.println(school.getStudent().toString());
			System.out.println("Allocated Stream: " + school.getStudent().determineStream());
			System.out.println(school.getStudent().getName() + " can enroll in subjects like "
					+ school.getStudent().getStreamMessage(school.getStudent().determineStream()));

			System.out.println();
			System.out.println("Enter the name of the teacher you wish to rate:");
			String teacherName = sc.nextLine();

			if (school.validateTeacher(teacherName) == 0) {
				System.out.println("Please check the teacher's name as no such teacher exists in the system..");
				return;
			}

			if (school.validateTeacher(teacherName) > 1) {
				System.out.println("Please enter the Teacher's ID: ");
				if (!school.validateTeacherID(sc.next())) {
					System.out.println(" The Teacher's ID entered does not exist..");
					return;
				}
				sc.nextLine();
			}

			System.out.println("Enter the rating for " + school.getTeacher().getName() + "[1-5]");
			if (school.getStudent().rateTeacher(school.getTeacher(), sc.nextInt())) {

				System.out.println();
				System.out.println("------Updated Teacher Rating-----");
				System.out.println("Teacher: " + school.getTeacher().getName());
				System.out.format("New Average Rating: " + "%.1f", school.getTeacher().calculateAverageRating());
			}

		} finally {
			sc.close();
		}
	}

}
