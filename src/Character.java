public class Character extends Status {

	private int chrm;
	private int money;
	private int position;
	private int exp;
	private int maxExp;
	private int lvl;
	//-----------Constructor----------
	public Character() {
		super();
		this.money = 100;
		this.position = 1;
		this.setMaxExp(100);
		this.exp = 0;
		this.exp = 1;
	}
	
	//--------------Getter---------------
	public int getChrm() {
		return chrm;
	}
	
	
	//---------------Setter--------------
	public void setChrm(int chrm) {
		this.chrm = chrm;
	}

	
	//--------------Getter---------------
	public int getMoney() {
		return money;
	}

	
	//---------------Setter--------------
	public void setMoney(int money) {
		this.money = money;
	}

	
	//--------------Getter---------------
	public int getPosition() {
		return position;
	}

	
	//---------------Setter--------------
	public void setPosition(int position) {
		this.position = position;
	}

	public void print(){
		super.print();
		System.out.println("Chrm	= " + chrm + "	-");
		System.out.println("Position= " + position + "	-");
		System.out.println("Money	= " + money + "$" + "	-");
		System.out.println("Exp     = " + exp + "/" + maxExp);
		System.out.println("-----------------");
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getMaxExp() {
		return maxExp;
	}

	public void setMaxExp(int maxExp) {
		this.maxExp = maxExp;
	}
	
}
