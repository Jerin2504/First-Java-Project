package staticConcepts;

import java.util.Arrays;

import enumConcepts.Subjects;

public class MainClass {

	public static void main(String[] args) {

		Student student1 = new Student("Jerin", 30, "3456365");
		Student student2 = new Student("Raj", 32, "76895678");

	//	Student.subject = "Java";
		Student.subject = Subjects.Java.toString();
		Student.classtime = "7 30 to 9 30";
		
	//	System.out.println(student1.generateID());
		
		System.out.println(Arrays.toString(Subjects.values()));

		System.out.println("student name: " + student1.getName() + " Student age" + student1.getAge() + " Student No :"
				+ student1.getPhoneNumber() + "Student subject: " + Student.subject + " Studnet classtime : "
				+ Student.classtime + "ID : " + Student.generateID());
		
		System.out.println("student name: " + student2.getName() + " Student age" + student2.getAge() + " Student No :"
				+ student2.getPhoneNumber() + "Student subject: " + Student.subject + " Studnet classtime : "
				+ Student.classtime + "ID : " + Student.generateID());

	}

}
