/**
   Author	: Fernando Fransisko H
   NIM		: 00000001492
   Created	: 12:49:51 AM, Jul 5, 2015
 */

public class Character extends Status {

	private int chrm;
	private int money;
	private int position;
	//-----------Constructor----------
	public Character() {
		super();
		this.money = 100;
		this.position = 1;
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
		System.out.println("-----------------");
	}
}
