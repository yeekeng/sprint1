package studentbooking;

import java.util.ArrayList;

public class Student {
	private int studentID;
	private String studentName;
	private String studentNumber;
	
	
	
	public Student(int studentID, String studentName, String studentNumber) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentNumber = studentNumber;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	


}
