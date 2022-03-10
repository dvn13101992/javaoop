package setion10.bai1.model;

public class Employee extends Person{

	private String department;
	
	@Override
	public void salary() {
		System.out.println("Luong 25 tr");		
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	

}
