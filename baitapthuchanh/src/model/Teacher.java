package model;

import java.io.Serializable;

public class Teacher extends Person implements Serializable{
	private String deparment;

	public String getDeparment() {
		return deparment;
	}

	public void setDeparment(String deparment) {
		this.deparment = deparment;
	}

	

}
