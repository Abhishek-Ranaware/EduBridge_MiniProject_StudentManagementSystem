package ServicesImplementation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Record.Student;
import Services.StudentServices;

public class StudentImplementation implements StudentServices {
	Scanner sc = new Scanner(System.in);

	ArrayList<Student> list = new ArrayList<Student>();

	public StudentImplementation() {
		Student s = new Student(10000, "Abhi", "Phaltan", 1, 5000, 50000);
		list.add(s);
	}

	public void displayStudents() throws NumberFormatException, IOException {
		if (list.size() == 0) {
			System.out.println("No record found!!");
		}

		for (Student s2 : list) {
			System.out.println(s2);

		}

	}

	int sid = 10000;
	int samt1 = 0;

	public void addStudent() throws NumberFormatException, IOException {

		if (sid >= 10000 && sid <= 99999) {
			sid++;

		}
		Scanner sc1c = new Scanner(System.in);

		System.out.println("Enter the name");
		String sname = sc1c.nextLine();

		System.out.println("Enter the address");
		String sadd = sc1c.nextLine();

		System.out.println("Enter the amount into the educational wallet");
		int samt = sc1c.nextInt();

		System.out.println("Enroll the Course");
		System.out.println("1.Java");
		System.out.println("2.Python");
		System.out.println("3.DevOps");
		System.out.println("Enter the choice");
		int ch = sc.nextInt();
		int spayment = 0;
		int count = 0;

		if (ch == 1) {
			System.out.println(
					"Thank you for enrolled java.\nDescription := Java is a widely used object-oriented programming language and software platform that runs on billions of devices, including notebook computers, mobile devices, gaming consoles, medical devices and many others.");
			System.out.println("Payment for java (Rs.8000)");
			spayment = sc.nextInt();
			if (spayment == 8000 && samt >= 8000) {
				System.out.println("Payment Successfull !");
				samt1 = samt - spayment;
				count++;
			} else if (samt < 8000) {
				System.out.println("Insufficient Fund");
			} else {
				System.out.println("Enter the amount only Rs.8000");

			}

		} else if (ch == 2) {
			System.out.println(
					"Thank you for enrolled python.\nDescription := Python is an interpreted, object-oriented, high-level programming language with dynamic semantics developed by Guido van Rossum. It was originally released in 1991. Designed to be easy as well as fun, the name \"Python\" is a nod to the British comedy group Monty Python.");
			System.out.println("Payment for python (Rs.10000)");
			spayment = sc.nextInt();
			if (spayment == 10000 && samt >= 10000) {
				System.out.println("Payment Successfull !");
				samt1 = samt - spayment;
				count++;
			} else if (samt < 10000) {
				System.out.println("Insufficient Fund");
			} else {
				System.out.println("Enter the amount only Rs.10000");
			}

		} else if (ch == 3) {
			System.out.println(
					"Thank you for enrolled DevOps.\nDescription := DevOps is the combination of cultural philosophies, practices, and tools that increases an organization's ability to deliver applications and services at high velocity: evolving and improving products at a faster pace than organizations using traditional software development and infrastructure management processes.");
			System.out.println("Payment for DevOps (Rs.5000)");
			spayment = sc.nextInt();
			if (spayment == 5000 && samt >= 5000) {
				System.out.println("Payment Successfull !");
				count++;
				samt1 = samt - spayment;
			} else if (samt < 5000) {
				System.out.println("Insufficient Fund");
			} else {
				System.out.println("Enter the amount only Rs.5000");
			}
		}

		else {
			System.out.println("Invalid Choice");
		}

		if (count >= 1) {
			Student s1 = new Student(sid, sname, sadd, ch, spayment, samt1);
			list.add(s1);
		} else {
			System.out.println("Enter Again");
		}

	}

	public void updateStudent() throws NumberFormatException, IOException {

		Scanner snew = new Scanner(System.in);
		System.out.println("Enter id:");
		int id = snew.nextInt();
		int flag = 0, index1 = 0;
		Student s2 = null;
		for (Student s3 : list) {
			if (s3.getId() == id) {
				flag++;
				index1 = list.indexOf(s3);
				s2 = s3;
				System.out.println(index1);
				break;
			}
		}

		if (flag >= 1) {
			Scanner scnew = new Scanner(System.in);

			System.out.println("enter the name");
			String sname = scnew.nextLine();

			System.out.println("enter the address");
			String address = scnew.next();

			System.out.println("Update Educational Wallet");
			int balance1 = scnew.nextInt();
			
			int balance = s2.getViewBalance()+ balance1;
			//int balance = samt1 + balance1;

			s2.setName(sname);
			s2.setAddress(address);
			s2.setViewBalance(balance);

			list.set(index1, s2);
			System.out.println("=============================================================");

			System.out.println("Student Details updated!!");
		} else {
			System.out.println("Id does not exist!!");
		}
		System.out.println("=============================================================");

	}

	public void deleteStudent() throws NumberFormatException, IOException {
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter  id :");
		int id = sc3.nextInt();
		int index = 0, flag = 0;
		Student s = null;

		for (Student s1 : list) {
			if (id == s1.getId()) {
				flag++;
				index = list.indexOf(s1);
				s = s1;
				System.out.println(index);
				break;
			}
		}
		System.out.println("=============================================================");

		if (flag == 0) {
			System.out.println("Student Id does not exist!!");
		} else {
			list.remove(s);
			System.out.println("Student record deleted successfully!!");
		}

	}

}
