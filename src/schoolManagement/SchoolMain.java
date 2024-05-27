package schoolManagement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SchoolMain {

	public static void main(String[] args) {

		School school = new School();
		ArrayList<String> courseList;
		ArrayList<Integer> ratingList; 

		// Add students and teachers
		school.addStudents(new Student("Charlie Brown", 15, "Male", "1123123", 65));
		school.addStudents(new Student("Jisha George", 16, "Female", "1458722", 82));
		school.addStudents(new Student("Francis Joseph", 16, "Male", "1425896", 45));
		school.addStudents(new Student("Charlie Brown", 15, "Male", "1123167", 65));

		String[] courses = { "Mathematics", "Statistics" };
		Integer[] ratings = { 4, 5, 3, 4 };
		courseList = new ArrayList<String>();
		ratingList = new ArrayList<Integer>();
		courseList.addAll(Arrays.asList(courses));
		ratingList.addAll(Arrays.asList(ratings));
		school.addTeachers(new Teacher("Susan Mary", 40, "Female", "478956", 10000, courseList, ratingList));

		courses = new String[] { "Arts", "Humanities" };
		ratings = new Integer[] { 1,1,5 };
		courseList = new ArrayList<String>();
		ratingList = new ArrayList<Integer>();
		courseList.addAll(Arrays.asList(courses));
		ratingList.addAll(Arrays.asList(ratings));
		school.addTeachers(new Teacher("Jacob Francis", 40, "Male", "11111", 10000, courseList, ratingList));

		
		courses = new String[] { "Physics", "Chemistry" };
		ratings = new Integer[] { 2, 2 };
		courseList = new ArrayList<String>();
		ratingList = new ArrayList<Integer>();
		courseList.addAll(Arrays.asList(courses));
		ratingList.addAll(Arrays.asList(ratings));
		school.addTeachers(new Teacher("Susan Mary", 35, "Female", "478957", 10000, courseList, ratingList));

		// Validate and display details
		System.out.println("Welcome to " + School.schoolName + " Stream Allocation and Teacher Rating System!" + "");

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Please enter the student's ID: ");

			if (!school.validateStudent(sc.nextLine())) {
				System.out.println(" The student ID entered does not exist. Please enter a valid student ID.");
				return;
			}

			System.out.println();
			System.out.println("----Stream Allocation Result------");
			System.out.println(school.getStudent().toString());
			System.out.println("Allocated Stream: " + school.getStudent().getStream());
			System.out.println(school.getStudent().getName() + " can enroll in subjects like "
					+ school.getStudent().getStreamMessage(school.getStudent().getStream()));

			System.out.println();

			if(school.getStudent().rateTeacher(sc, school)) {
				System.out.println();
				System.out.println("------Updated Teacher Rating-----");
				System.out.println("Teacher: " + school.getTeacher().getName());
				System.out.format("New Average Rating: " + "%.1f", school.getTeacher().calculateAverageRating());
			}
	
		} finally

		{
			sc.close();
		}
	}
}
