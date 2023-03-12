package UI;

import java.io.IOException;
import java.util.Scanner;

//import bean.Employee;
import ServicesImplementation.StudentImplementation;

public class StudentMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		String strnew;
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("*************************************************************");
		System.out.println("                    Student Management System                ");
		System.out.println("=============================================================");

		StudentImplementation e = new StudentImplementation();
		do {
			System.out.println("1.System information");
			System.out.println("2.Display Student");
			System.out.println("3.Add Student");
			System.out.println("4.Update Student");
			System.out.println("5.Delete Student");
			System.out.println("6.Exit Program");
			System.out.println("=============================================================");

			System.out.println("Enter the choice :");
			int choice = sc1.nextInt();
			switch (choice) {
			case 1:

				System.out.println("::::::::::: WELCOME TO STUDENT MANAGEMENT SYSTEM :::::::::::");

				System.out.println("=============================================================");
				System.out.println("\n* System Objective :=\n");
				System.out.println(
						"> This system helps to add student details like student id,student \n name,student address,which student enrolled which course.");
				System.out.println("> Our system provides payment facility to purchases the particular \n course.");
				System.out.println(
						"> It provides feature like you can add money in educationalwallet \n and when you will purchase the course then automatically money \n will deposite into your educationalwallet and \n also shows the balance of your educational wallet\n");
				System.out.println("=============================================================");

				break;

			case 2:

				e.displayStudents();
				break;

			case 3:

				e.addStudent();
				break;

			case 4:

				e.updateStudent();
				break;

			case 5:

				e.deleteStudent();
				break;

			case 6:

				System.out.println("\nThank you for using the program !\n");
				System.exit(0);
				break;

			default:

				// Print statement
				System.out.println("Invalid input");
				break;

			}
			System.out.println("\ndo you want to continue? (yes/no)");
			strnew = sc2.next();
			System.out.println("=============================================================0");

		} while (strnew.equals("yes"));

	}

}
