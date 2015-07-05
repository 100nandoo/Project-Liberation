/**
   Author	: Fernando Fransisko H
   NIM		: 00000001492
   Created	: 12:26:58 AM, Jul 5, 2015
 */

public class Status {
	private String Name;
	private int maxHP;
	private int HP;
	private int maxMP;
	private int MP;
	private int Att;
	private int Def;
	private int Spd;
	private int Lv;
	//-----------Constructor----------
	public Status() {
		this.Name = "Name";
		this.maxHP = 5;
		this.HP = 5;
		this.maxMP = 0;
		this.MP = 0;
		this.Att = 1;
		this.Def = 0;
		this.Spd = 0;
	}
	
	public Status(String Name){
		this.Name = Name;
		this.HP = 5;
		this.MP = 0;
		this.Att = 1;
		this.Def = 0;
		this.Spd = 0;
	}
	
	//--------------Getter---------------
	public int getHP() {
		return HP;
	}
	
	//---------------Setter--------------
	public void setHP(int hP) {
		HP = hP;
	}
	
	//--------------Getter---------------
	public String geName() {
		return Name;
	}
	
	//---------------Setter--------------
	public void setName(String Name) {
		this.Name = Name;
	}

	public void print(){
		System.out.println("-----Status------");
		System.out.println("-Name 	= " + Name + "	-");
		System.out.println("-HP 	= " + HP + "/" + maxHP + "	-");
		System.out.println("-MP	= " + MP + "/" + maxMP + "	-");
		System.out.println("-Att	= " + Att + "	-");
		System.out.println("-Def 	= " + Def + "	-");
		System.out.println("-Spd 	= " + Spd + "	-");
		System.out.println("-----------------");
	}

	
	//--------------Getter---------------
	public int getMaxHP() {
		return maxHP;
	}

	
	//---------------Setter--------------
	public void setMaxHP(int maxHP) {
		this.maxHP = maxHP;
	}

	
	//--------------Getter---------------
	public int getMaxMP() {
		return maxMP;
	}

	
	//---------------Setter--------------
	public void setMaxMP(int maxMP) {
		this.maxMP = maxMP;
	}
}
