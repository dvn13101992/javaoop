package section14.bai1;

public class main {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("Dang Van Nghia");
		p1.setAge(23);
		p1.setId(1);
	
		Person p2 = new Person();
		p2.setName("Dinh Van Phuc");
		p2.setAge(24);
		p2.setId(2);
		
		System.out.println(p1.equals(p2));
	}
	
	
}
