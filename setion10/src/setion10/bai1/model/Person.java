package setion10.bai1.model;

public abstract class Person {
	private String name;
	private int age;

	public abstract void salary();

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

}
