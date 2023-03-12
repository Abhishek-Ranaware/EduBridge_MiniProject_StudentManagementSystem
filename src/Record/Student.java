package Record;

import java.util.ArrayList;

public class Student {

	private int id;
	private String name;
	private String address;
    private int enrollCourseNo;
	private int payCourse;
	private int viewBalance;

	public Student() {

	}

	public Student(int id, String name, String address, int enrollCourseNo, int payCourse, int viewBalance) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;

		this.enrollCourseNo = enrollCourseNo;
		this.payCourse = payCourse;
		this.viewBalance = viewBalance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String addres) {
		this.address = addres;
	}

	public int getEnrollCourseNo() {
		return enrollCourseNo;
	}

	public void setEnrollCourseNo(int enrollCourseNo) {
		this.enrollCourseNo = enrollCourseNo;
	}

	public int getPayCourse() {
		return payCourse;
	}

	public void setPayCourse(int payCourse) {
		this.payCourse = payCourse;
	}

	public int getViewBalance() {
		return viewBalance;
	}

	public void setViewBalance(int viewBalance) {
		this.viewBalance = viewBalance;
	}

	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", enrollCourseNo=" + enrollCourseNo
				+ ", payCourse=" + payCourse + ", viewBalance=" + viewBalance + "]";
	}

}
