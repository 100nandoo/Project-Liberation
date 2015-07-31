public class Status {
	private String Name;
	private int maxHP;
	private int HP;
	private int Att;
	private int Def;
	private int Lv;


	//-----------Constructor----------
	public Status() {
		this.Name = "Name";
		this.maxHP = 5;
		this.HP = 5;
		this.Att = 1;
		this.Def = 0;
	}

	public Status(String Name){
		this.Name = Name;
		this.HP = 5;
		this.Att = 1;
		this.Def = 1;
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
	public String getName() {
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
		System.out.println("-Att	= " + Att + "	    -");
		System.out.println("-Def 	= " + Def + "	    -");
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
	public int getatt(){
		return Att;
	}

	//---------------Setter--------------
	public void setatt(int newAtt){
		Att = newAtt;
	}

	//--------------Getter---------------
	public int getDef(){
		return Def;
	}

	//---------------Setter--------------
	public void setDef(int newDef){
		Def = newDef;
	}

}