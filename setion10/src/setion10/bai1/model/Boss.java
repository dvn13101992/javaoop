package setion10.bai1.model;

public class Boss extends Person {

	private int luongTrachNhiem;

	@Override
	public void salary() {
		System.out.println("0 dong");

	}

	public int getLuongTrachNhiem() {
		return luongTrachNhiem;
	}

	public void setLuongTrachNhiem(int luongTrachNhiem) {
		this.luongTrachNhiem = luongTrachNhiem;
	}

}
