package CoreJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Institute {

	final String institute_name = "ABC INSTITUTE";
	String name;
	int roll_no;
	int age;
	String address;
	String courses;

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getInstitute_name() {
		return institute_name;
	}

}

class Student extends Institute {

	String stream;

	// Method Overriding for the methods getCouses and setCourses.

	public String getCourses() {
		System.out.println("Course :" + super.getCourses());
		return stream;
	}

	public void setCourses(String stream) {
		super.setCourses("Engineering");
		this.stream = stream;
	}

}

public class MethodOverridingSample {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		Institute institute = new Institute();

		System.out.print("Enter Name : ");
		student.setName(bf.readLine()); //full name can be provided with spaces as it reads the whole line.

		System.out.print("Enter Roll No. : ");
		student.setRoll_no(sc.nextInt());

		System.out.print("Enter Age : ");
		student.setAge(sc.nextInt());

		System.out.print("Enter Address : ");
		student.setAddress(bf.readLine());

		System.out.print("Enter Stream : ");
		student.setCourses(bf.readLine());

		bf.close();
		sc.close();

		System.out.println();
		System.out.println("INSTITUTE NAME :" + institute.getInstitute_name());
		System.out.println("NAME :" + student.getName());
		System.out.println("ROLL_NO :" + student.getRoll_no());
		System.out.println("AGE :" + student.getAge());
		System.out.println("ADDRESS :" + student.getAddress());
		System.out.println("STREAM :" + student.getCourses());

	}

}
