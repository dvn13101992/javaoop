package model;

import java.io.Serializable;

public class Student extends Person implements Serializable{
	private String studentCode;

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	
	
	
	
}
