package section14.bai1;

public class Person {
	private int id;
	private String name;
	private int age;
	
	@Override
	public boolean equals(Object obj) {
		Person p = (Person) obj;
		
		return p.age == this.age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
