package staticConcepts;

import java.util.Random;

public class Student {
	
	static String subject;
	static String classtime;
	static String instructors = Constants.instructors;
	
		
	public Student(String name, int age, String phoneNumber) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		Student.subject = subject;
	}
	public String getClasstime() {
		return classtime;
	}
	public void setClasstime(String classtime) {
		Student.classtime = classtime;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	private String name;
	private int age;
	private String phoneNumber;
	
	public static long generateID() {
		
		Random random = new Random();
		return random.nextLong();
		
	}

}
