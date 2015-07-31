public abstract class Item {

	private String name;
	private int price;
	public abstract void effect(Character p1);
	//-----------Constructor----------
	public Item() {
		this.setName("default_name");
		this.price = 1;
	}
	
	
	//--------------Getter---------------
	public String getName() {
		return name;
	}
	
	//---------------Setter--------------
	public void setName(String name) {
		this.name = name;
	}

}