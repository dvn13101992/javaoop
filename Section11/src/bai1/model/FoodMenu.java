package bai1.model;

public enum FoodMenu {
	CAFE(1,"Cafe"), MILK_TEA(2,"Milk tea");
	
	private int id;
	private String name;
	
	private FoodMenu(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
}
